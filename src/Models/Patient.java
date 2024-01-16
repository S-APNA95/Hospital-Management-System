package Models;


public class Patient {
    String pId;
    String name;
    int age;
    Long phoneNo;
    String email;
    String gender;
    String disease;
    Docter docter;
    Room room;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Docter getDocter() {
        return docter;
    }

    public void setDocter(Docter docter) {
        this.docter = docter;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Patient(String pId, String name, int age, Long phoneNo, String email, String gender, String disease, Docter docter, Room room) {
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