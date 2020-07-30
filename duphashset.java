import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class dup_hashset
{
    public static void main(String[] args) 
    {   
         Scanner sc =new Scanner(System.in);
         int n= sc.nextInt();
         int a[]=new int[n];
         for(int j=0;j<n;j++)
         {
             a[j]=sc.nextInt();
         }
        sc.close();
        
        Set<Integer> hash = new HashSet<Integer>();
        
         for(int j=0;j<n;j++) 
        {
           
           if(hash.add(a[j]) == false) 
            {
                System.out.println("dup"+a[j]);
            }
        }
    }
}