package com.example.giwangnuelsyaputri.cobarecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<RVModel> listTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(RVData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        RVAdapter rvAdapter = new RVAdapter(this);
        rvAdapter.setRvList(listTeam);

        rvTeam.setAdapter(rvAdapter);
    }
}
