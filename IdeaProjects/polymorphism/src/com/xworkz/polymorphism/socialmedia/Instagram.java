package com.xworkz.polymorphism.socialmedia;

public class Instagram extends SocialMedia {
        @Override
        public void connect() {
            System.out.println("Instagram: Connecting people through photos and videos.");
        }

        @Override
        public void shareContent() {
            System.out.println("Instagram: Users can share photos, stories, and videos.");
        }

        @Override
        public void interact() {
            System.out.println("Instagram: Users interact through likes, comments, and direct messages.");
        }

        @Override
        public void network() {
            System.out.println("Instagram: Creating a visual social network where users share their lifestyle.");
        }

        @Override
        public void updateStatus() {
            System.out.println("Instagram: Users can update stories and post photos or videos to their feed.");
        }
    }


