package com.xworkz.apoloapp;

import com.xworkz.apoloapp.constants.RoomType;
import com.xworkz.apoloapp.floor.Floor;
import com.xworkz.apoloapp.hospital.Hospital;
import com.xworkz.apoloapp.patient.Patient;
import com.xworkz.apoloapp.room.Room;

public class ApoloAppRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalId = 1;
        hospital.hospitalName = "Apolo";
        hospital.location = "Rajajinagara";

        Floor floors[] = new Floor[4];

        Floor floor1 = new Floor();
        floor1.floorId = 1;
        floor1.numberOfRooms = 2;

        Room rooms1[] = new Room[2];

        Room room1 = new Room();
        room1.roomType = RoomType.ICU;
        Patient patients1[] = new Patient[1];
        Patient patient1 = new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Aarav Kumar");
        patient1.setAdress("Bangalore");
        patient1.setPhoneNumber(8861938137L);
        patients1[0] = patient1;
        room1.patients = patients1;
        rooms1[0] = room1;

        Room room2 = new Room();
        room2.roomType = RoomType.Dulex;
        Patient patients2[] = new Patient[1];
        Patient patient2 = new Patient();
        patient2.setPatientId(2);
        patient2.setPatientName("Priya Sharma");
        patient2.setAdress("Chikkamagaluru");
        patient2.setPhoneNumber(8861938147L);
        patients2[0] = patient2;
        room2.patients = patients2;
        rooms1[1] = room2;

        floor1.rooms = rooms1;


        Floor floor2 = new Floor();
        floor2.floorId = 2;
        floor2.numberOfRooms = 2;

        Room rooms2[] = new Room[2];

        Room room3 = new Room();
        room3.roomType = RoomType.ICU;
        Patient patients3[] = new Patient[1];
        Patient patient3 = new Patient();
        patient3.setPatientId(3);
        patient3.setPatientName("Raghav Singh");
        patient3.setAdress("Delhi");
        patient3.setPhoneNumber(8861938137L);
        patients3[0] = patient3;
        room3.patients = patients3;
        rooms2[0] = room3;

        Room room4 = new Room();
        room4.roomType = RoomType.Dulex;
        Patient patients4[] = new Patient[1];
        Patient patient4 = new Patient();
        patient4.setPatientId(4);
        patient4.setPatientName("Ananya Gupta");
        patient4.setAdress("Mumbai");
        patient4.setPhoneNumber(8861938147L);
        patients4[0] = patient4;
        room4.patients = patients4;
        rooms2[1] = room4;

        floor2.rooms = rooms2;


        Floor floor3 = new Floor();
        floor3.floorId = 3;
        floor3.numberOfRooms = 2;

        Room rooms3[] = new Room[2];

        Room room5 = new Room();
        room5.roomType = RoomType.ICU;
        Patient patients5[] = new Patient[1];
        Patient patient5 = new Patient();
        patient5.setPatientId(5);
        patient5.setPatientName("Ishaan Patel");
        patient5.setAdress("Ahmedabad");
        patient5.setPhoneNumber(8861938157L);
        patients5[0] = patient5;
        room5.patients = patients5;
        rooms3[0] = room5;

        Room room6 = new Room();
        room6.roomType = RoomType.Dulex;
        Patient patients6[] = new Patient[1];
        Patient patient6 = new Patient();
        patient6.setPatientId(6);
        patient6.setPatientName("Vikram Yadav");
        patient6.setAdress("Hyderabad");
        patient6.setPhoneNumber(8861938138L);
        patients6[0] = patient6;
        room6.patients = patients6;
        rooms3[1] = room6;

        floor3.rooms = rooms3;


        Floor floor4 = new Floor();
        floor4.floorId = 4;
        floor4.numberOfRooms = 2;

        Room rooms4[] = new Room[2];

        Room room7 = new Room();
        room7.roomType = RoomType.ICU;
        Patient patients7[] = new Patient[1];
        Patient patient7 = new Patient();
        patient7.setPatientId(7);
        patient7.setPatientName("Neha Reddy");
        patient7.setAdress("Chennai");
        patient7.setPhoneNumber(8861938158L);
        patients7[0] = patient7;
        room7.patients = patients7;
        rooms4[0] = room7;

        Room room8 = new Room();
        room8.roomType = RoomType.Dulex;
        Patient patients8[] = new Patient[1];
        Patient patient8 = new Patient();
        patient8.setPatientId(8);
        patient8.setPatientName("Arjun Joshi");
        patient8.setAdress("Bhopal");
        patient8.setPhoneNumber(8861938167L);
        patients8[0] = patient8;
        room8.patients = patients8;
        rooms4[1] = room8;

        floor4.rooms = rooms4;

        floors[0] = floor1;
        floors[1] = floor2;
        floors[2] = floor3;
        floors[3] = floor4;

        hospital.floors = floors;

        hospital.displayDetails();
    }
}
