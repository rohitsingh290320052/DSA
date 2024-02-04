import java.util.List;

class ListNode {
    int data;
    ListNode next;

}
class main{
    static ListNode head;

    public static void zic_zac(){
        // find mid
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode mid=slow;

        // reverse 2nd half
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        ListNode left=head;
        ListNode right=prev;

        // zic zac merge
        ListNode nextL, nextR;
        while (left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;


        }
    }
    public static void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();}



    public static void main(String[] args) {
        ListNode n=new ListNode();
        n.data=1;
        ListNode n2=new ListNode();
        n2.data=2;
        n.next=n2;
        ListNode n3=new ListNode();
        n3.data=3;
        n2.next=n3;
        n3.next=n2;
        ListNode n4=new ListNode();
        n4.data=4;
        n3.next=n4;
        head=n;
        display();
        zic_zac();
        display();


    }
}