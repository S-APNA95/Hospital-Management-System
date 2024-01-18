package Models;


public class Patient {
    public String pId;
    String name;
    int age;
    long phoneNo;
    String email;
    String gender;
    String disease;
    Doctor doctor;
    Room room;
    boolean isAdmitted;

    public String getpId() {
        return pId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public Patient(String pId, String name, int age, Long phoneNo, String email, String gender, String disease, Doctor doctor, Room room, boolean isAdmitted) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
        this.isAdmitted =true;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                ", room=" + room +
                '}';
    }
}