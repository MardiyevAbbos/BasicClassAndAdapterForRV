package com.example.basicclassandadapterforrv.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basicclassandadapterforrv.R;
import com.example.basicclassandadapterforrv.activity.DetailsActivity;
import com.example.basicclassandadapterforrv.model.Member;

import java.util.ArrayList;

public class DetailsAdapter extends BasicAdapter{

    private DetailsActivity activity;
    private ArrayList<Member> members;

    public DetailsAdapter(DetailsActivity activity, ArrayList<Member> members) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_details, parent, false);
        return new DetailsViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);

        if (holder instanceof DetailsViewHolder){
            ImageView imageView = ((DetailsViewHolder)holder).image;
            TextView firstName = ((DetailsViewHolder)holder).firstName;
            TextView lastName = ((DetailsViewHolder)holder).lastName;

            imageView.setImageResource(member.getImage());
            firstName.setText(member.getFirstName());
            lastName.setText(member.getLastName());
        }
    }

    class DetailsViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public ImageView image;
        public TextView firstName;
        public TextView lastName;

        public DetailsViewHolder(View v){
            super(v);
            this.view = v;
            image = view.findViewById(R.id.image_details);
            firstName = view.findViewById(R.id.first_name_details);
            lastName = view.findViewById(R.id.last_name_details);
        }

    }


}
