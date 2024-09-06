public class OddEvenLL {
    public static void main(String[] args) {
        MyNode head=new MyNode(2);
        head.next=new MyNode(3);
        head.next.next=new MyNode(6);
        head.next.next.next=new MyNode(7);
        head.next.next.next.next=new MyNode(1);
        head.next.next.next.next.next=new MyNode(5);
        head.next.next.next.next.next.next=new MyNode(4);
        MyNode curr=head;
        MyNode es=null,ee=null,os=null,oe=null;

        while(curr!=null)
        {
            if(curr.data%2==0)
            {
                if(es==null)
                {
                    es=curr;
                    ee=es;
                }
                else{
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            else{
                if(os==null)
                {
                    os=curr;
                    oe=os;
                }
                else{
                    oe.next=curr;
                    oe=oe.next;
                }
            }
            curr=curr.next;
        }
            ee.next=os;
            oe.next=null;   
            while(es!=null)
            {
                System.out.print(es.data+" ");
                es=es.next;
            }

        


    }
    
}
