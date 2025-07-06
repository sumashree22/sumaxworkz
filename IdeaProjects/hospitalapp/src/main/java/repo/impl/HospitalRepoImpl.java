package repo.impl;

import com.mysql.jdbc.Driver;
import dto.HospitalDto;
import repo.HospitalRepo;

import java.sql.*;


public class HospitalRepoImpl implements HospitalRepo {

    @Override
    public boolean saveHospitalDetails(HospitalDto dto) {
        boolean isSaved = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospitaldb", "root", "sumashree@22");

            PreparedStatement statement = connection.prepareStatement
                    ("insert into hospital_patient(patient_id,patient_name,age,gender,diagnosis,admission_date,doctor_assigned)" +
                    "values(?,?,?,?,?,?,?)");
            statement.setInt(1,dto.getPatientId());
            statement.setString(2,dto.getPatientName());
            statement.setInt(3,dto.getAge());
            statement.setString(4,dto.getGender());
            statement.setString(5,dto.getDiagnosis());
            statement.setString(6,dto.getAdmissionDate());
            statement.setString(7, dto.getDoctorAssigned());
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                isSaved = true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return isSaved;

    }

    @Override
    public boolean upDoctorAssignById(int patientId, String doctorAssigned) {
        boolean isDoctorAssignedById=false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospitaldb", "root", "sumashree@22");
            PreparedStatement pstmn=connection.prepareStatement("update hospital_patient set doctor_assigned=? where patient_id=? ");
              pstmn.setString(1, doctorAssigned);
              pstmn.setInt(2,patientId);


              int noOfRowsAffected = pstmn.executeUpdate() ;
              if(noOfRowsAffected > 0)
                  isDoctorAssignedById = true;
        }catch (ClassNotFoundException | SQLException b) {
            b.printStackTrace();
        }

        return isDoctorAssignedById;
    }
    @Override
    public boolean deletePatient(int id) {
        boolean isDoctorDeleted=false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospitaldb", "root", "sumashree@22");
            PreparedStatement preparedStatement=connection.prepareStatement("delete from hospital_patient where  patient_id=?");
            preparedStatement.setInt(1,id);
            int noOfrowsAffected=preparedStatement.executeUpdate();
            if(noOfrowsAffected>0){
                isDoctorDeleted=true;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return  isDoctorDeleted;
    }

    @Override
    public HospitalDto fetchPatientDetails(int id) {
        HospitalDto dto1=new HospitalDto();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hospitaldb", "root", "sumashree@22");
            PreparedStatement preparedStatement=connection.prepareStatement("select * from hospital_patient where patient_id=?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                dto1.setPatientId(resultSet.getInt(1));
                dto1.setPatientName(resultSet.getString(2));
                dto1.setAge(resultSet.getInt(3));
                dto1.setGender(resultSet.getString(4));
                dto1.setDiagnosis(resultSet.getString(5));
                dto1.setAdmissionDate(resultSet.getString(6));
                dto1.setDoctorAssigned(resultSet.getString(7));
            }

        }catch(ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }
return dto1;
    }
}
