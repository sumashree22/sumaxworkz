package com.ageny.spacemission.service.impl;

import com.ageny.spacemission.dto.SpaceMissionDto;
import com.ageny.spacemission.repository.SpaceMissionRepository;
import com.ageny.spacemission.repository.impl.SpaceMissionRepositoryImpl;
import com.ageny.spacemission.service.SpaceMissionService;

public class SpaceMissionServiceImpl implements SpaceMissionService {

    SpaceMissionRepository spaceMissionRepository;

    public SpaceMissionServiceImpl(){
        spaceMissionRepository = new SpaceMissionRepositoryImpl();
    }

    @Override
    public boolean validateAndSaveMission(SpaceMissionDto missionDto) {
        boolean isValidatedAndSaved = false;
        boolean isMissionName = false;
        boolean isLaunchDate = false;
        boolean isDestination = false;
        boolean isMissionType = false;
        boolean isPayloadMassKg = false;

        if(missionDto.getMissionName() != null && !missionDto.getMissionName().isEmpty()){
            isMissionName = true;
        }
        if(missionDto.getLaunchDate() != null && !missionDto.getLaunchDate().isEmpty()){
            isLaunchDate = true;
        }
        if(missionDto.getDestination() != null && !missionDto.getDestination().isEmpty()){
            isDestination = true;
        }
        if(missionDto.getMissionType() != null && !missionDto.getMissionType().isEmpty()){
            isMissionType = true;
        }
        if(missionDto.getPayloadMassKg() != 0.0 && missionDto.getPayloadMassKg() > 0.0){
            isPayloadMassKg = true;
        }

        if(isMissionName && isLaunchDate && isDestination && isMissionType && isPayloadMassKg){
            isValidatedAndSaved = spaceMissionRepository.saveMission(missionDto);
        }
        return isValidatedAndSaved;
    }

    @Override
    public boolean updatedLaunchDateByMissionId(int missionId, String updateLaunchDate) {
        boolean isLaunchDateUpdated = false;
        if(missionId > 0 && updateLaunchDate != null && !updateLaunchDate.isEmpty()){
            isLaunchDateUpdated = true;
            isLaunchDateUpdated = spaceMissionRepository.updatedLaunchDateByMissionId(missionId,updateLaunchDate);
        }
        return isLaunchDateUpdated;
    }

    @Override
    public boolean deleteMissionByMissionId(int missionId) {
        boolean isMissionDeleted = false;
        if(missionId > 0){
            isMissionDeleted = spaceMissionRepository.deleteMissionByMissionId(missionId);
        }
        return isMissionDeleted;
    }
}

