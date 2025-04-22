package com.xworkz.toString.Ball;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball = new Ball();

        ball.setBrand("Nike");
        ball.setMaterial("Synthetic");
        ball.setDiameter(22.5);
        ball.setWeight(420);
        ball.setType("Football");
        ball.setColor("White");

        System.out.println(ball.toString());
    }
}
