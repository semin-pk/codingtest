import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Solution {
    private static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }


    
}