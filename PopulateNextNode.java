public class PopulateNextNode {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(6);
        root.left.right=new Node(7);
        root.right.left=new Node(11);
        root.right.right=new Node(14);
      Node output=  populateNext(root.right);
      System.out.println(output.data);
       
    }

    private static Node populateNext(Node root) {
        Node black=root;
        while(black!=null && black.left!=null)
        {
            Node n=black;
            while(true)
            {
                n.left.next=n.right;
                if(n.next==null)  break;
                n.right.next=n.next.next;
                n=n.next;

            }
            black=black.next;
        }
        return root;
    }
}
