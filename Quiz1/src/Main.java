public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = 25;
        nums[1] = -3;
        nums[2] = 5;
        nums[3] = 10;
        nums[4] = 38;
        nums[5] = 62;
        nums[6] = 20;
        nums[7] = -8;
        nums[8] = 173;
        nums[9] = 65;

        System.out.println("Before sorting...");
        printArray(nums);

        System.out.println("\nAfter Bubble sorting...");
        bubbleSort(nums);
        printArray(nums);
    }

    private static void bubbleSort(int[] nums){
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (nums[i] < nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] nums) {
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (nums[i] < nums[smallest]) {
                    smallest = i;
                }
            }

            if (smallest != lastUnsortedIndex) {
                int temp = nums[smallest];
                nums[smallest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
