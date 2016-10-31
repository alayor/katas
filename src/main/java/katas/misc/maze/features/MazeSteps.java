package katas.misc.maze.features;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import katas.misc.maze.Maze;
import katas.misc.maze.MazeSolution;

import java.util.List;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;

public class MazeSteps implements En {

    public MazeSteps(MazeHolder mazeHolder) {

        Given("^The exit row (\\d+) and exit column (\\d+) with following maze:$", (Integer exitRow, Integer exitColumn, DataTable table) -> {
            final int[][] rawMaze = buildRawMaze(table);
            Maze maze = new Maze(rawMaze, rawMaze.length, rawMaze[0].length, exitRow, exitColumn);
            mazeHolder.setMaze(maze);
            mazeHolder.setMazeSolution(new MazeSolution(maze));

        });
        Then("^the result should be (-*\\d+)$", (Integer steps) ->
                assertEquals(steps.intValue(), mazeHolder.getMazeSolution().getMinSteps()));
    }

    private int[][] buildRawMaze(DataTable table) {
        int rows = table.raw().size();
        int columns = table.raw().get(0).size();
        int[][] rawMaze = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                rawMaze[i][j] = parseInt(table.raw().get(i).get(j));
            }
        }
        return rawMaze;
    }
}
