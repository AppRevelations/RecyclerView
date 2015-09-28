package com.apprevelations.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<RecyclerUtils> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recList = (RecyclerView) findViewById(R.id.r_view);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recList.setLayoutManager(llm);

        myDataset = new ArrayList<RecyclerUtils>();

        for (int i = 0; i < 6; i++) {
            RecyclerUtils newoffer = new RecyclerUtils();
            switch (i%2) {
                case 0:

                    newoffer.title = "Learn how to add different type of views in RecyclerView ";
                    newoffer.subTitle = "RecyclerView type 1";
                    newoffer.type = "one";
                    break;
                case 1:
                    newoffer = new RecyclerUtils();
                    newoffer.title = "Apprevelations";
                    newoffer.subTitle = "RecyclerView type 2";
                    newoffer.type = "two";

                break;
            }

            myDataset.add(newoffer);
        }


        RecyclerAdapter mAdapter = new RecyclerAdapter(myDataset);
        recList.setAdapter(mAdapter);

    }

}
