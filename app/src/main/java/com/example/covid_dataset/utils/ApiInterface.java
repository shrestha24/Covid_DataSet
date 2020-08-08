package com.example.covid_dataset.utils;

import com.example.covid_dataset.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

   @GET("/data.json")
    Call<Data> getList();
}
