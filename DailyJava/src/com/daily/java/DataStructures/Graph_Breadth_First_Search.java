package com.daily.java.DataStructures;

public class Graph_Breadth_First_Search {

    int max_Vertx = 6;
    Vertex verticesArray[];

    int adjacentVertices[][];

    int vertCount;

    public Graph_Breadth_First_Search() {

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

    //Method returns adjacent vertex for a given index of a Vertex
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

    public void breadthFirstSearch() {
        Queue<Integer> breadthQueue = new Queue<Integer>();
        verticesArray[0].isVisited = true;
        displayVertex(0);
        breadthQueue.enQueue(0);

        while (!breadthQueue.isEmpty()) {
            int adjacentVertex = getAdjacentVertices(breadthQueue.peek());

            if (adjacentVertex == -1) {
                breadthQueue.peek();
                //System.out.println("Dead-end vertex is: " + " " + breadthQueue.peek());
                //System.out.println("Popping vertex which has no adjacent vertices: " + " " + breadthQueue.pop());
                breadthQueue.deQueue();
            } else {
                verticesArray[adjacentVertex].isVisited = true;
                displayVertex(adjacentVertex);
                breadthQueue.enQueue(adjacentVertex);
            }
        }


        //resetting isVisited flag as stack is empty and search is done
        for (int i = 0; i < max_Vertx - 1; i++) {
            verticesArray[i].isVisited = false;

        }
    }

    public class Queue<Integer> {
        int[] queueArray;
        int frontIndex;
        int rearIndex;
        int count;

        public Queue() {
            queueArray = new int[max_Vertx];
            count = 0;
            frontIndex = 0;
            rearIndex = -1;

        }

        public boolean isFull() {
            return rearIndex == queueArray.length - 1;
        }

        public boolean isEmpty() {

            return count == 0;
        }

        public void enQueue(int value) {
            if (!isFull()) {
                ++count;
                queueArray[++rearIndex] = value;

            } else {
                System.out.println("Queue is full...");
            }
        }

        public int peek() {
            return queueArray[frontIndex];
        }

        public int deQueue() {
            int value = 0;
            if (!isEmpty()) {
                queueArray[frontIndex++] = value;
                count--;
            } else {
                value = -1;
                System.out.println("Queue is already empty...");
            }
            return value;
        }

    }


    public static void main(String args[]) {
        Graph_Breadth_First_Search obj1 = new Graph_Breadth_First_Search();
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
        System.out.print("Breadth search path of vertex is" + " " + "\t");
        obj1.breadthFirstSearch();
    }

}
