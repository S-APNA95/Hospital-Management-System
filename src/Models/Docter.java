package Models;

import java.util.ArrayList;
import java.util.List;

public class Docter {
    int dId;
    String degree;
    String name;
    int phoneNo;
    String speciality;
    int salary;
    int timeSlot;
    List<Patient> patientList;



    public Docter(int dId, String degree, String name, int phoneNo, String speciality, int salary, int timeSlot,List<Patient> patientList ) {
        this.dId = dId;
        this.degree = degree;
        this.name = name;
        this.phoneNo = phoneNo;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientList = new ArrayList<>();
    }
}
