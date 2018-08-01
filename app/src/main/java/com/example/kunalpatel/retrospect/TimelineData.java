package com.example.kunalpatel.retrospect;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kunalpatel on 7/3/18.
 */

public class TimelineData {
    // Dummy Data, populate these lists with data from database
    private List<String> title = new ArrayList<String>();
    private List<Date> date = new ArrayList<Date>();
    private List<String> location = new ArrayList<String>();
//    public List<String> details = new ArrayList<String>();

    //constructor
    public TimelineData (){
        title.add("Meetup with John");
        title.add("Job Meeting with Lindsey");
        title.add("Book Club Meeting with Neighbors and Friends");
        title.add("Dinner with Zach");
        title.add("Lunch");
        title.add("Breakfast");
        title.add("Concert with Friends");
        title.add("Run in with Levi from College");
        title.add("Birthday Party for Jessica");
        title.add("Dr. Paul Appointment");
        title.add("Event 1");
        title.add("Event 2");
        title.add("Event 3");
        title.add("Event 4");
        title.add("Event 5");
        title.add("Event 6");
        title.add("Event 7");
        title.add("Event 8");
        title.add("Event 9");


        date.add(new Date(2018, 6, 15-1,5,10));
        date.add(new Date(2018, 6, 3-1, 2, 30));
        date.add(new Date(2018, 6, 3-1, 6, 0));
        date.add(new Date(2018, 5, 29-1, 6,30));
        date.add(new Date(2018, 5, 29-1, 12,30));
        date.add(new Date(2018, 5, 29-1,7, 0 ));
        date.add(new Date(2018, 5, 25-1, 8, 30));
        date.add(new Date(2018, 5, 24-1, 5, 0));
        date.add(new Date(2018, 5, 20-1,4,30 ));
        date.add(new Date(2018, 5, 19-1, 2,30));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));
        date.add(new Date(2018,5,14-1,3,43));

        location.add("Starbucks");
        location.add("Workplace");
        location.add("Home");
        location.add("Olive Garden");
        location.add("Workplace");
        location.add("Home");
        location.add("Concert Arena");
        location.add("Grocery Store");
        location.add("Jessica's Home");
        location.add("Hospital");
        location.add("Location 1");
        location.add("Location 2");
        location.add("Location 3");
        location.add("Location 4");
        location.add("Location 5");
        location.add("Location 6");
        location.add("Location 7");
        location.add("Location 8");
        location.add("Location 9");

    }

    public String getTitle(int pos){
        return title.get(pos);
    }
    public Date getDate(int pos){
        return date.get(pos);
    }
    public String getLocation(int pos){
        return location.get(pos);
    }

    public List<String> getTitle() {
        return title;
    }

    public List<Date> getDate() {
        return date;
    }

    public List<String> getLocation() {
        return location;
    }

    public void addTitle(String title){
        this.title.add(0,title);
    }

    public void addDate(Date date){
        this.date.add(0,date);
    }

    public void addLocation(String loc){
        this.location.add(0, loc);
    }


    public int getSize() {
        return title.size();
    }
}
