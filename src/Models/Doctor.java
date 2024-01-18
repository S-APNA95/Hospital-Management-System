package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    public String dId;
    public String degree;
    public String name;
    public long phoneNo;
    public String speciality;
    public int salary;
    public String timeSlot;
    public List<Patient> patientList;




    public Doctor(String dId, String degree, String name, long phoneNo, String speciality, int salary, String timeSlot ) {
        this.dId = dId;
        this.degree = degree;
        this.name = name;
        this.phoneNo = phoneNo;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dId='" + dId + '\'' +
                ", degree='" + degree + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", speciality='" + speciality + '\'' +
                ", salary=" + salary +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    public String getdId() {
        return dId;
    }

    public String getDegree() {
        return degree;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getSalary() {
        return salary;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }
    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
