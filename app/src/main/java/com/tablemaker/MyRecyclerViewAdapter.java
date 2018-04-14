package com.tablemaker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<MemberDTO> memberDTOs = new ArrayList<>();
    public MyRecyclerViewAdapter(){
        

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((RowCell)holder).imageView.setImageResource(memberDTOs.get(position).getImage());
        ((RowCell)holder).name.setText(memberDTOs.get(position).getName());
        ((RowCell)holder).heartRating.setText(Double.toString(memberDTOs.get(position).getHeartRating()));
        ((RowCell)holder).distance.setText(Double.toString(memberDTOs.get(position).getDistance()));

    }

    @Override
    public int getItemCount() {
        return memberDTOs.size();
    }

    private static class RowCell extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        TextView heartRating;
        TextView distance;
        public RowCell(View view) {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.placeholder);
            name = (TextView)view.findViewById(R.id.name);
            heartRating = (TextView)view.findViewById(R.id.heart_rate);
            distance = (TextView)view.findViewById(R.id.distance);
        }
    }
}
