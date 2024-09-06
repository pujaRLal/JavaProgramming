import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Interval{
    int start;
    int end;
    public Interval(int start,int end)
    {
        this.start=start;
        this.end=end;

    }
}

public class PlatformOverlapping {
    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals)
    {
        if(intervals.size()<2)
        return intervals;
        
        ArrayList<Interval> output=new ArrayList<>();
        //sort the intervals based on start 
        Collections.sort(intervals,(a,b)->Integer.compare(a.start, b.start));
        Interval temp=intervals.get(0);
        int start=temp.start;
        int end=temp.end;
        for(int i=1;i<intervals.size();i++)
        {
            temp=intervals.get(i);
            if(temp.start<=end)
                end=Math.max(end,temp.end);
            else
            {
                output.add(new Interval(start, end));
                start=temp.start;
                end=temp.end;
            }
                
        }
        //for adding the last interval
        output.add(new Interval(start, end));
        return output;
    }
    public static void main(String[] args) {

        Interval arr[] = new Interval[4];
        arr[0] = new Interval(1, 3);
        arr[1] = new Interval(2, 5);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(6, 7);
        ArrayList<Interval> intervalList = new ArrayList<>(Arrays.asList(arr));

       ArrayList<Interval> ans= mergeIntervals(intervalList);
       for(int i=0;i<ans.size();i++)
       {
       System.out.println(ans.get(i).start+","+ans.get(i).end);
        }
    }
    
}
