package Five;
import java.util.*;
import java.lang.*;

class FiveLetters
{
    public static void main(String args[])
    {
        var scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        char[] userResponse;
        char[] rightAnswer;
        String rightAnswerSTR = "";

        boolean wordTest = true;

        if(input.length() != 12) {
            wordTest = false;
            System.out.println("Ввод не правильный.");
        } else {
            if (!input.substring(0, 5).matches("[А-Яа-яЁё]{5}+")) {
                wordTest = false;
                System.out.println("Ответ пользователя не корректен");
            }
            if (!input.substring(7, 12).matches("[А-Яа-яЁё]{5}+")) {
                wordTest = false;
                System.out.println("Паравельный ответ не корректен");
            }
        }
        if(wordTest == true){
            userResponse = input.substring(0,5).toCharArray();
            rightAnswerSTR = input.substring(7,12);
            rightAnswer = input.substring(7,12).toCharArray();


            for(int i = 0; i < 5; i++){
                int valueMatch = -1;
                if(rightAnswerSTR.contains(String.valueOf(userResponse[i]))){
                    valueMatch++;
                }
                if (userResponse[i] == rightAnswer[i]){
                    valueMatch++;
                }
                result += valueMatch + ", ";
            }
        }

        result = result.substring(0,result.length() - 2);

        System.out.println(result);
    }
}