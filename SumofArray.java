public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {34,45,56,57,2,30,30};
        int n=arr.length;
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);

    }
}
