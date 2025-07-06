package com.xworkz.polymorphism.programminglanguage;

public class JavaRunner {

        public static void main(String[] args) {
            System.out.println("--- Programming Language ---");
            ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
            programmingLanguage.define();
            programmingLanguage.syntax();
            programmingLanguage.usage();
            programmingLanguage.compile();
            programmingLanguage.execute();

            System.out.println("--- Programming Language as Java ---");
            ProgrammingLanguage programmingLanguage1 = new Java();
            programmingLanguage1.define();
            programmingLanguage1.syntax();
            programmingLanguage1.usage();
            programmingLanguage1.compile();
            programmingLanguage1.execute();

            System.out.println("--- Java ---");
            Java java = new Java();
            java.define();
            java.syntax();
            java.usage();
            java.compile();
            java.execute();
        }
    }


