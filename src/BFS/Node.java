package BFS;

import java.util.ArrayList;
import java.util.Objects;

public class Node {
    private final String id;
    private final ArrayList<Node> children;

    public Node(String id) {
        this.id = id;
        this.children = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Node node = (Node)obj;
        return Objects.equals(this.id, node.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
