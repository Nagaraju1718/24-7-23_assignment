import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class Q6{
    Node head;
    int size;
    public Q6(){
        head=null;
        size=0;
    }
    public void input()
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
        sc.close();
    }


    public void removeDuplicates()
    {
        Node temp1, temp2, temp;
        temp1= head;
        while (temp1 != null && temp1.next != null)
        {
            temp2 = temp1;
            while (temp2.next != null)
            {
                if (temp1.data == temp2.next.data)
                {
                    temp = temp2.next;
                    temp2.next = temp.next.next;
                }
                else
                    temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
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
    public static void main(String[] args) {
        Q6 obj=new Q6();
        obj.input();
        obj.removeDuplicates();
        obj.traverse();
    }

}
