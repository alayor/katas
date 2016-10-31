package katas.misc.maze.features;

import katas.misc.maze.Maze;
import katas.misc.maze.MazeSolution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MazeSolutionTest {

    @Test
    public void given_there_is_no_maze_then_result_should_be_negative_1() {
        MazeSolution mazeSolution = new MazeSolution(null);
        assertEquals(-1, mazeSolution.getMinSteps());
    }

    @Test
    public void given_exit_is_at_0_0_then_result_should_be_0() {
        Maze maze = new Maze(new int[][]{{0}}, 1, 1, 0, 0);
        MazeSolution mazeSolution = new MazeSolution(maze);
        assertEquals(0, mazeSolution.getMinSteps());
    }

    @Test
    public void given_exit_is_at_0_1_then_result_should_be_1() {
        Maze maze = new Maze(new int[][]{{0, 0}}, 1, 2, 0, 1);
        MazeSolution mazeSolution = new MazeSolution(maze);
        assertEquals(1, mazeSolution.getMinSteps());
    }

    @Test
    public void given_exit_is_at_1_1_then_result_should_be_2() {
        Maze maze = new Maze(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {1, 0, 0, 0}}, 3, 4, 1, 1);
        MazeSolution mazeSolution = new MazeSolution(maze);
        assertEquals(2, mazeSolution.getMinSteps());
    }
}
