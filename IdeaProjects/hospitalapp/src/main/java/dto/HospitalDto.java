package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDto {
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String diagnosis;
    private String admissionDate;
    private String doctorAssigned;
}
