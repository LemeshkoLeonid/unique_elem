package array;

public class arr {
    public static void main(String[] args) {
        int[] array = {5, 5, 9, 15, 43, 62, 73, 15, 0};
        int[] array_work = new int[array.length];
        int unique_elem;

        for (int i = 0; i < array.length; i++) {
            if ( !isValueInArr(array[i], array_work) ) {
                array_work[i] = array[i];
            }
        }

        unique_elem = isValueInArr(0, array) ? calcNonZeroElem(array_work) + 1 : calcNonZeroElem(array_work);
        System.out.println(unique_elem);
    }

    private static int calcNonZeroElem(int[] array) {
        int amount_non_zero_elem = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 ) {
                amount_non_zero_elem++;
            }
        }
        return amount_non_zero_elem;
    }

    private static boolean isValueInArr(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

}


