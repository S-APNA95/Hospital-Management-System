package Models;


public class Patient {
    int pId;
    String name;
    int age;
    Long phoneNo;
    String email;
    String gender;
    String disease;
    Docter docter;
    Room room;


    public Patient(int pId, String name, int age, Long phoneNo, String email, String gender, String disease, Docter docter, Room room) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.docter = docter;
        this.room = room;
    }
}