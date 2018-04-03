package com.bigappcompany.wheelstreet.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bigappcompany.wheelstreet.R;
import com.bigappcompany.wheelstreet.adapter.QuestionListAdapter;
import com.bigappcompany.wheelstreet.model.ResponseModel;
import com.bigappcompany.wheelstreet.retrofitnetwork.DownlodableCallback;
import com.bigappcompany.wheelstreet.retrofitnetwork.RetrofitDataProvider;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by shankar on 3/4/18.
 */

public class ShowFormFragment extends Fragment {
    @BindView(R.id.rv_form)
    RecyclerView rv_form;

    private RetrofitDataProvider retrofitDataProvider;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(getActivity(),view);
       return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_form.setLayoutManager(new LinearLayoutManager(getActivity()));
        retrofitDataProvider = new RetrofitDataProvider();
        callApi();

    }

    private void callApi() {
        retrofitDataProvider.getData(new DownlodableCallback<ResponseModel>() {
            @Override
            public void onSuccess(final ResponseModel result) {

                if (result.getStatus().contains("1")) {

                    rv_form.setAdapter(new QuestionListAdapter(getActivity(), result.getData(), R.layout.from_row));

                } else {
                }

            }

            @Override
            public void onFailure(String error) {
                closeDialog();
            }

        });
    }
    static ProgressDialog dialog;
    public static void showDailog(Context c, String msg) {
        dialog = new ProgressDialog(c);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setMessage(msg);
        dialog.show();
    }

    public static void closeDialog() {
        if (dialog != null)
            dialog.cancel();
    }
}
