package Database;

import java.util.HashMap;
import Models.Room;
public class RoomDatabase {
    HashMap<String, Room>roomDb;

    public RoomDatabase() {
        this.roomDb = new HashMap<>();
    }

        public Room getOccupiedRoom() {
            for (String key : roomDb.keySet()) {
                Room room = roomDb.get(key);
                if (!room.isOccupied() == false) {
                    return room;
                }
            }
            return null;
        }
        public int getTotalRoom(){
            return roomDb.size();
        }
        public void addRoomToDB(Room room){
        String roomId =room.getRoomId();
        roomDb.put(roomId, room);


}
}
