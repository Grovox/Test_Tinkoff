package Eight;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<Integer> filterOneCollectionByAnother(List<Integer> firstCollection, List<Integer> secondCollection) {
        // пожалуйста добавьте свой код здесь
        List<Integer> result = new LinkedList<>();

        for(int i = 0; i < firstCollection.size(); i++){
            if(secondCollection.contains(firstCollection.get(i))){
                result.add(firstCollection.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(3,5,4,5,4);
        List<Integer> second = Arrays.asList(5,4);

        Filter filter = new Filter();

        List<Integer> common = filter.filterOneCollectionByAnother(first, second);
        System.out.println(common);
    }
}