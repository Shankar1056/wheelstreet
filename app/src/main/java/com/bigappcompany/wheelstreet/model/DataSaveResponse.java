package com.bigappcompany.wheelstreet.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shankar on 3/4/18.
 */

public class DataSaveResponse {

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @SerializedName("status")
    String status;
    @SerializedName("data")
    String data;
}
