package Ex3;
public class MazeGame {
    public static void main(String[] argv) {
        Maze maze = createMaze();

        Room room = maze.roomNo(1);

        Room clonedRoom = room.clone();

        System.out.println("Original room: " + room.getRoomNo());
        System.out.println("Cloned room: " + clonedRoom.getRoomNo());
    }

    private static Maze createMaze() {
        Maze aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        DoorWall d = new DoorWall(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, d);
        r1.setSide(Direction.EAST, new Wall());
        r1.setSide(Direction.SOUTH, new Wall());
        r1.setSide(Direction.WEST, new Wall());
        r2.setSide(Direction.NORTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, d);
        r2.setSide(Direction.WEST, new Wall());

        return aMaze;
    }
}
