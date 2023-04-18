package Two;
import java.util.*;
import java.lang.*;

public class Pangram {
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Boolean result = true;
        char[] massLetter = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
        'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч',
        'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        input = input.toLowerCase();

        for (int i = 0; i < 33; i++){
            if(!input.contains(String.valueOf(massLetter[i]))){
                result = false;
            }
        }

        // здесь решение

        System.out.println(result);
    }
}
