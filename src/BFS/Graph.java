package BFS;

public class Graph {
    Node start;
    Node goal;
    boolean toPrint;

    public Graph(Node root, Node goal){
        this.start = root;
        this.goal = goal;
        this.toPrint = false;
    }

    public Graph(Node start, Node goal, boolean toPrint){
        this.start = start;
        this.goal = goal;
        this.toPrint = toPrint;
    }
}
