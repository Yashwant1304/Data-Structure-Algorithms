public class secondLargest {
public static void main(String[] args) {
    int [] arr={100,22,33,44,66,77,88,99,100,300,301};
    int n=arr.length;
    int max=arr[0];
    for (int i = 0; i < n; i++) {
        if(arr[i]>max) max=arr[i-1];
    }
    System.out.print(max);
}
}
