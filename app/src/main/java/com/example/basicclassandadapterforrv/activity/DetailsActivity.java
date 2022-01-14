package com.example.basicclassandadapterforrv.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.basicclassandadapterforrv.R;
import com.example.basicclassandadapterforrv.adapter.DetailsAdapter;
import com.example.basicclassandadapterforrv.model.Member;

import java.util.ArrayList;

public class DetailsActivity extends BaseActivity {

    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initViews();

        ArrayList<Member> members = prepareMemberDetailsList();
        refreshAdapter(members);

    }

    private void initViews() {
        context = this;
        recyclerView = findViewById(R.id.rv_details);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }


    private void refreshAdapter(ArrayList<Member> members) {
        DetailsAdapter adapter = new DetailsAdapter((DetailsActivity) context, members);
        recyclerView.setAdapter(adapter);
    }


}