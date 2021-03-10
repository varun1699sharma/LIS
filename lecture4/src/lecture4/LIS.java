package lecture4;
import java.util.*;
public class LIS {
    public static void main(String[] args) {
        int l[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        ArrayList l1 = new ArrayList();
        ArrayList l2= new ArrayList();
        int min;
        int count = 0;
        for(int i = 0; i < l.length;i++)
        {
            min= Integer.MIN_VALUE;
            for(int j = i;j < l.length; j++)
            {
                if(l[j] > min)
                {
                    l1.add(l[j]);
                    min= l[j];
                }
            }
            if(count< l1.size())
            {
                count= l1.size();
                l2 = new ArrayList(l1);  
            }   
            l1.clear();
        } 
        
        for(int i=0; i<l.length; i++)
            System.out.print(l[i]+" ");
        
        System.out.println("\nLength of LIS is: " +count);
        Iterator it = l2.iterator();
        System.out.println("Subsequence is");
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }
}
     

