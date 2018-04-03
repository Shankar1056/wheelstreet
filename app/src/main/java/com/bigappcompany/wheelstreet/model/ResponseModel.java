package com.bigappcompany.wheelstreet.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by shankar on 3/4/18.
 */

public class ResponseModel {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<ResponseModelData> getData() {
        return data;
    }

    public void setData(ArrayList<ResponseModelData> data) {
        this.data = data;
    }

    @SerializedName("status")
    String status;
    @SerializedName("data")
    ArrayList<ResponseModelData> data;
}
