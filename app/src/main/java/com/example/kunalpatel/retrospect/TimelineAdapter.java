package com.example.kunalpatel.retrospect;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kunalpatel on 7/3/18.
 */

public class TimelineAdapter extends RecyclerView.Adapter {



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_card, parent, false);
        return new TimelineListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((TimelineListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        TimelineData data = new TimelineData();
        return data.getSize();
    }

    private class TimelineListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title;
        private TextView time;
        private TextView details;
        private TextView date;
        private TextView today;

        public TimelineListViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.TimelineTitle);
            title.setTextColor(Color.parseColor("#000000"));
            time = (TextView) itemView.findViewById(R.id.TimelineTime);
            time.setTextColor(Color.parseColor("#000000"));
            details = (TextView) itemView.findViewById(R.id.TimelineDeets);
            details.setTextColor(Color.parseColor("#000000"));
            date = (TextView)  itemView.findViewById(R.id.TimelineDate);
            date.setTextColor(Color.parseColor("#000000"));
            today = (TextView) itemView.findViewById(R.id.TimelineToday);
            today.setTextColor(Color.parseColor("#000000"));
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            Date compareDate = Calendar.getInstance().getTime();
            int day = 0;
            SimpleDateFormat df = new SimpleDateFormat("d");
            TimelineData data = new TimelineData();
            day = Integer.parseInt(df.format(data.getDate(position))) + 1;
            String numDay = Integer.toString(day);
            df = new SimpleDateFormat("EEEE, MMMM");
            String newDate = df.format(data.getDate(position)) + " " + numDay;

            df = new SimpleDateFormat("EEEE, MMMM d");

            if(!(df.format(compareDate).equals(newDate))){
                today.setVisibility(View.GONE);
            }

            if(position != 0){
                Date prevdate = data.getDate(position-1);
                df = new SimpleDateFormat("d");
                day = Integer.parseInt(df.format(data.getDate(position))) + 1;
                numDay = Integer.toString(day);
                df = new SimpleDateFormat("EEEE, MMMM");
                String pdate = df.format(data.getDate(position-1)) + " " + numDay;
                if(pdate.equals(newDate)){
                    date.setVisibility(View.GONE);
                }
            }


            title.setText(data.getTitle(position));
            String reportloc;
            reportloc = data.getLocation(position);

            reportloc += " - ";



            Date deets = data.getDate(position);


            df = new SimpleDateFormat("H:mm" );
            reportloc += df.format(deets);
            reportloc += "PM";


            date.setText(newDate);
            time.setText(reportloc);

            details.setText("Details for event will be displayed here. " +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                    "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                    "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
                    "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        }

        @Override
        public void onClick(View v) {

        }
    }
}
