package com.mad.homeworkgroup20.inclass9;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Aliandro on 3/26/2018.
 */

public class FileResponse {
    ArrayList<LatLng> points;

    @Override
    public String toString() {
        return "FileResponse{" +
                "points=" + points +
                '}';
    }

    String title;

    public ArrayList<LatLng> getPoints() {
        return points;
    }
}
