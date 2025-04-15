public  class findMinnimum {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // if(arr[i]<min) min=arr[i];
            min=Math.min(min,arr[i]);   //choose any one
            // min=Math.min(min,arr[i]);
        }
        System.out.print(min);
    }

}