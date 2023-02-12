import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int array[] = new int[1000];
        int target = 150;
        for(int i = 0; i< array.length; i++) {
            array[i] = i;

        }
        int index = binarySearch(array, target);
        if(index == -1){
            System.out.println("value not found in the array");
        } else {
            System.out.println("Value found at the index of: "+ index);
        }
    }

    private static int binarySearch(int[] array, int target){
        int min =0;
        int max = array.length -1;
        while(min<=max){
            int middle = min+(max-min)/2;
            int value = array[middle];
            System.out.println("middle value is: "+ value);

            if(value < target){
                min = middle+1;
            } else if (value> target) {
                max = middle-1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
