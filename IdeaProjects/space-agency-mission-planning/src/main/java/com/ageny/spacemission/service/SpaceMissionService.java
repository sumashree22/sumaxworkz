package com.ageny.spacemission.service;

import com.ageny.spacemission.dto.SpaceMissionDto;

public interface SpaceMissionService {
    boolean validateAndSaveMission(SpaceMissionDto missionDto);
    boolean updatedLaunchDateByMissionId(int missionId, String updateLaunchDate);
    boolean deleteMissionByMissionId(int missionId);
}
