import dto.HospitalDto;
import dto.HospitalDto;
import service.HospitalService;
import service.impl.HospitalServiceImpl;

public class Runner {
    public static void main(String[] args) {
        HospitalDto dto = new HospitalDto();
        dto.setPatientId(103);
        dto.setPatientName("shubha");
        dto.setAge(35);
        dto.setGender("Female");
        dto.setDiagnosis("Fever");
        dto.setAdmissionDate("2025-07-16");
        dto.setDoctorAssigned("Dr. radha");

        HospitalService service = new HospitalServiceImpl();
        //service.validateAndSave(dto);
       // service.updateDoctorAssignedByPatientId(101,"deepak");
        //service.deletePatientById(103);
      HospitalDto dto1=  service.getHospitalDetails(101);
        System.out.println(dto1);


    }
}
