package BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSAlgo {
    public static boolean BFS(Node start, Node goal) {
        Queue<Node> openNodes = new LinkedList<>();
        Set<Node> visitedNodes = new HashSet<>();

        openNodes.add(start);

        while(!openNodes.isEmpty()) {
            Node currNode = openNodes.poll();
            if(currNode.equals(goal)) {
                System.out.println(currNode.getId());
                return true;
            }

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
