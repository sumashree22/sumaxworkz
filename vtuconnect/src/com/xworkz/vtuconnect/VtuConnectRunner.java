package com.xworkz.vtuconnect;

import com.xworkz.vtuconnect.vtuconnect.VTUConnectApp;
import com.xworkz.vtuconnect.vtuconnectdto.VTUConnectDto;

public class VtuConnectRunner {
        public static void main(String[] args) {
            VTUConnectDto vtuConnectDto = new VTUConnectDto();
            vtuConnectDto.setFullName("Pranav Sharma");
            vtuConnectDto.setUsername("pranav_sharma");
            vtuConnectDto.setEmail("pranavsharma@vtu.ac.in");
            vtuConnectDto.setPhoneNumber("9876543210");
            vtuConnectDto.setPassword("pranav123");
            vtuConnectDto.setDepartment("information science Engineering");
            vtuConnectDto.setStudentId("4AI21Is057");

            VTUConnectApp vtuConnectApp = new VTUConnectApp();
            vtuConnectApp.UserRegistered(vtuConnectDto);
            vtuConnectApp.fetchDetails();
        }
    }


