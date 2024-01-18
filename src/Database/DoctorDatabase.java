package Database;

import Models.Doctor;
import Models.Patient;

import java.util.HashMap;
import java.util.List;

public class DoctorDatabase {
    HashMap<String, Doctor>doctorDatabase;

    public DoctorDatabase() {
        this.doctorDatabase = new HashMap<>();
    }

    public Doctor getMinimumpatientDoctor() {
        Doctor minDoc = null;
        int min = Integer.MAX_VALUE;

        for (String key : doctorDatabase.keySet()) {
        Doctor doc = doctorDatabase.get(key);
        List<Patient> patientList = doc.getPatientList();
        if (patientList.size() < min) {
            minDoc = doc;
            min = patientList.size();
        }
    }
    return minDoc;

    }
    public void addDoctorToDb(Doctor doctor){
        String dId = doctor.getdId();
        doctorDatabase.put(dId, doctor);


    }
    public Doctor getDoctorId(String id){
        return doctorDatabase.get(id);
    }
    public int getTotalDoctors(){
        return doctorDatabase.size();
    }



}
