public class SetZeros {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int row=arr.length;//3
        int col=arr[0].length;//3
        boolean[] zeroRows=new boolean[row];
        boolean[] zeroCol=new boolean[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==0)
                {
                    zeroRows[i]=true;
                    zeroCol[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(zeroRows[i]||zeroCol[j])
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
           
           

    }
    
}
