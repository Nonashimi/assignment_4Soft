package Ex2;

public class MazeGameBuilder {
    private Maze maze;

    public MazeGameBuilder() {
        this.maze = new Maze();
    }

    public void addRoom(Room room) {
        maze.addRoom(room);
    }

    public Maze build() {
        return maze;
    }
}
