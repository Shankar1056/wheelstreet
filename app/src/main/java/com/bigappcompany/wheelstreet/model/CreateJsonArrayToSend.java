package com.bigappcompany.wheelstreet.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by shankar on 3/4/18.
 */

public class CreateJsonArrayToSend {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFbUserName() {
        return fbUserName;
    }

    public void setFbUserName(String fbUserName) {
        this.fbUserName = fbUserName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<QuestionListModel> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<QuestionListModel> questions) {
        this.questions = questions;
    }

    @SerializedName("id")
    String id;
    @SerializedName("name")
    String name;
    @SerializedName("fbUserName")
    String fbUserName;
    @SerializedName("mobile")
    String mobile;
    @SerializedName("gender")
    String gender;
    @SerializedName("age")
    String age;
    @SerializedName("email")
    String email;
    @SerializedName("questions")
    ArrayList<QuestionListModel> questions;
}
