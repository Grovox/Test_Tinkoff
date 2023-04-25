package Ten;

import java.util.Scanner;

class RecursivePrinter
{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var inputNumber = Integer.parseInt(scanner.nextLine());
        print(inputNumber);
    }

    public static void print(int n) {
        if(n > 0){
            print(n,1);
        }
    }
    public static void print(int n,int shiftBuffer) {
        System.out.println(shiftBuffer);
        if(n > shiftBuffer){
            print(n,++shiftBuffer);
        }
    }
}