package com.xworkz.bankapp.bankdto;

public class BankDto {
        private String fullName;
        private String accountNumber;
        private String email;
        private String mobileNumber;
        private String address;
        private double balance;
        private String password;

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }
    }


