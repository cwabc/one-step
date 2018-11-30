package com.example.administrator.model;

import java.io.Serializable;
import java.util.List;
import com.amap.api.maps.*;
import com.amap.api.maps.model.LatLng;


public class Route implements Serializable {


    private List<LatLng> points;
    private Double total_distance;
    private LatLng feat_LatLng;

    public List<LatLng> getPoints() {
        return points;
    }

    public void setPoints(List<LatLng> points) {
        this.points = points;
    }

    public Double getTotal_distance() {
        return total_distance;
    }

    public void setTotal_distance(Double total_distance) {
        this.total_distance = total_distance;
    }

    public LatLng getFeat_LatLng() {
        return feat_LatLng;
    }

    public void setFeat_LatLng(LatLng feat_LatLng) {
        this.feat_LatLng = feat_LatLng;
    }

}
