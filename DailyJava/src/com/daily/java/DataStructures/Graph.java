package com.daily.java.DataStructures;

import java.util.Stack;

public class Graph {

    int max_Vertx = 6;
    Vertex verticesArray[];

    int adjacentVertices[][];

    int vertCount;

    public Graph() {

        verticesArray = new Vertex[max_Vertx];
        adjacentVertices = new int[max_Vertx][max_Vertx];
        vertCount = 0;

        for (int i = 0; i < max_Vertx - 1; i++) {
            for (int j = 0; j <= max_Vertx - 1; j++) {
                adjacentVertices[i][j] = 0;
            }
        }

    }


    public class Vertex {

        char value;
        boolean isVisited;

        public Vertex(char value) {
            this.value = value;
            this.isVisited = false;
        }

    }

    public void addVertex(char vertexLabel) {

        verticesArray[vertCount++] = new Vertex(vertexLabel);
    }

    public void displayVertex(int vertIndex) {

        System.out.print(verticesArray[vertIndex].value);
    }

    public void addEdges(int start, int end) {
        adjacentVertices[start][end] = 1;
        adjacentVertices[end][start] = 1;
    }

    public void displayAdjacentArray() {
        for (int i = 0; i < adjacentVertices.length - 1; i++) {
            for (int j = 0; j < adjacentVertices.length - 1; j++) {
                System.out.println("Adjacent vertex matrix is" + " " + "[" + i + "]" + "[" + j + "]" + " " + adjacentVertices[i][j]);
            }
        }
    }


    public int getAdjacentVertices(int vertex) {
        int value = 0;
        for (int j = 0; j < max_Vertx - 1; j++) {
            if ((adjacentVertices[vertex][j] == 1) && (verticesArray[j].isVisited == false)) {
                value = j;
                break;
            } else {
                value = -1;

            }
        }

        return value;
    }

    public void depthFirstSearch() {
        Stack<Integer> dfsStack = new Stack<Integer>();
        verticesArray[0].isVisited = true;
        displayVertex(0);
        dfsStack.push(0);

        while (!dfsStack.isEmpty()) {
            int adjacentVertex = getAdjacentVertices(dfsStack.peek());

            if (adjacentVertex == -1) {
                dfsStack.peek();
                //System.out.println("Dead-end vertex is: " + " " + dfsStack.peek());
                //System.out.println("Popping vertex which has no adjacent vertices: " + " " + dfsStack.pop());
                dfsStack.pop();
            } else {
                verticesArray[adjacentVertex].isVisited = true;
                displayVertex(adjacentVertex);
                dfsStack.push(adjacentVertex);
            }
        }


        //resetting isVisited flag as stack is empty and search is done
        for (int i = 0; i < max_Vertx - 1; i++) {
            verticesArray[i].isVisited = false;

        }
    }

    public static void main(String args[]) {
        Graph obj1 = new Graph();
        obj1.addVertex('a');
        obj1.addVertex('b');
        obj1.addVertex('c');
        obj1.addVertex('d');
        obj1.addVertex('e');
        //obj1.addVertex('f');

        obj1.addEdges(0, 1);
        obj1.addEdges(1, 2);
        obj1.addEdges(0, 3);
        obj1.addEdges(3, 4);
        // obj1.addEdges(1, 5);
//        for (int i = 0; i <= obj1.verticesArray.length - 1; i++)
//            obj1.displayVertex(i);
        obj1.displayAdjacentArray();
        System.out.print("Depth search path of vertex is" + " " + "\t");
        obj1.depthFirstSearch();
    }

}
