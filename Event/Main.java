public class Main {

    // 1. This is your method pasted inside the class
    public static int isAllPossibilities(int[] a) {
        // An empty array cannot be an array of all possibilities
        if (a == null || a.length == 0) {
            return 0;
        }

        int n = a.length;
        boolean[] visited = new boolean[n];

        for (int num : a) {
            // If the number is negative or greater than/equal to n, it's invalid
            if (num < 0 || num >= n) {
                return 0;
            }
            // If we've already seen this number, it's a duplicate
            if (visited[num]) {
                return 0;
            }
            // Mark the number as found
            visited[num] = true;
        }

        // If we successfully checked every element without issues, it's perfect!
        return 1;
    }

    // 2. This is the main method where we actually RUN and test the code
    public static void main(String[] args) {

        // Test Case 1: A valid array (length 4, has 0, 1, 2, 3)
        int[] validArray = {1, 2, 0, 3};
        int result1 = isAllPossibilities(validArray);
        System.out.println("Result for [1, 2, 0, 3]: " + result1); // Expected: 1

        // Test Case 2: Invalid array (missing the number 2)
        int[] missingNumberArray = {0, 1, 3};
        int result2 = isAllPossibilities(missingNumberArray);
        System.out.println("Result for [0, 1, 3]: " + result2); // Expected: 0

        // Test Case 3: Invalid array (has duplicates)
        int[] duplicateArray = {0, 2, 2};
        int result3 = isAllPossibilities(duplicateArray);
        System.out.println("Result for [0, 2, 2]: " + result3); // Expected: 0
    }
}