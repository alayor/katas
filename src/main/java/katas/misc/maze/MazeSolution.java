package katas.misc.maze;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class MazeSolution {

    private Maze maze;

    public MazeSolution(Maze maze) {
        this.maze = maze;
    }

    public int getMinSteps() {
        if (maze == null) return -1;
        Node origin = new Node(0, 0);
        return findMinSteps(origin);
    }

    private void fillConnections(Node node) {
        if (node.i - 1 >= 0 && maze.getMaze()[node.i - 1][node.j] == 0) node.up = new Node(node.i - 1, node.j);
        if (node.i + 1 < maze.getRows() && maze.getMaze()[node.i + 1][node.j] == 0) node.down = new Node(node.i + 1, node.j);
        if (node.j - 1 >= 0 && maze.getMaze()[node.i][node.j - 1] == 0) node.left = new Node(node.i, node.j - 1);
        if (node.j + 1 < maze.getColumns() && maze.getMaze()[node.i][node.j + 1] == 0) node.right = new Node(node.i, node.j + 1);
    }

    private int findMinSteps(Node origin) {
        Queue<Node> queue = new LinkedBlockingQueue<>();
        queue.add(origin);
        Set<Node> visited = new HashSet<>();
        int steps = 0;
        boolean found = false;
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if(visited.contains(current)) continue;
            fillConnections(current);
            if (current.up != null) queue.add(current.up);
            if (current.down != null) queue.add(current.down);
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);

            if (current.i != maze.getExitRow() || current.j != maze.getExitColumn()) {
                steps++;
            }
            if (current.i == maze.getExitRow() && current.j == maze.getExitColumn()) {
                found = true;
                break;
            }
            visited.add(current);
        }
        return found ? steps : -1;
    }

    static class Node {
        int i;
        int j;
        Node up;
        Node down;
        Node left;
        Node right;

        Node(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public Node getUp() {
            return up;
        }

        public void setUp(Node up) {
            this.up = up;
        }

        public Node getDown() {
            return down;
        }

        public void setDown(Node down) {
            this.down = down;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public boolean equals(Object obj) {
            Node that = (Node) obj;
            return i == that.i && j == that.j;
        }

        @Override
        public int hashCode() {
            return 17;
        }
    }
}
