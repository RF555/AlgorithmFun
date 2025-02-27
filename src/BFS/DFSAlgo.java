package BFS;

import java.util.HashSet;
import java.util.Stack;
import java.util.Set;

public class DFSAlgo extends Graph{
    public DFSAlgo(Node root, Node goal) {
        super(root, goal);
    }

    public DFSAlgo(Node start, Node goal, boolean toPrint) {
        super(start, goal, toPrint);
    }

    public boolean DFS() {
        Stack<Node> openNodes = new Stack<>();
        Set<Node> visitedNodes = new HashSet<>();

        openNodes.push(this.start);
        while(!openNodes.isEmpty()) {
            Node currNode = openNodes.pop();
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
