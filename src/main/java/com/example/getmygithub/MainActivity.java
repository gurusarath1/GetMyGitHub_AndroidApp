package com.example.getmygithub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView Main_RecyclerView;
    RecyclerView.LayoutManager Main_RecyclerView_layoutManager;
    RecyclerView.Adapter Main_RecyclerView_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ListElementData> dataX = new ArrayList<>();
        dataX.add(new ListElementData("Repo1", "https\\Repo1"));
        dataX.add(new ListElementData("Repo2", "https\\Repo22"));
        dataX.add(new ListElementData("Repo3", "https\\Repo333"));
        dataX.add(new ListElementData("Repo4", "https\\Repo4444"));

        Main_RecyclerView = (RecyclerView) findViewById(R.id.recyclerView_x);
        Main_RecyclerView.setHasFixedSize(true);
        Main_RecyclerView_layoutManager = new LinearLayoutManager(this);
        Main_RecyclerView_adapter = new MainViewAdapter(dataX);

        Main_RecyclerView.setLayoutManager(Main_RecyclerView_layoutManager);
        Main_RecyclerView.setAdapter(Main_RecyclerView_adapter);

    }

    public void fetch_button(View v)
    {

    }
}