package com.iramml.uberclone.driverapp.Model;

public class User{
    private String email, name, password, phone, avatarUrl, rates, carType;
    private Double longitude,latitude;

    public User(){

    }

    public User(String email, String name, String password, String phone, String avatarUrl, String rates, String carType, Double longitude, Double latitude) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.avatarUrl = avatarUrl;
        this.rates = rates;
        this.carType = carType;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
