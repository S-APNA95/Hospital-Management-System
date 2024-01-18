import Models.Hospital;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital("XYZ", "xyz", 123, "xyz.com");
        h.appointDoctor("MBBS", "Sapna", 123456, "Heart Surgeon", 100000, "11.30 - 3.30");
        h.createRoom();
        h.admitPatient("Sapna", 23, 123,"123,", "Male", "Nothing");

    }

}

