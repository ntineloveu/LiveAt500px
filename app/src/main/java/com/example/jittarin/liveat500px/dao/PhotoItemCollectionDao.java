package com.example.jittarin.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jittarin on 8/20/2017.
 */

public class PhotoItemCollectionDao {

    @SerializedName("success")  private boolean success;
    @SerializedName("data")     private List<PhotoItemDao> data = new ArrayList<>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<PhotoItemDao> getData() {
        return data;
    }

    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }

}
