import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        for (int i =0; i < intList.size(); i++) {
            Integer element = intList.get(i);
            if (element > 0 && element % 2 == 0){
                resultList.add(element);
            }
        }

        Collections.sort(resultList);
        for (Integer x : resultList) {
            System.out.println(x);
        }
    }
}