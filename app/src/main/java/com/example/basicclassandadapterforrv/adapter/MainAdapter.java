package com.example.basicclassandadapterforrv.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basicclassandadapterforrv.R;
import com.example.basicclassandadapterforrv.activity.MainActivity;
import com.example.basicclassandadapterforrv.model.Member;

import java.util.ArrayList;

public class MainAdapter extends BasicAdapter {

    private MainActivity activity;
    private ArrayList<Member> members;

    public MainAdapter(MainActivity activity, ArrayList<Member> members) {
        this.activity = activity;
        this.members = members;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_layout_main, parent, false);
        return new MainViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);

        if (holder instanceof MainViewHolder) {
            ImageView imageView = ((MainViewHolder) holder).image;
            TextView firstName = ((MainViewHolder) holder).firstName;
            TextView lastName = ((MainViewHolder) holder).lastName;
            LinearLayout layout = ((MainViewHolder) holder).layout;

            imageView.setImageResource(member.getImage());
            firstName.setText(member.getFirstName());
            lastName.setText(member.getLastName());

            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.openDetailsActivity();
                }
            });
        }

    }


    public class MainViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView image;
        public TextView firstName;
        public TextView lastName;
        public LinearLayout layout;

        public MainViewHolder(View v) {
            super(v);
            this.view = v;
            image = view.findViewById(R.id.image_main);
            firstName = view.findViewById(R.id.first_name_main);
            lastName = view.findViewById(R.id.last_name_main);
            layout = view.findViewById(R.id.ll_main_listener);
        }
    }


}
