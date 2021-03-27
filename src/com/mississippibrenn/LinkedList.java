//package com.mississippibrenn;
//
//import java.util.HashMap;
//
//public class LinkedList {
//    class Node {
//        int data;
//        Main.Node next = null;
//
//
//        public Node(int d) {
//            int data = d;
//        }
//
//        void deleteMiddleSelf(Main.Node middle){
//            Main.Node next = middle.next;
//            middle.data = next.data;
//            middle.next = middle.next.next;
//
//
//        }
//        int deleteKthToLast(Main.Node head, int k){
//            if( head == null){
//                return 0;
//            }
//
//            int index = deleteKthToLast(head.next, k)+1;
//
//            if(index == k){
//                System.out.println("Kth to last node is" + head.data);
//            }
//
//            return index;
//
//
//        }
//
//
//        Main.Node kthToLast(Main.Node head, int k){
//            Main.Node n = head;
//            Main.Node kNode = head;
//            int KCount = 0;
//            while(kNode.next != null && KCount != k){
//                kNode = kNode.next;
//                KCount ++;
//            }
//
//            if(KCount == k) {
//                while (kNode.next != null){
//                    kNode = kNode.next;
//                    n = n.next;
//                }
//                return n;
//            } else{
//
//                throw new Error("List shorter than input K");
//            }
//
//        }
//
//        Main.Node removeDupes(Main.Node head){
//            Main.Node n = head;
//            HashMap<Integer, Integer> tempBuffer = new HashMap<Integer, Integer>();
//            //add to hashmap, if hashmap has it remove
//            tempBuffer.put(n.data, 1);
//
//            while(n.next != null){
//                if(tempBuffer.containsKey(n.next.data)){
//                    n.next = n.next.next;
//                }
//            }
//
//
//
//        }
//
//        Main.Node deleteNode(Main.Node head, int d){
//            Main.Node n = head;
//
//            if(n.data == d){
//                return head.next;
//            }
//
//            while(n.next != null){
//                if(n.next.data == d){
//                    n.next = n.next.next;
//                    return head;
//                }
//                n = n.next;
//            }
//            return head;
//        }
//
//        void appendToTail(int d) {
//            Main.Node end = new Main.Node(d);
//            Main.Node n = this;
//            while (n.next != null) {
//                n = n.next;
//            }
//            n.next = end;
//
//        }
//
//    }
//}
