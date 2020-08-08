package com.example.covid_dataset.repo;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.covid_dataset.model.Data;
import com.example.covid_dataset.utils.ApiInterface;
import com.example.covid_dataset.utils.RetrofitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class DataRepo {
    private final String TAG = DataRepo.class.getSimpleName();
    private ApiInterface apiInterface;

    public DataRepo() {
        apiInterface = RetrofitRequest.getRetrofitInstance().create(ApiInterface.class);
    }

    public LiveData<Data> getData(Context context) {
        final MutableLiveData<Data> data = new MutableLiveData<>();
        apiInterface.getList().enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                data.setValue(response.body());
                Log.d(TAG, "DATA RECEIVED");
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                data.setValue(null);
                Log.e(TAG, t.getMessage());
            }
        });

        return data;

    }
}