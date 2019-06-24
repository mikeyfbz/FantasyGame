package game;

import game.rooms.Room;

import java.util.ArrayList;

public class Game {

    ArrayList<Room> rooms;

    public Game(ArrayList<Room> rooms){
        this.rooms = rooms;
    }


    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public void removeCompletedRooms(){
        ArrayList<Room> removal = new ArrayList<Room>();
        for (Room room:this.rooms) {
            if(room.isRoomComplete() == true){
                removal.add(room);
            }
        }
        for (Room room:removal) {
            this.rooms.remove(room);
        }
    }
}
