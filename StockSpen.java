import java.util.Stack;

public class StockSpen {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int arr[]={18,12,13,14,11,16};
        st.push(0);
        System.out.println("1");

        for(int i=1;i<arr.length;i++)
        {
            while(st.isEmpty()==false && arr[st.peek()]<arr[i])
            {
                st.pop();
            }
            int span=st.isEmpty()?i+1:i-st.peek();
            System.out.println(span);
            st.push(i);
        }

    }
}
