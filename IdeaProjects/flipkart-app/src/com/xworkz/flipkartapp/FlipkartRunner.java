package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.flipkartapp.FlipkartApp;
import com.xworkz.flipkartapp.flipkartdto.FlipkartDto;

public class FlipkartRunner {
    public static void main(String[] args) {
            FlipkartDto flipkartDto = new FlipkartDto();
            flipkartDto.setFullName("Rajendra Kumar");
            flipkartDto.setPhoneNumber("9876543210");
            flipkartDto.setEmail("rajendra@example.com");
            flipkartDto.setAddress("Mumbai, Maharashtra");
            flipkartDto.setPassword("rajendra@123");
            flipkartDto.setConfirmPassword("rajendra@123");
            flipkartDto.setDob("1995-06-15");
            flipkartDto.setPinCode("400001");
            flipkartDto.setGender("Male");

            FlipkartApp flipkartApp = new FlipkartApp();
            flipkartApp.UserRegistered(flipkartDto);
            flipkartApp.fetchDetails();
        }
    }


