package com.example.careever;

public class VolunteerListViewItem {
    private String nameStr;
    private String destinationStr;
    private String titleStr;
    private String date1Str;
    private String date2Str;

    public void setName(String name) {
        nameStr = name;
    }
    public void setDestination(String destination) {
        destinationStr = destination;
    }
    public void setTitle(String title) {
        titleStr = title;
    }
    public void setDate1(String date1) {
        date1Str = date1;
    }
    public void setDate2(String date2) {
        date2Str = date2;
    }

    public String getName(){
        return this.nameStr;
    }
    public String getDestination(){
        return this.destinationStr;
    }
    public String getTitle(){
        return this.titleStr;
    }
    public String getDate1(){
        return this.date1Str;
    }
    public String getDate2(){
        return this.date2Str;
    }

}