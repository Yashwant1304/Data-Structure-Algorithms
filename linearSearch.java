import java.util.*;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target element:");
        int x=sc.nextInt();
        System.out.print("Enter Array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array element ");
        for (int i = 0; i <n; i++) {
            arr [i]=sc.nextInt();
        }
    boolean flag =false;
    for (int i = 0; i < n; i++) {
     if(arr[i]==x){ 
     flag =true;
        break;
        }
    }
    if(flag==true) System.out.println("Enter Found");
    else System.out.println("Element not found");
    }
}