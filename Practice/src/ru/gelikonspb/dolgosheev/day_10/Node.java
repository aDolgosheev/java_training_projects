package ru.gelikonspb.dolgosheev.day_10;

public class Node {
    private Node nodeLeft;
    private Node nodeRight;
    private int root = 20;

    public Node(int root, Node nodeLeft, Node nodeRight) {
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
        this.root = root;
    }
}
