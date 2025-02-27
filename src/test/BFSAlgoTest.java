package test;

import BFS.BFSAlgo;
import BFS.Node;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BFSAlgoTest {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");
        Node l = new Node("L");
        Node m = new Node("M");
        Node n = new Node("N");
        Node o = new Node("O");
        Node p = new Node("P");
        Node q = new Node("Q");

    @Test
    public void binaryTreeTest() {
        a.addChild(b);
        a.addChild(c);

        b.addChild(d);

        c.addChild(e);
        c.addChild(f);

        e.addChild(g);
        e.addChild(h);

        BFSAlgo bfs = new BFSAlgo(a, h, true);

        Assertions.assertTrue(bfs.BFS());
    }

    @Test
    public void complex14Test(){
        a.addChild(b);
        a.addChild(c);

        b.addChild(d);
        b.addChild(e);
        b.addChild(f);

        c.addChild(g);
        c.addChild(h);

        d.addChild(i);
        d.addChild(j);

        f.addChild(k);
        f.addChild(l);

        h.addChild(m);
        h.addChild(n);

        BFSAlgo bfs = new BFSAlgo(a, n, true);
        Assertions.assertTrue(bfs.BFS());
    }

    @Test
    public void complex17Test(){
        a.addChild(b);
        a.addChild(c);

        b.addChild(d);
        b.addChild(e);

        c.addChild(f);
        c.addChild(g);

        e.addChild(h);
        e.addChild(i);

        g.addChild(j);
        g.addChild(k);

        h.addChild(l);
        h.addChild(m);
        h.addChild(n);

        i.addChild(o);
        i.addChild(p);

        k.addChild(q);

        BFSAlgo bfs = new BFSAlgo(a, q, true);
        Assertions.assertTrue(bfs.BFS());
    }

}