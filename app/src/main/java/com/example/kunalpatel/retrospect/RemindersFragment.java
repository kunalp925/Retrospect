package com.example.kunalpatel.retrospect;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RemindersFragment extends Fragment {
    private RecyclerView RemindersRecycler;
    private RecyclerView.Adapter RemindersAdapter;
    private RecyclerView.LayoutManager RemindersManager;

    public RemindersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reminders, container, false);

        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RemindersRecycler = (RecyclerView) getActivity().findViewById(R.id.RemindersRecycler);

        RemindersManager = new LinearLayoutManager(getActivity());
        RemindersRecycler.setLayoutManager(RemindersManager);

        RemindersAdapter = new RemindersAdapter();
        RemindersRecycler.setAdapter(RemindersAdapter);
    }

}
