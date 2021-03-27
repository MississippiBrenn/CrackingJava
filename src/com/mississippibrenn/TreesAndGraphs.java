//package com.mississippibrenn;
//
//import java.util.ArrayList;
//
//public class TreesAndGraphs {
//    public class MyTree<T> {
//        public TreeNode<T> root;
//
//    }
//
//    private class TreeNode<T> {
//        private ArrayList<TreeNode> children;
//        private int data;
//        private boolean visited;
//
//
//
//        private TreeNode<T> root;
//
//        private class BinaryTreeNode<T>{
//            private BinaryTreeNode<T> right;
//            private BinaryTreeNode<T> left;
//            private int data;
//            private boolean visited = false;
//        }
//
//        public void inOrderTraversal(BinaryTreeNode<T> root){
//            if(root != null){
//                inOrderTraversal(root.right);
//                root.visited = true;
//                inOrderTraversal(root.left);
//            }
//        }
//
//        public void preOrderTraversal(BinaryTreeNode<T> root){
//            if(root != null){
//                root.visited = true;
//                preOrderTraversal(root.left);
//                preOrderTraversal(root.right);
//            }
//        }
//
//        public void postOrderTraversal(BinaryTreeNode<T> root){
//            if(root != null){
//                postOrderTraversal(root.left);
//                postOrderTraversal(root.right);
//                root.visited = true;
//
//            }
//        }
//    }
//
//
//
//
//
//    public class Node {
//        private ArrayList<Node> adjacent;
//        private int data;
//        private boolean visited;
//
//        public void searchDFS(Node root){
//            if(root == null) return;
//            root.visited = true;
//
//            for (Node n : root.adjacent) {
//                if(n.visited == false) {
//                    searchDFS(n);
//                }
//            }
//        }
//
//        public void searchBFS(Node root) {
//            LinkedList<Node> q = new LinkedList<>();
//
//            root.visited = true;
//            q.add(root);
//
//            if (!q.isEmpty()) {
//                //remove first thing in the list
//                q.remove(0);
//                for (Node n : root.adjacent) {
//                    if (n.visited == false) {
//                        n.visited = true;
//                        q.add(n);
//                    }
//                }
//            }
//        }
//
//        // find root
//        // build root
//        // return root node
//        // take middle value
//        // take left subarray
//        // take right subarray
////        public TreeNode.BinaryTreeNode smolestTree(ArrayList<Integer> list, int start, int end){
////            if(end < start){
////                return null;
////            }
////
////            int midIndex = list.size()/2;
////
////            TreeNode.BinaryTreeNode head = new TreeNode.BinaryTreeNode();
////            head.data = list.get(midIndex);
////            head.left = smolestTree(list, 0, midIndex-1);
////            head.right = smolestTree(list, list.size()-1, midIndex + 1);
////
////
////
////            return head;
////
////        }
//
//
//
//        public boolean hasRouteLinear(Node n1, Node n2){
//            if(n1 ==n2){return true;}
//
//            LinkedList<Node> que = new LinkedList<>();
//            n1.visited = true;
//            que.add(n1);
//
//            if(!que.isEmpty()){
//                Node dequedNode = que.remove(0);
//                if(dequedNode == n2){return true;}
//                for(Node n : n1.adjacent){
//                    if(n.visited == false) {
//                        que.add(n);
//                    }
//                }
//            }
//            return false;
//
//        }
//
//        public boolean hasRouteRecursive(Node n1, Node n2){
//            if(n1 == n2){return true;}
//            if(n1 == null){return false;}
//            for(Node n: n1.adjacent){
//                if(n == n2){
//                    return true;
//                }
//                hasRouteRecursive(n, n2);
//            }
//
//
//        }
//
//
//        public ArrayList<Node> shortestRoute(Node n1, Node n2){
//            LinkedList<Node> q1 = new LinkedList<>();
//            LinkedList<Node> q2 = new LinkedList<>();
//
//            ArrayList<Node> path1 = new ArrayList<>();
//            ArrayList<Node> path2 = new ArrayList<>();
//
//            path1.add(n1);
//
//            n1.visited = true;
//            n2.visited = true;
//
//            if( n1 != n2){
//                if(!q1.isEmpty()){
//                    //remove first thing in the list
//                    Node matchTo =  q1.remove(0);
//                    for (Node n : n1.adjacent){
//                        if(n.visited == false) {
//                            n.visited = true;
//                            q1.add(n);
//                        }
//                    }
//                }
//
//            }else {
//                return path1;
//            }
//
//        }
//
//
//    }
