package com.mississippibrenn;


import java.util.ArrayList;
import java.util.HashMap;

public class LinkedList {
    class Node {
        int data;
        Node next = null;


        public Node(int d) {
            int data = d;
        }

        public boolean palindrome(Node head){
            //reverse and compare
            if(head == null){return true;}
            ArrayList<Node> checkMe = new ArrayList<>();
            ArrayList<Node> checkMe2 = new ArrayList<>();

            while( head != null){
            checkMe.add(head);
            checkMe2.add(-1,head);
            }

           return checkMe == checkMe2;
        }

        public int toInteger(Node head){
            int runSum = 0;
            runSum += head.data;
            head = head.next;

            while(head != null){
                   runSum += head.data * 10;
            }

            return runSum;
        }

        public int sumLists(Node firstNum, Node secondNum){
             if(firstNum == null && secondNum == null){return 0;}

            return toInteger(firstNum) + toInteger(secondNum);
        }

        public void partition(Node head, int partition){
            if(head == null){return;}

            ArrayList<Node> lessThan = new ArrayList<>();
            ArrayList<Node> moreThan = new ArrayList<>();

            Node n = head;

            while(n != null){
                if(n.data < partition){
                    lessThan.add(n);
                }else if(n.data >= partition){
                    moreThan.add(n);
                }
            n = n.next;
            }

            lessThan.get(lessThan.size()-1).next = moreThan.get(0);
        }

        void deleteMiddleSelf(Node middle){
            Node next = middle.next;
            middle.data = next.data;
            middle.next = middle.next.next;


        }
        int deleteKthToLast(Node head, int k){
            if( head == null){
                return 0;
            }

            int index = deleteKthToLast(head.next, k)+1;

            if(index == k){
                System.out.println("Kth to last node is" + head.data);
            }

            return index;


        }


        Node kthToLast(Node head, int k){
            Node n = head;
            Node kNode = head;
            int KCount = 0;
            while(kNode.next != null && KCount != k){
                kNode = kNode.next;
                KCount ++;
            }

            if(KCount == k) {
                while (kNode.next != null){
                    kNode = kNode.next;
                    n = n.next;
                }
                return n;
            } else{

                throw new Error("List shorter than input K");
            }

        }

        public void removeDupes(Node head){
            Node n = head;
            HashMap<Integer, Integer> tempBuffer = new HashMap<Integer, Integer>();
            //add to hashmap, if hashmap has it remove
            tempBuffer.put(n.data, 1);

            while(n.next != null){
                if(tempBuffer.containsKey(n.next.data)){
                    n.next = n.next.next;
                }
            }

        }

        Node deleteNode(Node head, int d){
            Node n = head;

            if(n.data == d){
                return head.next;
            }

            while(n.next != null){
                if(n.next.data == d){
                    n.next = n.next.next;
                    return head;
                }
                n = n.next;
            }
            return head;
        }

        void appendToTail(int d) {
             Node end = new  Node(d);
             Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;

        }

    }
}
