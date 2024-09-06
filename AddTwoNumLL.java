public class AddTwoNumLL {
    public static void main(String[] args) {
        MyNode head=new MyNode(5);
        head.next=new MyNode(6);
        head.next.next=new MyNode(4);//564

        MyNode head1=new MyNode(2);
        head1.next=new MyNode(4);
        head1.next.next=new MyNode(3);//243

       MyNode nHead= rev(head);
        MyNode nHead1=rev(head1);
        
        int carry=0;
        MyNode sum=null;

        while(nHead!=null || nHead1!=null || carry>0)
        {
            int newval=carry;
            if(nHead!=null)
                newval+=nHead.data;
            if(nHead1!=null)
                newval+=nHead1.data;   

             carry=newval/10;
             newval=newval%10;
             
             MyNode newNode=new MyNode(newval);
             newNode.next=sum;
             sum=newNode;
             if(nHead!=null)
                nHead=nHead.next;
             if(nHead1!=null)
                nHead1=nHead1.next;   
        } 
           while(sum!=null)
           {
            System.out.print(sum.data+" ");
            sum=sum.next;
           }
       



    }

    private static MyNode rev(MyNode head) {
        MyNode prev=null,next=null;
        MyNode curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
