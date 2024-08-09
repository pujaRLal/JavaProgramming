import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreatestElem {
        public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        List<Integer> alist=new ArrayList<Integer>();
        int arr[]={18,12,13,14,11,16};
        st.push(arr[arr.length-1]);
            alist.add(-1);
        for(int i=arr.length-2;i>=0;i--)
        {
            while(st.isEmpty()==false && st.peek()<arr[i])
            {
                st.pop();
            }
            int nge = st.isEmpty()?-1:st.peek();
            alist.add(nge);
            st.push(arr[i]);

        }
Collections.reverse(alist);
        System.out.println(alist);
        }


    
}
