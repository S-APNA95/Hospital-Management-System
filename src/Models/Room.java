package Models;

public class Room {
    int roomId;
    boolean isOccupied;
    Patient patient;
    Docter docter;

    public Room(int roomId, boolean isOccupied, Patient patient, Docter docter) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.patient = patient;
        this.docter = docter;
    }
}
