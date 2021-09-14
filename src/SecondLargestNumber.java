import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        /*numbers in list*/
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                12,34,54,67,23,67
        ));

        // getting the largest number from the list
        Integer z = Collections.max(numbers);
        while (z.equals(Collections.max(numbers))){
            numbers.remove(z); // remove that largest number from the list
            // here while loop because, if there may be largest number in 2-3 times
        }

        // after the removing largest number from the list, then get the secondLargest number
        System.out.println(Collections.max(numbers));
    }


}
