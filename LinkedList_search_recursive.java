import java.util.LinkedList;

public class LinkedList_search_recursive {
    public static class Node{
        int data;
        Node next;
        Node(int value){
            this.data=value;
            this.next=null;
        }
    }
public static Node head;
    public static int helper(Node head,int key){
        if(head==null)
            return -1;
        if(head.data==key)
            return 0;
        int index=helper(head.next,key);
        if(index==-1)
            return -1;
        return index+1;
    }
    public static int search(int key){
        return helper(head,key);
    }



    public static void main(String[] args) {
        LinkedList_search_recursive ll=new LinkedList_search_recursive();
        Node n=new Node(1);
        Node n2=new Node(2);
        n.next=n2;
        Node n3=new Node(3);
        Node n4=new Node(4);
        n2.next=n3;
        n3.next=n4;
        head=n;
        System.out.println(search(4));

    }
}
