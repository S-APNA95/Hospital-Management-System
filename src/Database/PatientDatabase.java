package Database;

import Models.Patient;

import java.util.HashMap;

public class PatientDatabase {
    HashMap<String, Patient> PatientdB;

    public PatientDatabase() {
        this.PatientdB = new HashMap<>();
    }
    public void addPatient(Patient obj){
        String pId = obj.getpId();
        PatientdB.put(pId, obj);
    }
    public Patient getPatient(String pId){
        return PatientdB.get(pId);
    }

}
