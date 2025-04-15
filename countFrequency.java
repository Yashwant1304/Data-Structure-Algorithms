public class countFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 5, 6, 7, 8, 6};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean[] visited = new boolean[n]; // To keep track of visited elements

        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i]) {
                continue;
            }

            int count = 1; // Initialize count for the current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as visited
                    count++;
                }
            }

            // Print the frequency of the current element
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
