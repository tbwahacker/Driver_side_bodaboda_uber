package com.iramml.uberclone.driverapp.Model;

public class latLong {

    private Double longitude,latitude;

    public latLong(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public latLong() {
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
