package com.ageny.spacemission.repository;

import com.ageny.spacemission.dto.SpaceMissionDto;

public interface SpaceMissionRepository {
    boolean saveMission(SpaceMissionDto missionDto);
    boolean updatedLaunchDateByMissionId(int missionId, String updateLaunchDate);
    boolean deleteMissionByMissionId(int missionId);
}
