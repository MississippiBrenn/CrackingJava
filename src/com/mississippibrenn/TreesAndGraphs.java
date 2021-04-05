package com.mississippibrenn;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class TreesAndGraphs {


    public class Node {
        Node[] adjacent;
        boolean visited;
        int val;
    }


    // route between Nodes use a bi directional search


   public boolean biDiSearch(Node n1, Node n2){

        return DFSSeeker(n1, n2) || DFSSeeker(n2,n1);


   }

    public boolean DFSSeeker(Node head, Node seeking) {
        if (head == null) {
            return false;
        }

        if(seeking == head){return true;}
        System.out.println("node " + head.val);
        for (Node n : head.adjacent) {
            if (n.visited == false) {
                n.visited = true;
                DFS(n);

            }
        }
        return false;
    }

    public void DFS(Node head) {
        if (head == null) {
            return;
        }
        System.out.println("node " + head.val);
        for (Node n : head.adjacent) {
            if (n.visited == false) {
                n.visited = true;
                DFS(n);

            }
        }

    }

    public void BFS(Node head){
        if(head == null){return;}

        ArrayList<Node> q = new ArrayList<>();

        q.add(head);
        head.visited = true;
        while(!q.isEmpty()){
            Node n = q.get(q.size()-1);
            System.out.println("node " + n);
            for( Node child: n.adjacent){
                q.add(0, child);
            }


        }

    }

}