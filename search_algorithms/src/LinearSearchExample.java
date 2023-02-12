public class LinearSearchExample {
    public static void main(String[] args) {
        int[] array = {34,56,23,90,12,67,89,45,62,98,70,16,78,81};

        int index = linearSearch(array, 16);
        if(index != -1){
            System.out.println("Value found in index: " + index);
        } else {
            System.out.println("Value not found");
        }
    }

    private static int linearSearch(int[] array, int value){
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
