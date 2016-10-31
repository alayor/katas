package katas.misc.maze.features;

import katas.misc.maze.Maze;
import katas.misc.maze.MazeSolution;

public class MazeHolder {
    private Maze maze;
    private MazeSolution mazeSolution;

    Maze getMaze() {
        return maze;
    }

    void setMaze(Maze maze) {
        this.maze = maze;
    }

    MazeSolution getMazeSolution() {
        return mazeSolution;
    }

    void setMazeSolution(MazeSolution mazeSolution) {
        this.mazeSolution = mazeSolution;
    }
}
