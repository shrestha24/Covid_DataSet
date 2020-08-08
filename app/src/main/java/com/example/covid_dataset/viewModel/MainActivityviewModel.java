package com.example.covid_dataset.viewModel;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.covid_dataset.model.Data;
import com.example.covid_dataset.repo.DataRepo;
import com.example.covid_dataset.view.MainActivity;

public class MainActivityviewModel extends AndroidViewModel {
    private String TAG = MainActivityviewModel.class.getSimpleName();
    private Context context;
    private DataRepo dataRepo;
    private LiveData<Data> mData;

    public MainActivityviewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
        dataRepo=new DataRepo();
        mData = dataRepo.getData(context);

    }
    public LiveData<Data> getData(){
        this.mData=dataRepo.getData(context);
        return mData;
    }
}
