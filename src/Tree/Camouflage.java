package Tree;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.lang.*;

public class Camouflage {
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";

        try {
            input = new String(input.getBytes("windows-1251"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        List<Character> alphabet = Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч',
                'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');


        //String.valueOf(c).matches("[а-яё]"

        for (char c : input.toCharArray()) {
            if(alphabet.contains(c)) {
                int numElement = alphabet.indexOf(c) - 15;
                if(numElement < 0){
                    numElement = 33 + numElement;
                }
                result += alphabet.get(numElement);
            }else {
                result += String.valueOf(c);
            }
        }

        System.out.println(result);
    }
}
