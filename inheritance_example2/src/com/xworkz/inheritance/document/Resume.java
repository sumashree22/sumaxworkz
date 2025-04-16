package com.xworkz.inheritance.document;

public class Resume extends Document{

        public void open() { System.out.println("Opening resume"); }
        public void edit() { System.out.println("Editing resume"); }
        public void save() { System.out.println("Saving resume"); }
        public void print() { System.out.println("Printing resume"); }
        public void close() { System.out.println("Closing resume"); }

}
