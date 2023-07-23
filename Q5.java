import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class Q5{
    Node head;
    int size;
    public Q5(){
        head=null;
        size=0;
    }
    public Node input()
    {
        Node current=head;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                Node n1=new Node();
                n1.data=sc.nextInt();
                n1.next=null;
                head=n1;
                current =head;
            }
            else{
                Node n1=new Node();
                n1.data=sc.nextInt();
                n1.next=null;
                current.next=n1;
                current=current.next;
            }
        }
        return head;
    }
    public void traverse()
    {
        Node current=head;
        while(current.next!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println(current.data);
    }
    public void mergeLL(Node head1,Node head2)
    {
        
    }
    public static void main(String[] args) {
        Q5 obj=new Q5();
        Node head1=obj.input();
        Node head2=obj.input();
        obj.mergeLL(head1,head2);
        obj.traverse();
    }
}
