package com.xworkz.amazon;

import com.xworkz.amazon.amazonapp.AmazonApp;
import com.xworkz.amazon.amazondto.AmazonDto;

public class AmazonRunner {

        public static void main(String[] args) {
            AmazonDto amazonDto = new AmazonDto();
            amazonDto.setFullName("suma");
            amazonDto.setMobileNumber("9876543210");
            amazonDto.setEmail("sumashree@gmail.com");
            amazonDto.setPassword("suma11@123");
            amazonDto.setShippingAddress("Delhi, India");

            AmazonApp amazonApp = new AmazonApp();
            amazonApp.UserRegistered(amazonDto);
            amazonApp.fetchDetails();
        }
    }



