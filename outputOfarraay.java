import java.util.Scanner;

public class outputOfarraay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int[] arr = new int[10];
        for (int i = 0; i <= 9; i++) {
           arr[i]=sc.nextInt(); 
        }
        // int[] arr= new int[10];
        // arr[0]=10;
        // arr[1]=20;
        // arr[2]=30;
        // arr[3]=40;
        // arr[4]=50;
        // arr[5]=60;
        // arr[6]=70;
        // arr[7]=80;
        // arr[8]=90;
        // arr[9]=100;
for (int i = 0; i <=9; i++) {
    System.out.print(arr[i] + " ");
}
    }
}
