package com.company.Question_2;

public class House {

    private int bedrooms;
    private String place;
    private boolean driveway;

    public House(int bedrooms, String place, boolean driveway) {
        this.bedrooms = bedrooms;
        this.place = place;
        this.driveway = driveway;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isDriveway() {
        return driveway;
    }

    public void setDriveway(boolean driveway) {
        this.driveway = driveway;
    }
}
