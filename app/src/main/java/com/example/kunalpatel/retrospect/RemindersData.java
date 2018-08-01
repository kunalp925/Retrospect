package com.example.kunalpatel.retrospect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kunalpatel on 7/5/18.
 */

public class RemindersData {
    //Dummy data populate these with database data
    private List<String> title = new ArrayList<String>();
    private List<Date> date = new ArrayList<Date>();

    RemindersData(){
        title.add("Take Pills");
        title.add("Refill Prescription");
        title.add("Call Jack");
        title.add("Pick up Vegetables");
        title.add("Take Pills");
        title.add("Wish John Happy Birthday!");
        title.add("Pick up Cindy from school");
        title.add("Doctors Appointment");
        title.add("Reminder 1");
        title.add("Reminder 2");
        title.add("Reminder 3");




        date.add(new Date(2018, 7, 3,8,0));
        date.add(new Date(2018, 7, 3, 9, 30));
        date.add(new Date(2018, 7, 2, 10, 45));
        date.add(new Date(2018, 6, 29, 11,30));
        date.add(new Date(2018, 6, 29, 2,0));
        date.add(new Date(2018, 6, 29,3, 0));
        date.add(new Date(2018, 6, 25, 3, 30));
        date.add(new Date(2018, 6, 29, 5,0));
        date.add(new Date(2018, 6, 29, 7,0));
        date.add(new Date(2018, 6, 29,7, 0 ));
        date.add(new Date(2018, 6, 25, 7, 0));

    }

    public String getTitle(int pos){
        return title.get(pos);
    }
    public Date getDate(int pos){
        return date.get(pos);
    }


    public List<String> getTitle() {
        return title;
    }

    public List<Date> getDate() {
        return date;
    }

    public void addTitle(String title){
        this.title.add(0,title);
    }

    public void addDate(Date date){
        this.date.add(0,date);
    }


    public int getSize() {
        return title.size();
    }
}
