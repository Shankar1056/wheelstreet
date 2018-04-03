package com.bigappcompany.wheelstreet.retrofitnetwork;


import com.bigappcompany.wheelstreet.model.CreateJsonArrayToSend;
import com.bigappcompany.wheelstreet.model.DataSaveResponse;
import com.bigappcompany.wheelstreet.model.ResponseModel;

public interface ServiceMethods {

    void getData(DownlodableCallback<ResponseModel> callback);
    void savedataToServer(CreateJsonArrayToSend createJsonArrayToSend, DownlodableCallback<DataSaveResponse> callback);

}
