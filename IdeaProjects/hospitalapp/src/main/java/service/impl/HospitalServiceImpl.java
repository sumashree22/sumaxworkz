package service.impl;

import dto.HospitalDto;
import repo.HospitalRepo;
import repo.impl.HospitalRepoImpl;
import service.HospitalService;

public class HospitalServiceImpl implements HospitalService {
    HospitalRepo patientRepo;

    public HospitalServiceImpl() {
        patientRepo = new HospitalRepoImpl();
    }

    @Override
    public boolean validateAndSave(HospitalDto dto) {
        boolean isPatientValid = false;

        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isAgeValid = false;
        boolean isGenderValid = false;
        boolean isDiagnosisValid = false;
        boolean isAdmissionDateValid = false;
        boolean isDoctorAssignedValid = false;

        if (dto.getPatientId() > 0) {
            isIdValid = true;
        }

        if (dto.getPatientName() != null && !dto.getPatientName().isEmpty()) {
            isNameValid = true;
        }

        if (dto.getAge() > 0) {
            isAgeValid = true;
        }

        if (dto.getGender() != null && !dto.getGender().isEmpty()) {
            isGenderValid = true;
        }

        if (dto.getDiagnosis() != null && !dto.getDiagnosis().isEmpty()) {
            isDiagnosisValid = true;
        }

        if (dto.getAdmissionDate() != null && !dto.getAdmissionDate().isEmpty()) {
            isAdmissionDateValid = true;
        }

        if (dto.getDoctorAssigned() != null && !dto.getDoctorAssigned().isEmpty()) {
            isDoctorAssignedValid = true;
        }

        if (isIdValid && isNameValid && isAgeValid && isGenderValid &&
                isDiagnosisValid && isAdmissionDateValid && isDoctorAssignedValid) {
            isPatientValid = patientRepo.saveHospitalDetails(dto);
        }

        return isPatientValid;
    }

    @Override
    public boolean updateDoctorAssignedByPatientId(int patientId, String doctorAssigned ) {
        boolean isDoctorAssignedByPatientId=false;
        if( patientId!=0 && doctorAssigned!=null&&!doctorAssigned.isEmpty()) {
            isDoctorAssignedByPatientId=patientRepo.upDoctorAssignById(patientId,doctorAssigned);
        }
        return isDoctorAssignedByPatientId;
    }

    @Override
    public boolean deletePatientById(int id) {
        boolean isDeleted=false;
        if(id>0)
            isDeleted=patientRepo.deletePatient(id);
        return isDeleted;
    }

    @Override
    public HospitalDto getHospitalDetails(int id) {
        if(id>0)
            return patientRepo.fetchPatientDetails(id);
        return null;
    }

}

