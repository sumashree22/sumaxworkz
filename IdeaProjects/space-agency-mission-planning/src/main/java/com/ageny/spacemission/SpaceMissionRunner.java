package com.ageny.spacemission;

import com.ageny.spacemission.dto.SpaceMissionDto;
import com.ageny.spacemission.service.SpaceMissionService;
import com.ageny.spacemission.service.impl.SpaceMissionServiceImpl;

public class SpaceMissionRunner {

    static SpaceMissionService spaceMissionService;

    public static void main(String[] args) {
        SpaceMissionDto missionDto = new SpaceMissionDto();
        missionDto.setMissionName("Chandrayaan-3");
        missionDto.setLaunchDate("2023-07-14");
        missionDto.setDestination("Moon");
        missionDto.setMissionType("Lunar Landing Mission");
        missionDto.setPayloadMassKg(3900.0);

        spaceMissionService = new SpaceMissionServiceImpl();
        spaceMissionService.validateAndSaveMission(missionDto);
        System.out.println("Mission Added...");
        spaceMissionService.updatedLaunchDateByMissionId(1,"2024-09-22");
        System.out.println("Launch Date Updated...");
        spaceMissionService.deleteMissionByMissionId(1);
        System.out.println("Mission Deleted...");

    }
}