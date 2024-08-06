package com.example.springcore.autowiring.autowiring.entity;

public class Address {
    private String district;
    private String province;
    private String country;

    public Address() {
    }

    public Address(String district, String province, String country) {
        this.district = district;
        this.province = province;
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
