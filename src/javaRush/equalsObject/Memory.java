package javaRush.equalsObject;

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
// 1ый вариант
    //    public static void executeDefragmentation(String[] array) {
//        int count = 0;
//        String str = null;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != null) {
//                str = array[i];
//                array[i] = null;
//                array[count] = str;
//                count++;
//            }
//        }
//    }
//}
    // 2 вариант
/*    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i; j < array.length; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
    }
}
*/
    // 3ий вариант
    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }
}