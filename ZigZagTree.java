
import java.util.*;

public class ZigZagTree {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(8);
        root.right=new Node(12);
        root.left.left=new Node(6);
        root.left.right=new Node(7);
        root.right.left=new Node(11);
        root.right.right=new Node(14);
        zigZagTraversal(root);
    }

    private static void zigZagTraversal(Node root) {//10 (8 12) (6,7) (11, 14) 
      Queue<Node> q=new LinkedList<>();
      Stack<Integer> s=new Stack<>();
      q.add(root);
      boolean reverse=true;
      while (!q.isEmpty()) {
        int count = q.size();
        for(int i=0;i<count;i++)
        {
            Node curr=q.poll();
            if(reverse){
                System.out.print(curr.data+" ");
            }
            else{
                s.push(curr.data);
            }
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
        if(!reverse)
            {
                while (!s.isEmpty()) {
                System.out.print(s.pop()+" ");
                
                }
            }
        reverse=!reverse;
      }
    }
    
}
