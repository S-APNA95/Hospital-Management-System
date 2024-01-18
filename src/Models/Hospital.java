package Models;

import Database.DoctorDatabase;
import Database.PatientDatabase;
import Database.RoomDatabase;

public class Hospital {
    private String name;
    private String address;
    private long phoneNo;
    private String email;
    private PatientDatabase patientDatabase;
    private DoctorDatabase doctorDatabase;
    private RoomDatabase roomDatabase;


    public Hospital(String name, String address, long phoneNo, String email) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
        this.patientDatabase = new PatientDatabase();
        this.doctorDatabase = new DoctorDatabase();
        this.roomDatabase = new RoomDatabase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void admitPatient(String name, int age, long phoneNo, String email, String gender, String disease) {
        //1. Generate patient id for the patient

        int totalPatientCount = patientDatabase.getTotalPatientCount() + 1;
        String pId = "PID" + totalPatientCount;

        //2.get the doctor who is handling minimum no. of patients

        Doctor doctor = doctorDatabase.getMinimumpatientDoctor();
        //3. get the room which is not occupied

        Room room = roomDatabase.getOccupiedRoom();
        room.setOccupied(true);

        Patient p = new Patient(pId, name, age, phoneNo, email, gender, disease, doctor, room, true);
        doctor.patientList.add(p);
        System.out.println("Patient got admitted successfully --> " + p);
    }
        public void createRoom(){
            String roomId = "ROOMID" + (roomDatabase.getTotalRoom() + 1);
            Room room = new Room(roomId, false, null, null);
            roomDatabase.addRoomToDB(room);
            System.out.println("Room added successfully  ->" + room);


        }

        public void appointDoctor(String degree, String name,long phoneNo, String speciality,int salary, String timeSlot){
            String docId = "DOCID" + (doctorDatabase.getTotalDoctors() + 1);
            Doctor doc = new Doctor(docId, degree, name, phoneNo, speciality, salary, timeSlot);
            doctorDatabase.addDoctorToDb(doc);
            System.out.println("Doctor created successfully  -->" + doc);

        }
    }

