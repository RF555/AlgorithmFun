package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSAlgo extends Graph {

    public BFSAlgo(Node root, Node goal) {
        super(root, goal);
    }

    public BFSAlgo(Node start, Node goal, boolean toPrint) {
        super(start, goal, toPrint);
    }

    public boolean BFS() {
        Queue<Node> openNodes = new LinkedList<>();
        Set<Node> visitedNodes = new HashSet<>();

        openNodes.add(this.start);

        while(!openNodes.isEmpty()) {
            Node currNode = openNodes.poll();
            if(currNode.equals(this.goal)) {
                if(this.toPrint)
                    System.out.println(currNode.getId() + "\nFound " + currNode.getId() + '!');
                return true;
            }

            if(this.toPrint)
                System.out.print(currNode.getId() + ", ");
            visitedNodes.add(currNode);
            for(Node child : currNode.getChildren()) {
                if(!openNodes.contains(child) && !visitedNodes.contains(child)) {
                    openNodes.add(child);
                }
            }
        }
        return false;

    }
}
