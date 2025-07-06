package com.xworkz.isarelationship.job;

import com.xworkz.isarelationship.career.Career;

public class EngineerRunner {
    public static void main(String[] args) {
        System.out.println("--- Career ---");
        Career base = new Career();
        base.work();
        base.earn();
        base.progress();
        base.retire();

        System.out.println("\n--- Career as Engineer ---");
        Career base1 = new Engineer();
        base1.work();
        base1.earn();
        base1.progress();
        base1.retire();

        System.out.println("\n--- Engineer ---");
        Engineer child = new Engineer();
        child.work();
        child.earn();
        child.progress();
        child.retire();
    }
}
