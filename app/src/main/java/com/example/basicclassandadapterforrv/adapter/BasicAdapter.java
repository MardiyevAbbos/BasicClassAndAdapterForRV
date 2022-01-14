package com.example.basicclassandadapterforrv.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basicclassandadapterforrv.network.BaseServer;

public class BasicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements BaseServer {


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    protected String getServer() {
        if (IS_TESTER) {
            return SERVER_DEVELOPMENT;
        } else {
            return SERVER_DEPLOYMENT;
        }
    }


    protected static boolean isEmpty(final String s) {
        // Null-safe, short-circuit evaluation.
        return s == null || s.trim().isEmpty();
    }


}
