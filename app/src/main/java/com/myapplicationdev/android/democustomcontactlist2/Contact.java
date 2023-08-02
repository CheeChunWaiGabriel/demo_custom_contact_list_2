package com.myapplicationdev.android.democustomcontactlist2;

public class Contact {
    String name;
    int CountryCode;
    int PhoneNum;
    char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int countryCode) {
        CountryCode = countryCode;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        PhoneNum = phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        CountryCode = countryCode;
        PhoneNum = phoneNum;
        this.gender = gender;
    }
}
