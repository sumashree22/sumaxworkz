package com.xworkz.bankapp.bankapp;

import com.xworkz.bankapp.bankdto.BankDto;

public class BankApp {
        BankDto dto;

        public void UserRegistered(BankDto bankDto) {
            boolean isValid = validateUser(bankDto);
            boolean isvalid = false;

            if (isValid) {
                isvalid = true;
                dto = bankDto;
            } else {
                System.out.println("Registration failed.");
            }
        }

        public boolean validateUser(BankDto bankDto) {
            boolean isvalid = false;
            boolean isFullNameValid = false;
            boolean isAccountNumberValid = false;
            boolean isEmailValid = false;
            boolean isMobileNumberValid = false;
            boolean isBalanceValid = false;
            boolean isPasswordValid = false;
            boolean isAddressValid = false;

            if (bankDto.getFullName() != null && !bankDto.getFullName().isEmpty())
                isFullNameValid = true;
            else
                System.out.println("Invalid full name. Please try again later.");

            if (bankDto.getAccountNumber() != null && !bankDto.getAccountNumber().isEmpty())
                isAccountNumberValid = true;
            else
                System.out.println("Invalid account number. Please try again later.");

            if (bankDto.getEmail() != null && bankDto.getEmail().contains("@"))
                isEmailValid = true;
            else
                System.out.println("Invalid email address. Please enter a valid email.");

            if (bankDto.getMobileNumber() != null && !bankDto.getMobileNumber().isEmpty())
                isMobileNumberValid = true;
            else
                System.out.println("Invalid mobile number. Please try again later.");

            if (bankDto.getBalance() > 0)
                isBalanceValid = true;
            else
                System.out.println("Balance should be greater than 0.");

            if (bankDto.getPassword() != null && !bankDto.getPassword().isEmpty())
                isPasswordValid = true;
            else
                System.out.println("Invalid password.");

            if (bankDto.getAddress() != null && !bankDto.getAddress().isEmpty())
                isAddressValid = true;
            else
                System.out.println("Invalid address.");

            if (isFullNameValid && isAccountNumberValid && isEmailValid && isMobileNumberValid && isBalanceValid && isPasswordValid && isAddressValid)
                isvalid = true;

            return isvalid;
        }

        public void fetchDetails() {
            System.out.println("Full name is: " + dto.getFullName());
            System.out.println("Account number is: " + dto.getAccountNumber());
            System.out.println("User email is: " + dto.getEmail());
            System.out.println("User mobile number is: " + dto.getMobileNumber());
            System.out.println("User address is: " + dto.getAddress());
            System.out.println("Account balance is: " + dto.getBalance());
            System.out.println("User password is: " + dto.getPassword());
        }
    }


