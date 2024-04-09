package Ex2;

import java.util.HashMap;
import java.util.Map;


public class MazeGame {
    public static void main(String[] args) {
        MazeGameBuilder builder = new MazeGameBuilder();

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);

        DoorWall door1 = new DoorWall(room1, room2);
        DoorWall door2 = new DoorWall(room2, room3);
        Wall wall = new Wall();

        builder.addRoom(room1);
        builder.addRoom(room2);
        builder.addRoom(room3);

        room1.setSide(Direction.NORTH, door1);
        room1.setSide(Direction.EAST, wall);
        room1.setSide(Direction.SOUTH, wall);
        room1.setSide(Direction.WEST, wall);

        room2.setSide(Direction.NORTH, wall);
        room2.setSide(Direction.EAST, door2);
        room2.setSide(Direction.SOUTH, wall);
        room2.setSide(Direction.WEST, door1);

        room3.setSide(Direction.NORTH, wall);
        room3.setSide(Direction.EAST, wall);
        room3.setSide(Direction.SOUTH, door2);
        room3.setSide(Direction.WEST, wall);

        Maze maze = builder.build();

        System.out.println("Лабиринт создан успешно!");
    }

    private static void createOldMaze() {
        MazeGameBuilder builder = new MazeGameBuilder();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        DoorWall d = new DoorWall(r1, r2);

        builder.addRoom(r1);
        builder.addRoom(r2);

        r1.setSide(Direction.NORTH, d);
        r1.setSide(Direction.EAST, new Wall());
        r1.setSide(Direction.SOUTH, new Wall());
        r1.setSide(Direction.WEST, new Wall());
        r2.setSide(Direction.NORTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, d);
        r2.setSide(Direction.WEST, new Wall());

        Maze oldMaze = builder.build();
    }

    private static void createNewMaze() {
        MazeGameBuilder builder = new MazeGameBuilder();

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);

        DoorWall door1 = new DoorWall(room1, room2);
        DoorWall door2 = new DoorWall(room2, room3);
        Wall wall = new Wall();

        builder.addRoom(room1);
        builder.addRoom(room2);
        builder.addRoom(room3);

        room1.setSide(Direction.NORTH, door1);
        room1.setSide(Direction.EAST, wall);
        room1.setSide(Direction.SOUTH, wall);
        room1.setSide(Direction.WEST, wall);

        room2.setSide(Direction.NORTH, wall);
        room2.setSide(Direction.EAST, door2);
        room2.setSide(Direction.SOUTH, wall);
        room2.setSide(Direction.WEST, door1);

        room3.setSide(Direction.NORTH, wall);
        room3.setSide(Direction.EAST, wall);
        room3.setSide(Direction.SOUTH, door2);
        room3.setSide(Direction.WEST, wall);

        Maze newMaze = builder.build();

        System.out.println("Новый лабиринт создан успешно!");
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
