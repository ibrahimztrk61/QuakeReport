package com.example.quakereport;

public class Earthquake {

    /**
     * {@link Earthquake} represents a earthquake info
     * Each object has 3 properties: magnitude, place and time
     */




    private double mMagnitude;

    private  String mPlace;

    /** Time of the earthquake */
    private long mTime;

    /**
     * Create a new Earthquake object.  --constructor--
     *
     * @param magnitude is the magnitude of earthquake
     * @param place is the where the earthquake occurred
     * @param time is the when the earthquake occurred
     **/


    public Earthquake (double magnitude, String place, long time){
      mMagnitude =magnitude;
      mPlace = place;
      mTime = time;

    }

    /**
     * Returns the magnitude of the earthquake.
     */

    public double getmMagnitude() {
        return mMagnitude;
    }



    public String getmPlace() {
        return mPlace;
    }



    public long getmTime() {
        return mTime;
    }




}
