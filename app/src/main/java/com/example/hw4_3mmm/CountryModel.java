package com.example.hw4_3mmm;

public class CountryModel {
    private String imgCountry;
    private String countryName;

    public CountryModel(String imgCountry, String countryName) {
        this.imgCountry = imgCountry;
        this.countryName = countryName;
    }

    public String getImgCountry() {
        return imgCountry;
    }

    public String getCountryName() {
        return countryName;
    }
}
