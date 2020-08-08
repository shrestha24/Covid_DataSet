package com.example.covid_dataset.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRequest {
    private static final String BASE_URL="https://api.covid19india.org";
    private static Retrofit retrofit;
    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().
                      baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).
                      build();
        }
        return retrofit;
    }
}
