package com.xworkz.zeptoapp;

import com.xworkz.zeptoapp.zeptoapp.ZeptoApp;
import com.xworkz.zeptoapp.zeptodto.ZeptoDto;

public class ZeptoRunner {
        public static void main(String[] args) {
            ZeptoDto zeptoDto = new ZeptoDto();
            zeptoDto.setFullName("Rajesh Patel");
            zeptoDto.setUsername("rajesh_p");
            zeptoDto.setEmail("rajeshpatel@gmail.com");
            zeptoDto.setPhoneNumber("9876543210");
            zeptoDto.setPassword("rajesh@123");

            ZeptoApp zeptoApp = new ZeptoApp();
            zeptoApp.UserRegistered(zeptoDto);
            zeptoApp.fetchDetails();
        }
    }


