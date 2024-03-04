package ru.itmo.potatocoder228.tpo;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.itmo.potatocoder228.tpo.task2.*;

public class DijktraTest {
    @Test
    public void TestDijkstraViki() {
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        Node node6 = new Node("6");

        node1.addDestination(node2, 7);
        node1.addDestination(node3, 9);
        node1.addDestination(node6, 14);

        node2.addDestination(node1, 7);
        node2.addDestination(node3, 10);
        node2.addDestination(node4, 15);

        node3.addDestination(node1, 9);
        node3.addDestination(node2, 10);
        node3.addDestination(node4, 11);
        node3.addDestination(node6, 2);

        node4.addDestination(node2, 15);
        node4.addDestination(node3, 11);
        node4.addDestination(node5, 6);

        node5.addDestination(node4, 6);
        node5.addDestination(node6, 9);

        node6.addDestination(node1, 14);
        node6.addDestination(node3, 2);
        node6.addDestination(node5, 9);

        Graph graph = new Graph();

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);
        graph.addNode(node6);

        graph.calculateShortestPathFromSource(node1);
        assertEquals(0, (int) node1.getDistance());
        assertEquals(7, (int) node2.getDistance());
        assertEquals(9, (int) node3.getDistance());
        assertEquals(20, (int) node4.getDistance());
        assertEquals(20, (int) node5.getDistance());
        assertEquals(11, (int) node6.getDistance());
    }

    @Test
    public void TestDijkstraCs() {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node5 = new Node("5");
        Node node7 = new Node("7");

        node0.addDestination(node1, 8);
        node0.addDestination(node2, 8);
        node0.addDestination(node3, 6);

        node1.addDestination(node0, 8);
        node1.addDestination(node3, 3);
        node1.addDestination(node5, 6);

        node2.addDestination(node0, 8);
        node2.addDestination(node5, 9);

        node3.addDestination(node0, 6);
        node3.addDestination(node1, 3);
        node3.addDestination(node5, 7);

        node5.addDestination(node1, 6);
        node5.addDestination(node2, 9);
        node5.addDestination(node3, 7);
        node5.addDestination(node7, 3);

        node7.addDestination(node5, 3);

        Graph graph = new Graph();

        graph.addNode(node0);
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node5);
        graph.addNode(node7);

        graph.calculateShortestPathFromSource(node0);
        assertEquals(0, (int) node0.getDistance());
        assertEquals(8, (int) node1.getDistance());
        assertEquals(8, (int) node2.getDistance());
        assertEquals(6, (int) node3.getDistance());
        assertEquals(13, (int) node5.getDistance());
        assertEquals(16, (int) node7.getDistance());
    }
}