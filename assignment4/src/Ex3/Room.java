package Ex3;


import java.util.HashMap;
import java.util.Map;
interface Cloneable {
    Cloneable clone();
}

public class Room implements Cloneable {
    private Map<Direction, Wall> sides = new HashMap<Direction, Wall>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    // Метод клонирования комнаты
    public Room clone() {
        Room clonedRoom = new Room(this.roomNo);
        // Клонирование стен комнаты
        for (Direction direction : this.sides.keySet()) {
            Wall wall = this.sides.get(direction);
            clonedRoom.setSide(direction, wall.clone());
        }
        return clonedRoom;
    }

    public int getRoomNo(){
        return roomNo;
    }

    public void setSide(Direction north, DoorWall d) {
        sides.put(north , d);
    }
}

