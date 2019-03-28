package com.dennisdavydov.mishpahug.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dennisdavydov.mishpahug.R;
import com.dennisdavydov.mishpahug.models.EventModel;

import java.util.List;
//////////////////////////////////////////////////////////////////////////////////////////////
public class EventsRecyclerViewAdapter extends
        RecyclerView.Adapter<EventsRecyclerViewAdapter.EventsViewHolder> {

    private List<EventModel>events;
///////////////////////////////////////////////////////////////////////////////////////////
    public class EventsViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView holiday;
        TextView date;

        public EventsViewHolder(View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.event_title);
            holiday=itemView.findViewById(R.id.holiday);
            date=itemView.findViewById(R.id.date);
        }
    }
///////////////////////////////////////////////////////////////////////////////////////
    public EventsRecyclerViewAdapter(List<EventModel>events)
    {
        this.events=events;
    }
//////////////////////////////////////////////////////////////////////////////////////


    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_event_list,viewGroup,false);
        EventsViewHolder viewHolder=new EventsViewHolder(view);
        return viewHolder;
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder viewHolder, int position) {
        EventModel currentEvent=events.get(position);
        viewHolder.title.setText(currentEvent.getTitle());
        viewHolder.holiday.setText(currentEvent.getHoliday());
        viewHolder.date.setText(currentEvent.getDate());
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public int getItemCount() {
        return events.size();
    }

}























