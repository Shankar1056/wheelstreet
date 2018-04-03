package com.bigappcompany.wheelstreet.retrofitnetwork;


import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bigappcompany.wheelstreet.model.CreateJsonArrayToSend;
import com.bigappcompany.wheelstreet.model.DataSaveResponse;
import com.bigappcompany.wheelstreet.model.ResponseModel;
import com.bigappcompany.wheelstreet.utilz.ConsantValue;


import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitDataProvider extends AppCompatActivity implements ServiceMethods {

    private ApiRetrofitService createRetrofitService() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConsantValue.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiRetrofitService.class);

    }


    @Override
    public void getData(final DownlodableCallback<ResponseModel> callback) {
        createRetrofitService().getServerData().enqueue(
                new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(@NonNull Call<ResponseModel> call, @NonNull final Response<ResponseModel> response) {
                        if (response.isSuccessful()) {

                            ResponseModel responseModel = response.body();
                            callback.onSuccess(responseModel);

                        } else

                        {

                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<ResponseModel> call, @NonNull Throwable t) {
                        Log.d("Result", "t" + t.getMessage());
                        callback.onFailure(t.getMessage());

                    }
                }
        );

    }

    @Override
    public void savedataToServer(CreateJsonArrayToSend createJsonArrayToSend, final DownlodableCallback<DataSaveResponse> callback) {
        createRetrofitService().saveResponse(createJsonArrayToSend).enqueue( new Callback<DataSaveResponse>() {
                    @Override
                    public void onResponse(@NonNull Call<DataSaveResponse> call, @NonNull final Response<DataSaveResponse> response) {
                        if (response.isSuccessful()) {

                            DataSaveResponse responseModel = response.body();
                            callback.onSuccess(responseModel);

                        } else

                        {

                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<DataSaveResponse> call, @NonNull Throwable t) {
                        Log.d("Result", "t" + t.getMessage());
                        callback.onFailure(t.getMessage());

                    }
                }
        );
    }



}
