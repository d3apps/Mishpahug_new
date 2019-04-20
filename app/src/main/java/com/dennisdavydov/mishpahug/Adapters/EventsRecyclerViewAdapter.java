package com.dennisdavydov.mishpahug.Adapters;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dennisdavydov.mishpahug.MainPage;
import com.dennisdavydov.mishpahug.R;
import com.dennisdavydov.mishpahug.models.Event;

import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

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
    CardView cardView;

        public EventsViewHolder(View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.event_title);
            holiday=itemView.findViewById(R.id.holiday);
            date=itemView.findViewById(R.id.date);
            eventImage=itemView.findViewById(R.id.familyImage);
            cardView = itemView.findViewById(R.id.cardview_id);

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
    public void onBindViewHolder(@NonNull final EventsViewHolder viewHolder, final int position) {
        Event currentEvent=events.get(position);
        viewHolder.title.setText(currentEvent.getTitle());
        viewHolder.holiday.setText(currentEvent.getHoliday());
        viewHolder.date.setText(currentEvent.getDate());
        try {
            Glide.with(viewHolder.itemView.getContext())
                    .load(currentEvent.getOwner().getPictureLink().get(1)).apply(new RequestOptions())
                    .into(viewHolder.eventImage);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            viewHolder.eventImage.setImageResource(R.mipmap.family);
        }
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "Clicked " + position + " position", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(), MainPage.class);
                i.putExtra("frgToLoad",3);
                i.putExtra("position",position);
                v.getContext().startActivity(i);
            }
        });




    }
//////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public int getItemCount() {
        return events.size();
    }

}























