package com.xworkz.task.build;

public class BuildingRunner {
        public static void main(String[] args) {
            Building building = new Building();
            building.construct();
            building.demolish();
            building.paint();
            building.maintain();
            building.design();

            Skyscraper skyscraper = new Skyscraper();
            skyscraper.construct();
            skyscraper.demolish();
            skyscraper.paint();
            skyscraper.maintain();
            skyscraper.design();

            Building building1 = new Skyscraper();
            building1.construct();
            building1.demolish();
            building1.paint();
            building1.maintain();
            building1.design();
        }

}
