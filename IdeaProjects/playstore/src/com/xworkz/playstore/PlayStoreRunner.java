package com.xworkz.playstore;

import com.xworkz.playstore.playstoreapp.PlayStoreApp;
import com.xworkz.playstore.playstoredto.PlayStoreDto;

public class PlayStoreRunner {

        public static void main(String[] args) {
            PlayStoreDto playStoreDto = new PlayStoreDto();
            playStoreDto.setFullName("ram");
            playStoreDto.setEmail("ram@example.com");
            playStoreDto.setPhoneNumber("9876543210");
            playStoreDto.setPassword("ram123");
            playStoreDto.setConfirmPassword("ram123");

            PlayStoreApp playStoreApp = new PlayStoreApp();
            playStoreApp.UserRegistered(playStoreDto);
            playStoreApp.fetchDetails();
        }
    }


