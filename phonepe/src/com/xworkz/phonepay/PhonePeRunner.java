package com.xworkz.phonepay;

import com.xworkz.phonepay.phonepeapp.PhonePeApp;
import com.xworkz.phonepay.phonepedto.PhonePeDto;

public class PhonePeRunner {

        public static void main(String[] args) {
            PhonePeDto phonePeDto = new PhonePeDto();
            phonePeDto.setFullName("Ravi Kumar");
            phonePeDto.setPhoneNumber("9876543210");
            phonePeDto.setEmail("ravi.kumar@phonepe.com");
            phonePeDto.setPassword("ravi123");
            phonePeDto.setConfirmPassword("ravi123");
            phonePeDto.setBankAccountNumber("1234567890");
            phonePeDto.setIfscCode("HDFC0001234");

            PhonePeApp phonePeApp = new PhonePeApp();
            phonePeApp.UserRegistered(phonePeDto);
            phonePeApp.fetchDetails();
        }
    }


