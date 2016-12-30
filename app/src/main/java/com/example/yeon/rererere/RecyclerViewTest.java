package com.example.yeon.rererere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewTest extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    //    ArrayList<String> listItem;
    ArrayList<Item> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_test);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItem = new ArrayList<>();
        listItem.add(new Item("Newyork", "USA", "fasdfasdf"));
        listItem.add(new Item("BOSTON", "USA", "fasdfasdf"));
        listItem.add(new Item("SEOUL", "KOREA", "fasdfasdf"));
        listItem.add(new Item("TOKYO", "JAPAN", "fasdfasdf"));
        listItem.add(new Item("BEIJING", "CHINA", "fasdfasdf"));
        listItem.add(new Item("HSIHO1", "RUSSIA", "fasdfasdf"));
        listItem.add(new Item("1123", "RUSSIA", "fasdfasdf"));
        listItem.add(new Item("OOJOJOJO", "RUSSIA", "fasdfasdf"));
//        listItem.add("1111");
//        listItem.add("2222");
//        listItem.add("3333");
//        listItem.add("4444");
//        listItem.add("5555");
//        listItem.add("6666");
//        listItem.add("7777");
//        listItem.add("8888");
//        listItem.add("9999");
//        listItem.add("1010");

        recyclerAdapter = new RecyclerAdapter(listItem, getApplicationContext());

        recyclerAdapter.setAdapterItemList(listItem);

        recyclerView.setAdapter(recyclerAdapter);


    }
}
