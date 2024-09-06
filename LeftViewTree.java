import java.util.*;

public class LeftViewTree {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(6);
        root.left.right=new Node(7);
        root.right.left=new Node(11);
        root.right.right=new Node(14);
        leftView(root);
    }

    private static void leftView(Node root) {
        Queue<Node> q =new LinkedList<>();
        if(root==null)
        System.out.print("No data available");
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                //leftview
                // if(i==0){
                //     System.out.println(curr.data);
                // }

                //rightview
                if(i==count-1)
                {
                     System.out.println(curr.data);

                }
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);

            }
        }

       
    }
}
