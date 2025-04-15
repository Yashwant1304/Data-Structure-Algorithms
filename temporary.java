public class temporary {
 public static void main(String[] args) {
    int arr [] ={1,3,14,6,7,100,34,53,56};
// int p=Integer.MAX_VALUE;
// for (int i = 0; i < arr.length; i++) {
//     if(arr[i]>p){
//         p=arr[i];
//     }
// }
for (int i = 0; i < arr.length-1; i++) {
    if(arr[i]>arr[i+1]){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }  
}
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
 }
}
