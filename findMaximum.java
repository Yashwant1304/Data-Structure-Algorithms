public class findMaximum {
    public static void main(String[] args) {
        int [] arr= {4,5,13,04,30,6,69};
        int n=arr.length;
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max) max=arr[i];
        }
        System.out.print(max);

    }
}
