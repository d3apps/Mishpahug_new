package com.dennisdavydov.mishpahug.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dennisdavydov.mishpahug.Adapters.EventsRecyclerViewAdapter;
import com.dennisdavydov.mishpahug.App;
import com.dennisdavydov.mishpahug.R;
import com.dennisdavydov.mishpahug.models.Event;
import com.dennisdavydov.mishpahug.models.EventsDescription;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

////////////////////////////////////////////////////////////////////////////////////////////////
public class EventListFragment extends Fragment {

    boolean isAdapterSet=false;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    List<Event>events;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    EventsRecyclerViewAdapter adapter;
    TextView errorTextView;
///
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
/////////////////////////////////////////////////////////////////////////////////
    public EventListFragment() {
        // Required empty public constructor
    }
/////////////////////////////////////////////////////////////////////////////////

    // TODO: Rename and change types and number of parameters
    public static EventListFragment newInstance(String param1, String param2) {
        EventListFragment fragment = new EventListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
///////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
///////////////////////////////////////////////////////////////////////////////////
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_event_list, container, false);
    }
/////////////////////////////////////////////////////////////////////////////////////
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
//////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
 ///////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
 //////////////////////////////////////////////////////////////////////////////////
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
 /////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerview_id);
        errorTextView = view.findViewById(R.id.errorTextWiew);
        //LinearLayoutManager mLayoutManager = new LinearLayoutManager(view.getContext());
        //recyclerView.setLayoutManager(mLayoutManager);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(view.getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);

        DividerItemDecoration mDecoration=
                new DividerItemDecoration(view.getContext(),DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(mDecoration);
        events=new ArrayList<>();


        getEvent();

    }


    //////////////////////////////////////////////////////////////////////////

    private void getEvent(){
        App.getProvider().getEvent().enqueue(new Callback<EventsDescription>() {
            @Override
            public void onResponse(Call<EventsDescription> call, Response<EventsDescription> response) {

                if (response.body() != null) {
                    events.addAll(response.body().getEvents());

                    if(!isAdapterSet){
                        adapter=new EventsRecyclerViewAdapter(events);
                        recyclerView.setAdapter(adapter);
                        isAdapterSet=true;
                    }

                    adapter.notifyDataSetChanged();

                   // int mPage=curPage;
                    Log.d("TAG",response.body() + " pages total");
//                    if ( mPage<response.body().getTotalElements()/curSize){
//                        mPage++;
//                        getEvent(mPage,curSize);
//
//                    }
                } else {
                    recyclerView.setVisibility(View.GONE);
                    errorTextView.setVisibility(View.VISIBLE);
                    errorTextView.setText(R.string.serverError);
                }



                }

            @Override
            public void onFailure(Call<EventsDescription> call, Throwable t) {
                t.fillInStackTrace();

            }


        });

    }


}
///