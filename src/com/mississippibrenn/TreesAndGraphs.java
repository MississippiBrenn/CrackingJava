package com.mississippibrenn;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class TreesAndGraphs {


    public class Node {
        Node[] adjacent;
        boolean visited;
        int val;
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