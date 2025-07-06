package com.xworkz.inheritance.toy;

public class ToyRunner {
        public static void main(String[] args) {
            Toy toy = new Toy();
            toy.play();
            toy.move();
            toy.stop();
            toy.sound();
            toy.charge();

            Robot robot = new Robot();
            robot.play();
            robot.move();
            robot.stop();
            robot.sound();
            robot.charge();

            Toy toy1 = new Robot();
            toy1.play();
            toy1.move();
            toy1.stop();
            toy1.sound();
            toy1.charge();
        }

}
