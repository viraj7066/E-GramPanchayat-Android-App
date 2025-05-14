package com.example.loginapplicationnew;

public class Applicants {

    String application_id;
    String name;
    String mother_name;
    String father_name;
    String dob;
    String gender;
    String district;
    String taluka;
    String village;
    final String submit_date;

    public Applicants(String application_id, String name, String mother_name, String father_name, String dob, String gender, String district, String taluka, String village, String submit_date) {
        this.application_id = application_id;
        this.name = name;
        this.mother_name = mother_name;
        this.father_name = father_name;
        this.dob = dob;
        this.gender = gender;
        this.district = district;
        this.taluka = taluka;
        this.village = village;
        this.submit_date = submit_date;
    }

    public String getApplication_id() {
        return application_id;
    }

    public String getName() {
        return name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getDistrict() {
        return district;
    }

    public String getTaluka() {
        return taluka;
    }

    public String getVillage() {
        return village;
    }

    public String getSubmit_date() {
        return submit_date;
    }
}
