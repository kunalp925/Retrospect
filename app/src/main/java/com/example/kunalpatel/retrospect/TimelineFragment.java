package com.example.kunalpatel.retrospect;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimelineFragment extends Fragment {
    private RecyclerView TimelineRecycler;
    private RecyclerView.Adapter TimelineAdapter;
    private RecyclerView.LayoutManager TimelineManager;
    private FloatingActionButton timelineFAB;


    public TimelineFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timeline, container, false);
        timelineFAB = (FloatingActionButton) view.findViewById(R.id.timelineFAB);

        timelineFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateTimelineEvent createTimelineEvent = new CreateTimelineEvent();
                openFragment(createTimelineEvent);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TimelineRecycler = (RecyclerView) getActivity().findViewById(R.id.TimelineRecycler);

        TimelineManager = new LinearLayoutManager(getActivity());
        TimelineRecycler.setLayoutManager(TimelineManager);

        TimelineAdapter = new TimelineAdapter();
        TimelineRecycler.setAdapter(TimelineAdapter);
        TimelineRecycler.getRecycledViewPool().setMaxRecycledViews(0,0);
    }
    private void openFragment(Fragment fragment){

        FragmentManager fragmentManager2 = getFragmentManager();
        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
        fragmentTransaction2.replace(R.id.container, fragment);
        fragmentTransaction2.commit();


    }
}
