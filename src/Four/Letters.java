package Four;
import java.util.*;
import java.lang.*;

public class Letters {
    public static String combinations(String symbolsString){
        return combinations(symbolsString.toCharArray(),0,symbolsString.toCharArray());
    }

    private static String combinations(char[] massString, int currentIndex, char[] previousShift){
        String result = "";

        if (currentIndex == massString.length - 1) {
            int shiftIndex = 0;

            for(int i = 0; i < massString.length; i++){
                if(massString[i] != previousShift[i]){
                    shiftIndex = i;
                    i = massString.length;
                }
            }

            for(int i = shiftIndex; i < massString.length; i++){
                for (int j = 0; j <= i; j++){
                    result += massString[j];
                }
                result += ", ";
            }
            for (int i = 0; i < massString.length; i++){
                previousShift[i] = massString[i];
            }
        }

        for (int i = currentIndex; i < massString.length; i++) {
            swap(massString, currentIndex, i);
            result += combinations(massString, currentIndex + 1,previousShift);
            swap(massString, currentIndex, i);
        }
        return result;
    }

    private static void swap(char[] massString, int movableElement, int positionForMovement) {
        char temp = massString[movableElement];
        massString[movableElement] = massString[positionForMovement];
        massString[positionForMovement] = temp;
    }


    public static void main(String args[]){
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";

        result = combinations(input);
        result = result.substring(0,result.length() - 2);

        System.out.println(result);
    }
}
