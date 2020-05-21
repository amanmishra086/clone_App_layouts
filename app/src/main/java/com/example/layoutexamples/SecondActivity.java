package com.example.layoutexamples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {



    RecyclerView recyclerView;

    RecyclerViewAdapter recyclerViewAdapter;

    ArrayList<cardmodel> cardModelArrayList;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        CurvedBottomNavigationView customBottomNavigationView1 = findViewById(R.id.nav_id);




        cardModelArrayList = new ArrayList<>();



        recyclerView = findViewById(R.id.recyclerview_id);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));





        cardModelArrayList.add(new cardmodel("Tokyo", "Tokyo wants to chat. Say hi!!", "10:56 am", R.drawable.cl10));

        cardModelArrayList.add(new cardmodel("Denever", "Denever wants to  chat. Say hi!!", "10:56 am", R.drawable.cl10));

        cardModelArrayList.add(new cardmodel("Helsinki", "Helsinki wants to  chat. Say hi!!", "04/05/20", R.drawable.cl10));

        cardModelArrayList.add(new cardmodel("Berlin", "Berlin wants to  chat. Say hi!!", "03/05/20", R.drawable.cl10));





        recyclerViewAdapter = new RecyclerViewAdapter(this, cardModelArrayList);

        recyclerView.setAdapter(recyclerViewAdapter);








    }
}
