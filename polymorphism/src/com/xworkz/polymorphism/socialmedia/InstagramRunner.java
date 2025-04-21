package com.xworkz.polymorphism.socialmedia;

public class InstagramRunner {

        public static void main(String[] args) {
            System.out.println("--- Social Media ---");
            SocialMedia socialMedia = new SocialMedia();
            socialMedia.connect();
            socialMedia.shareContent();
            socialMedia.interact();
            socialMedia.network();
            socialMedia.updateStatus();

            System.out.println("--- Social Media as Instagram ---");
            SocialMedia socialMedia1 = new Instagram();
            socialMedia1.connect();
            socialMedia1.shareContent();
            socialMedia1.interact();
            socialMedia1.network();
            socialMedia1.updateStatus();

            System.out.println("--- Instagram ---");
            Instagram instagram = new Instagram();
            instagram.connect();
            instagram.shareContent();
            instagram.interact();
            instagram.network();
            instagram.updateStatus();
        }
    }


