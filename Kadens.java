public class Kadens {
    public static void main(String[] args) {
      int arr[] = {1, 2, 3, -2, 5};
      int maxh=0;
        int maxf=0;


      for(int i=0;i<arr.length;i++)
      {
          maxh+=arr[i];
          if(maxh<0)
          {
            maxh=0;
          }
            
        else
            maxf=Math.max(maxh,maxf);
      }
      System.out.println(maxf);
       
    }
    
}

