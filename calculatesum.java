
import java.util.Scanner;

public class calculatesum{
    public static void main (String[ ] args){
        Scanner sc=new Scanner(System.in);
        int [] arr= {1,2,8,17,27,4,5,10};
        int sum=0;
        for (int x: arr){
            sum=sum+x;
        }
        System.out.print(sum + " ");

    }
}