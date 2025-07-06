package com.xworkz.polymorphism.metal;

public class GoldRunner {

        public static void main(String[] args) {
            System.out.println("--- Metal ---");
            Metal metal = new Metal();
            metal.conductHeat();
            metal.conductElectricity();
            metal.melt();
            metal.shine();
            metal.beMolded();

            System.out.println("\n--- Metal as Gold ---");
            Metal metal1 = new Gold();
            metal1.conductHeat();
            metal1.conductElectricity();
            metal1.melt();
            metal1.shine();
            metal1.beMolded();

            System.out.println("\n--- Gold ---");
            Gold gold = new Gold();
            gold.conductHeat();
            gold.conductElectricity();
            gold.melt();
            gold.shine();
            gold.beMolded();
        }
    }


