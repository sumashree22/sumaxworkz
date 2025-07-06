package com.xworkz.bankapp;

import com.xworkz.bankapp.bankapp.BankApp;
import com.xworkz.bankapp.bankdto.BankDto;

public class BankAppRunner {
        public static void main(String[] args) {
            BankDto bankDto = new BankDto();
            bankDto.setFullName("Ravi Kumar");
            bankDto.setAccountNumber("1234567890");
            bankDto.setEmail("ravikumar@gamil.com");
            bankDto.setMobileNumber("9876543210");
            bankDto.setAddress("Delhi, India");
            bankDto.setBalance(5000.0);
            bankDto.setPassword("ravi@123");

            BankApp bankApp = new BankApp();
            bankApp.UserRegistered(bankDto);
            bankApp.fetchDetails();
        }
    }


