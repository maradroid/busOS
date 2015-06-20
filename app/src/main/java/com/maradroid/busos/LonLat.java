package com.maradroid.busos;

/**
 * Created by mara on 13.04.15..
 */
public class LonLat {

    private double lon;
    private double lat;
    private String naziv;

    public LonLat(String naziv, double lat, double lon){
        this.lon=lon;
        this.lat=lat;
        this.naziv=naziv;
    }

    public double getLon(){
        return lon;
    }

    public double getLat(){
        return lat;
    }

    public String getNaziv(){
         return naziv;
     }

}
