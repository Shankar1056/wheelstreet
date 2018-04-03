package com.bigappcompany.wheelstreet.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shankar on 3/4/18.
 */

public class ResponseModelData {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @SerializedName("id")
    String id;
    @SerializedName("question")
    String question;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @SerializedName("answer")
    String answer;
    @SerializedName("dataType")
    String dataType;
}
