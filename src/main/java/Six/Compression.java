package Six;

import java.util.*;
import java.lang.*;

class Compression
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";

        int k = 1;
        String numberSequence = "";
        for(int i = 0; i < input.length(); i+=3){

            if(numberSequence.contains(String.valueOf(input.charAt(i)))){
                k++;
            }

            if(numberSequence.length() == 1) {
                if (!numberSequence.contains(String.valueOf(input.charAt(i))) || i + 1 == input.length()) {
                    result += String.valueOf(k) + "), ";
                    numberSequence = "";
                    k = 1;
                }
            }

            if(k == 1 && i + 1 != input.length()){
                result +="(" + input.charAt(i) + ", ";
                numberSequence = String.valueOf(input.charAt(i));
            }
        }

        System.out.println(result);
    }
}
