package BFS;

public class MainBFS {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");

        a.addChild(b);
        a.addChild(c);

        b.addChild(d);

        c.addChild(e);
        c.addChild(f);

        e.addChild(g);
        e.addChild(h);

        BFSAlgo.BFS(a,h);
    }

}
