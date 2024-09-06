public class IntersectionTwoLL {
    public static void main(String[] args) {
        MyNode head=new MyNode(1);
        head.next=new MyNode(9);
        head.next.next=new MyNode(1);
        head.next.next.next=new MyNode(2);
        head.next.next.next.next=new MyNode(4);//1 9 1 2 4


        MyNode head1=new MyNode(3);
        head1.next=new MyNode(2);
        head1.next.next=new MyNode(4);//3 2 4

      int n1= calculateLength(head);
     int n2= calculateLength(head1);
     if(n1>n2)
     {
        for(int i=0;i<(n1-n2);i++)
        head=head.next;
     }
     else
     {
        for(int i=0;i<(n2-n1);i++)
        head1=head1.next;
     }

     while(head!=null && head1!=null)
     {
        if(head.data==head1.data){
        System.out.print(head.data);
        break;
        }
        head=head.next;
        head1=head1.next;
     }

    }

    private static int calculateLength(MyNode head) {
        MyNode curr=head;
        int count=0;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        return count;
    }
}
