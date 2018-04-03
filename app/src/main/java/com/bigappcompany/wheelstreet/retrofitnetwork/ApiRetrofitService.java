package com.bigappcompany.wheelstreet.retrofitnetwork;

import com.bigappcompany.wheelstreet.model.CreateJsonArrayToSend;
import com.bigappcompany.wheelstreet.model.DataSaveResponse;
import com.bigappcompany.wheelstreet.model.ResponseModel;
import com.bigappcompany.wheelstreet.utilz.ConsantValue;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface ApiRetrofitService {


    @GET(ConsantValue.GETQUESTION)
    Call<ResponseModel> getServerData();

    @POST(ConsantValue.ANSWERS)
    Call<DataSaveResponse> saveResponse(@Body CreateJsonArrayToSend createJsonArrayToSend);



}
