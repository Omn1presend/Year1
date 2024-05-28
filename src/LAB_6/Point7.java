package LAB_6;

import java.util.Arrays;

class ArrayToCode {

    public static int[] toCode(char[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'x'};

        int[] code = toCode(array);

        System.out.println(Arrays.toString(code));
    }
}