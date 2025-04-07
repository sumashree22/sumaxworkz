package com.xworkz.constitutionapp;

import com.xworkz.constitutionapp.constitution.Constitution;

public class ConstitutionRunner {

        public static void main(String[] args) {

            Constitution const1 = new Constitution();
            const1.setArticleNumber(1);
            const1.setTitle("Union and its Territory");
            const1.setDescription("Defines the territory of India");
            const1.setAmendmentDate("26/01/1950");
            const1.setIsActive(true);
            const1.setEnactedBy("Constituent Assembly");
            const1.setApplicableTo("Whole of India");

            int ref = const1.getArticleNumber();
            System.out.println("Article Number: " + ref);
            String ref1 = const1.getTitle();
            System.out.println("Title: " + ref1);
            String ref2 = const1.getDescription();
            System.out.println("Description: " + ref2);
            String ref3 = const1.getAmendmentDate();
            System.out.println("Amendment Date: " + ref3);
            boolean ref4 = const1.getIsActive();
            System.out.println("Is Active: " + ref4);
            String ref5 = const1.getEnactedBy();
            System.out.println("Enacted By: " + ref5);
            String ref6 = const1.getApplicableTo();
            System.out.println("Applicable To: " + ref6);
            System.out.println();

            Constitution const2 = new Constitution();
            const2.setArticleNumber(14);
            const2.setTitle("Equality Before Law");
            const2.setDescription("Ensures equality to all citizens");
            const2.setAmendmentDate("01/03/1976");
            const2.setIsActive(true);
            const2.setEnactedBy("Parliament");
            const2.setApplicableTo("All Citizens");

            int ref7 = const2.getArticleNumber();
            System.out.println("Article Number: " + ref7);
            String ref8 = const2.getTitle();
            System.out.println("Title: " + ref8);
            String ref9 = const2.getDescription();
            System.out.println("Description: " + ref9);
            String ref10 = const2.getAmendmentDate();
            System.out.println("Amendment Date: " + ref10);
            boolean ref11 = const2.getIsActive();
            System.out.println("Is Active: " + ref11);
            String ref12 = const2.getEnactedBy();
            System.out.println("Enacted By: " + ref12);
            String ref13 = const2.getApplicableTo();
            System.out.println("Applicable To: " + ref13);
            System.out.println();

            Constitution const3 = new Constitution();
            const3.setArticleNumber(21);
            const3.setTitle("Protection of Life and Personal Liberty");
            const3.setDescription("No person shall be deprived of his life or personal liberty");
            const3.setAmendmentDate("15/04/1985");
            const3.setIsActive(true);
            const3.setEnactedBy("Supreme Court");
            const3.setApplicableTo("All Individuals");

            int ref14 = const3.getArticleNumber();
            System.out.println("Article Number: " + ref14);
            String ref15 = const3.getTitle();
            System.out.println("Title: " + ref15);
            String ref16 = const3.getDescription();
            System.out.println("Description: " + ref16);
            String ref17 = const3.getAmendmentDate();
            System.out.println("Amendment Date: " + ref17);
            boolean ref18 = const3.getIsActive();
            System.out.println("Is Active: " + ref18);
            String ref19 = const3.getEnactedBy();
            System.out.println("Enacted By: " + ref19);
            String ref20 = const3.getApplicableTo();
            System.out.println("Applicable To: " + ref20);
            System.out.println();

            Constitution const4 = new Constitution();
            const4.setArticleNumber(32);
            const4.setTitle("Right to Constitutional Remedies");
            const4.setDescription("Allows individuals to move court for enforcement of rights");
            const4.setAmendmentDate("26/01/1950");
            const4.setIsActive(true);
            const4.setEnactedBy("Constituent Assembly");
            const4.setApplicableTo("All Citizens");

            int ref21 = const4.getArticleNumber();
            System.out.println("Article Number: " + ref21);
            String ref22 = const4.getTitle();
            System.out.println("Title: " + ref22);
            String ref23 = const4.getDescription();
            System.out.println("Description: " + ref23);
            String ref24 = const4.getAmendmentDate();
            System.out.println("Amendment Date: " + ref24);
            boolean ref25 = const4.getIsActive();
            System.out.println("Is Active: " + ref25);
            String ref26 = const4.getEnactedBy();
            System.out.println("Enacted By: " + ref26);
            String ref27 = const4.getApplicableTo();
            System.out.println("Applicable To: " + ref27);
            System.out.println();

            Constitution const5 = new Constitution();
            const5.setArticleNumber(370);
            const5.setTitle("Temporary Provisions for J&K");
            const5.setDescription("Special status for Jammu & Kashmir (Now repealed)");
            const5.setAmendmentDate("05/08/2019");
            const5.setIsActive(false);
            const5.setEnactedBy("President of India");
            const5.setApplicableTo("Jammu & Kashmir");

            int ref28 = const5.getArticleNumber();
            System.out.println("Article Number: " + ref28);
            String ref29 = const5.getTitle();
            System.out.println("Title: " + ref29);
            String ref30 = const5.getDescription();
            System.out.println("Description: " + ref30);
            String ref31 = const5.getAmendmentDate();
            System.out.println("Amendment Date: " + ref31);
            boolean ref32 = const5.getIsActive();
            System.out.println("Is Active: " + ref32);
            String ref33 = const5.getEnactedBy();
            System.out.println("Enacted By: " + ref33);
            String ref34 = const5.getApplicableTo();
            System.out.println("Applicable To: " + ref34);
            System.out.println();
        }

}
