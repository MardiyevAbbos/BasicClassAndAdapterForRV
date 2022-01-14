package com.example.basicclassandadapterforrv.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basicclassandadapterforrv.R;
import com.example.basicclassandadapterforrv.adapter.MainAdapter;
import com.example.basicclassandadapterforrv.model.Member;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        ArrayList<Member> members = prepareMemberMainList();
        refreshAdapter(members);

    }

    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }


    private void refreshAdapter(ArrayList<Member> members){
        MainAdapter adapter = new MainAdapter((MainActivity) context, members);
        recyclerView.setAdapter(adapter);
    }


    public void openDetailsActivity(){
        Intent intent = new Intent(context, DetailsActivity.class);
        startActivity(intent);
    }


}