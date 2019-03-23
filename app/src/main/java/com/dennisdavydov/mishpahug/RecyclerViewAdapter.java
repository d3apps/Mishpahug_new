package com.dennisdavydov.mishpahug;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dennisdavydov.mishpahug.fragments.EventInfoPage;
import com.dennisdavydov.mishpahug.models.EventModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext ;
    private List<EventModel> mData ;

    public RecyclerViewAdapter(Context mContext, List<EventModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.cardview_event_list,viewGroup,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.eventTitle.setText(mData.get(i).getTitle());
        myViewHolder.holiday.setText(mData.get(i).getHoliday());
        myViewHolder.date.setText(mData.get(i).getDate());
       // myViewHolder.familyPicture.setImageResource(mData.get(i).);
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, EventInfoPage.class);
                //intent putExtra
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView eventTitle;
        TextView holiday;
        TextView date;
        //ImageView familyPicture;
        CardView cardView ;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            eventTitle=itemView.findViewById(R.id.event_title);
            holiday=itemView.findViewById(R.id.holiday);
            date=itemView.findViewById(R.id.date);
            cardView=itemView.findViewById(R.id.cardview_id);
        }
    }
}