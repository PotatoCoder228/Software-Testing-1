package ru.itmo.potatocoder228.tpo.task2;

import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class Node {

    private String name;

    private List<Node> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Node(String name) {
        this.name = name;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public String getName() {
        return this.name;
    }

    public List<Node> getShortestPath() {
        return this.shortestPath;
    }

    public void setShortestPath(List<Node> path) {
        this.shortestPath = path;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return this.adjacentNodes;
    }
}