 class Node {
    int data;
    Node next;


}
class Main{
static Node head=null;
public static boolean iscycle(){
    Node rabbit=head;
    Node turtle=head;
    boolean cycle=false;
    while (rabbit.next!=null && rabbit.next.next!=null) {
        rabbit = rabbit.next.next;
        turtle = turtle.next;
        if (rabbit == turtle) {
            return true;
        }

    }
        return false;

}
public static void removecycle(){
    Node rabbit=head;
    Node turtle=head;
    boolean cycle=false;
    while (rabbit.next!=null && rabbit.next.next!=null){
        rabbit=rabbit.next.next;
        turtle=turtle.next;
        if(rabbit==turtle){
            cycle=true;
            break;
        }

    }
    if(cycle==false)
        return;
    turtle=head;
    Node prev=null;
    while (rabbit!=turtle){
        prev=rabbit;
        turtle=turtle.next;
        rabbit=rabbit.next;
    }
    prev.next=null;
}


    public static void main(String[] args) {
        Node n=new Node();
        n.data=1;
        Node n2=new Node();
        n2.data=2;
        n.next=n2;
        Node n3=new Node();
        n3.data=3;
        n2.next=n3;
        n3.next=n2;
        head=n;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());



    }
}
