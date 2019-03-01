package com.hfad.pokemonapi;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class ISS_response {
    public List<LatLng> getIssposition() {
        return issposition;
    }

    public void setIssposition(List<LatLng> issposition) {
        this.issposition = issposition;
    }

    private List<LatLng> issposition;

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    private int timestamp;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
