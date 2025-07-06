package service;

import dto.HospitalDto;

public interface HospitalService {
    boolean validateAndSave(HospitalDto dto);


    boolean updateDoctorAssignedByPatientId(int  patientId, String doctorAssigned );

    boolean deletePatientById(int id);

    HospitalDto getHospitalDetails(int id);
}
