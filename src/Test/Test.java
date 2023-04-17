package Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static List<Integer> filterOneCollectionByAnother(List<Integer> firstCollection, List<Integer> secondCollection) {
        // пожалуйста добавьте свой код здесь

        List<Integer> result = new LinkedList<>();

        for(int i = 0; i < firstCollection.size(); i++){
            if(secondCollection.contains(firstCollection.get(i))){
                result.add(firstCollection.get(i));
            }
        }
        //List<Integer> r = Filter;
        return (List<Integer>) result;
    }


    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 3, 1,4,4, 6, 5, 7);
        List<Integer> second = Arrays.asList(2, 3, 4, 5);

        List<Integer> common = filterOneCollectionByAnother(first, second);
        System.out.println(common);
    }
}
