import java.util.*;
import java.util.Scanner;
 
class DeleteElement
{  
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
 
     System.out.println("Enter the number of elements:") ;
     int size = sc.nextInt();
     
       int[] a = new int[size];
 
        System.out.println("Enter the elements") ;
       for(int i=0;i<size;i++)
     {
         a[i] = sc.nextInt();
     }
 
       System.out.println("Enter the position of the number which is to be deleted");
       int pos = sc.nextInt();
    
         for(int i=pos;i<size-1;i++)
     	{
         a[i]=a[i+1];
     }
     size=size-1;
     
   System.out.println("\n on deleting new array we get is\n");
     for(int i=0;i<size;i++) 
     {
         System.out.println("a["+i+"] = "+a[i]);
     }
 }
}
