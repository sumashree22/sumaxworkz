package repo;

import dto.HospitalDto;

public interface HospitalRepo {
    boolean saveHospitalDetails(HospitalDto dto);

    boolean upDoctorAssignById(int patientId,String doctorAssigned);

    boolean deletePatient(int id);

    HospitalDto fetchPatientDetails(int id);
}
