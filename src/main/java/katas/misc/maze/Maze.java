package katas.misc.maze;

import static java.util.Arrays.copyOf;

public class Maze {
    private final int[][] maze;
    private final int rows;
    private final int columns;
    private final int exitRow;
    private final int exitColumn;


    public Maze(int[][] maze, int rows, int columns, int exitRow, int exitColumn) {
        this.maze = maze;
        this.rows = rows;
        this.columns = columns;
        this.exitRow = exitRow;
        this.exitColumn = exitColumn;
    }

    public int[][] getMaze() {
        return copyOf(maze, maze.length);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getExitRow() {
        return exitRow;
    }

    public int getExitColumn() {
        return exitColumn;
    }
}
