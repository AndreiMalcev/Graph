import edu.uci.ics.jung.graph.*;

public class Main {



    public static void main(String[] args) {
        UndirectedSparseMultigraph<Integer, Edge> graph = Input.inputGraph();
        DrawGraph.drawGraph(graph);
    }
}
