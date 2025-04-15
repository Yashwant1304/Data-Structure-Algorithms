

public class LowestMarks {
    public static void main(String[] args) {
       System.out.print("Marks less than 35 is : ");
        int[] arr = {34,45,56,57,2,30,40};
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            if(arr[i]<35)
            System.out.print(i + "," +" ");
        }
    }

} 