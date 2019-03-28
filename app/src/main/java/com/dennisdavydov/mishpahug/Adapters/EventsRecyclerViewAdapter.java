package com.dennisdavydov.mishpahug.Adapters;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dennisdavydov.mishpahug.R;
import com.dennisdavydov.mishpahug.models.Event;

import java.util.List;
//////////////////////////////////////////////////////////////////////////////////////////////
public class EventsRecyclerViewAdapter extends
        RecyclerView.Adapter<EventsRecyclerViewAdapter.EventsViewHolder> {

    private List<Event>events;
///////////////////////////////////////////////////////////////////////////////////////////
    public class EventsViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView holiday;
        TextView date;
        ImageView eventImage;

        public EventsViewHolder(View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.event_title);
            holiday=itemView.findViewById(R.id.holiday);
            date=itemView.findViewById(R.id.date);
            eventImage=itemView.findViewById(R.id.familyImage);
        }
    }
///////////////////////////////////////////////////////////////////////////////////////
    public EventsRecyclerViewAdapter(List<Event>events)
    {
        this.events=events;
    }
//////////////////////////////////////////////////////////////////////////////////////
    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return  new EventsViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_event_list,viewGroup,false));
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder viewHolder, int position) {
        Event currentEvent=events.get(position);
        viewHolder.title.setText(currentEvent.getTitle());
        viewHolder.holiday.setText(currentEvent.getHoliday());
        viewHolder.date.setText(currentEvent.getDate());

        //viewHolder.eventImage.setImageDrawable((Drawable) currentEvent.getOwner().getPictureLink());
//        int i=0;
//        String curPictureLink= currentEvent.getOwner().getPictureLink().get(i);

//        while (!curPictureLink.contains("http://")&&curPictureLink !=null){
//            i++;
//            curPictureLink= currentEvent.getOwner().getPictureLink().get(i);
//        }

            Glide.with(viewHolder.itemView.getContext())
                    .load(currentEvent.getOwner().getPictureLink().get(2)).apply(new RequestOptions())
                    .into(viewHolder.eventImage);


    }
////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public int getItemCount() {
        return events.size();
    }

}























