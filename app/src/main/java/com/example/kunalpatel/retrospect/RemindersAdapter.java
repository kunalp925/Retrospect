package com.example.kunalpatel.retrospect;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kunalpatel on 7/25/18.
 */

public class RemindersAdapter extends RecyclerView.Adapter{
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_card, parent, false);
            return new com.example.kunalpatel.retrospect.RemindersAdapter.RemindersListViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ((com.example.kunalpatel.retrospect.RemindersAdapter.RemindersListViewHolder) holder).bindView(position);
        }

        @Override
        public int getItemCount() {
            RemindersData data = new RemindersData();
            return data.getSize();
        }

        private class RemindersListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            private TextView title;
            private TextView date;

            public RemindersListViewHolder(View itemView) {
                super(itemView);
                title = (TextView) itemView.findViewById(R.id.RemindersTitle);
                title.setTextColor(Color.parseColor("#000000"));
                date = (TextView) itemView.findViewById(R.id.RemindersDate);
                date.setTextColor(Color.parseColor("#000000"));
                itemView.setOnClickListener(this);
            }

            public void bindView(int position){
                RemindersData data = new RemindersData();
                String descrip = data.getTitle(position);
                title.setText(descrip);

                Date time = data.getDate(position);
                String text;

                SimpleDateFormat df = new SimpleDateFormat("H:mm");
                text = df.format(time);

                if(position >=0 && position <=3){
                    text+= "AM";
                }
                else{
                    text += "PM";
                }
                date.setText(text);
            }

            @Override
            public void onClick(View v) {

            }
        }
}
