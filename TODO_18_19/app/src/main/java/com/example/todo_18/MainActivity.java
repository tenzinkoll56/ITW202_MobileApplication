package com.example.todo_18;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private ArrayList<Sport> mSportData;
    private SportsAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);



        mRecycleView.setLayoutManager(new LinearLayoutManager(this));

        mSportData = new ArrayList<>();

        mAdapter = new SportsAdapter(this, mSportData);
        mRecycleView.setAdapter(mAdapter);

        initializeData();

    }

    private void initializeData() {
        TypedArray sportsImageResources = getResources().obtainTypedArray(R.array.sports_images);
        String[] sportsList = getResources().getStringArray(R.array.sports_titles);
        String[] sportsInfo = getResources().getStringArray(R.array.sports_info);

        mSportData.clear();


        for(int i=0;i<sportsList.length;i++){
            mSportData.add(new Sport(sportsList[i],sportsInfo[i],sportsImageResources.getResourceId(i, 0)));
        }

        sportsImageResources.recycle();


        mAdapter.notifyDataSetChanged();
    }
}