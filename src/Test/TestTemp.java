package Test;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import javafx.stage.Screen;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


/*public class TestTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number1 = in.nextLine();
        ArrayList<Integer>[] graph = new ArrayList[n];
       /* ArrayList<Integer>[] weight = new ArrayList[n];*/
      /*  for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
          //  weight[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            String number = in.nextLine();
            if (number != "") {
                for (String s : number.split(" ")) {
                    graph[i].add(Integer.parseInt(s));
                }
            }
        }
      /*  }
        for (int i = 0; i < n; i++) {
            String number = in.nextLine();
            if (number != "") {
                for (String s : number.split(" ")) {
                    weight[i].add(Integer.parseInt(s));
                }
            }
        }*/


     /*   Graph<Integer, String> Graph = new SparseMultigraph<Integer, String>();
        for (int i = 0; i < graph.length; i++) {
            Graph.addVertex(i);
        }
        int k=0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                String str =Integer.toString(k); //weight[i].get(j).toString();
                int temp = graph[i].get(j);
                Graph.addEdge(str, j, temp);
                k++;
            }
        }

        Layout<Integer, String> layout = new CircleLayout(Graph);
        layout.setSize(new Dimension(300,300)); // sets the initial size of the space
        BasicVisualizationServer<Integer,String> vv = new BasicVisualizationServer<Integer,String>(layout);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth()-10;
        int height = (int) screenSize.getHeight();
        vv.setPreferredSize(new Dimension(width,height)); //Sets the viewing area size
        JFrame frame = new JFrame("Simple Graph View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
        }
}*/
