package com.hfad.pokemonapi;

import com.google.android.gms.maps.model.LatLng;

public class ISStatus {
    private int timestamp;

    @Override
    public String toString() {
        return "ISStatus{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }


}
