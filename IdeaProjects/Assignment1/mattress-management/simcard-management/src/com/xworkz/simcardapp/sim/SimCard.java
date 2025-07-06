package com.xworkz.simcardapp.sim;

public class SimCard {

        private int simId;
        private String networkProvider;
        private String simType;
        private String phoneNumber;
        private double balance;
        private boolean isActive;
        private String expiryDate;

        public void setSimId(int simId) {
            this.simId = simId;
        }

        public int getSimId() {
            return simId;
        }

        public void setNetworkProvider(String networkProvider) {
            this.networkProvider = networkProvider;
        }

        public String getNetworkProvider() {
            return networkProvider;
        }

        public void setSimType(String simType) {
            this.simType = simType;
        }

        public String getSimType() {
            return simType;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

}
