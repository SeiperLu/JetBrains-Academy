import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        // there is no need to input data from the command line
        // instead, use arguments elem, list1 and list2
        int firstListCount = 0;

        for (Integer integer : list1) {
            if (integer == elem) {
                firstListCount++;
            }
        }
        int secondListCount = 0;
        for (Integer integer : list2) {
            if (integer == elem) {
                secondListCount++;
            }
        }



        return firstListCount == secondListCount;
    }
}