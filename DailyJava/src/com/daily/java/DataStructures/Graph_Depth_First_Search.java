package com.daily.java.DataStructures;

import java.util.Stack;

public class Graph_Depth_First_Search {

    int max_Vertx = 9;
    Vertex verticesArray[];

    int adjacentVertices[][];

    int vertCount;

    public Graph_Depth_First_Search() {

        verticesArray = new Vertex[max_Vertx];
        adjacentVertices = new int[max_Vertx][max_Vertx];
        vertCount = 0;

        for (int i = 0; i < max_Vertx; i++) {
            for (int j = 0; j < max_Vertx; j++) {
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
        for (int i = 0; i < adjacentVertices.length ; i++) {
            for (int j = 0; j < adjacentVertices.length ; j++) {
                System.out.println("Adjacent vertex matrix is" + " " + "[" + i + "]" + "[" + j + "]" + " " + adjacentVertices[i][j]);
            }
        }
    }

//Method returns adjacent vertex for a given index of a Vertex
    public int getAdjacentVertices(int vertex) {
        int value = 0;
        for (int j = 0; j < max_Vertx ; j++) {
            if ((adjacentVertices[vertex][j] == 1) && (verticesArray[j].isVisited == false)) {
                value = j;
                break;
            } else {
                value = -1;

            }
        }

        return value;
    }
/**
 * Rule#1
 * If possible, visit an adjacent unvisited vertex, mark it, and push it on the stack.
 * Rule2#
 * If you can’t follow Rule 1, then, if possible, pop a vertex off the stack.
 * Rule3#
 * If you can’t follow Rule 1 or Rule 2, you’re done.
 */
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
        for (int i = 0; i < max_Vertx; i++) {
            verticesArray[i].isVisited = false;

        }
    }

    public static void main(String args[]) {
        Graph_Depth_First_Search obj1 = new Graph_Depth_First_Search();
        obj1.addVertex('a');
        obj1.addVertex('b');
        obj1.addVertex('c');
        obj1.addVertex('d');
        obj1.addVertex('e');
        obj1.addVertex('f');
        obj1.addVertex('g');
        obj1.addVertex('h');
        obj1.addVertex('i');

        obj1.addEdges(0, 1);
        obj1.addEdges(0, 2);
        obj1.addEdges(1, 3);
        obj1.addEdges(2, 4);
        obj1.addEdges(3, 5);
        obj1.addEdges(2, 6);
        obj1.addEdges(3, 7);
        obj1.addEdges(4, 8);
//        for (int i = 0; i <= obj1.verticesArray.length - 1; i++)
//            obj1.displayVertex(i);
        obj1.displayAdjacentArray();
        System.out.print("Depth search path of vertex is" + " " + "\t");
        obj1.depthFirstSearch();
    }

}
