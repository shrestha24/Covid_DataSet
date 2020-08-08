package com.example.covid_dataset.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.covid_dataset.R;
import com.example.covid_dataset.model.Data;
import com.example.covid_dataset.viewModel.MainActivityviewModel;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private MainActivityviewModel mainActivityviewModel;
    Data mData;
    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainActivityviewModel = ViewModelProviders.of(this).get(MainActivityviewModel.class);


        mainActivityviewModel.getData().observe(this, new Observer<Data>() {
            @Override
            public void onChanged(Data data) {
                mData = data;
                List<Data.StatewiseBean> list = mData.getStatewise();
                for (Data.StatewiseBean obj : list
                     ) {

                    if( obj.getState().equals("Total")){

                        text.setText(obj.getConfirmed());

                    }
                }

            }
        });
    }
}