package com.xworkz.inheritance.document;

public class DocumentRunner {

        public static void main(String[] args) {
            Document doc = new Document();
            doc.open();
            doc.edit();
            doc.save();
            doc.print();
            doc.close();

            Resume resume = new Resume();
            resume.open();
            resume.edit();
            resume.save();
            resume.print();
            resume.close();

            Document doc1 = new Resume();
            doc1.open();
            doc1.edit();
            doc1.save();
            doc1.print();
            doc1.close();
        }

}
