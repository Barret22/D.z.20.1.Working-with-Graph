package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        System.out.println("Initial graph:");
        graph.printGraph();

        System.out.println("\nContains vertex 2? " + graph.hasVertex(2));
        System.out.println("Contains edge 1-3? " + graph.hasEdge(1, 3));

        graph.removeEdge(1, 3);
        System.out.println("\nGraph after removing edge 1-3:");
        graph.printGraph();

        graph.removeVertex(2);
        System.out.println("\nGraph after removing vertex 2:");
        graph.printGraph();
    }
}
