import java.util.Stack;

public class PreviousGreatest {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int arr[]={12,9,11,10,13,14,12};//o/p:-1,12,12,11,-1,-1,14
        st.push(arr[0]);
        System.out.println("-1");
        for(int i=1;i<arr.length;i++)
        {
            while (st.isEmpty()==false && st.peek()<arr[i]) {
                st.pop();
            }
            int span=st.isEmpty()?-1:st.peek();
            System.out.println(span);
            st.push(arr[i]);
        }
        {

        }
    }
}
