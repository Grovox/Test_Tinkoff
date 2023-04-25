package One;
import java.io.*;
import java.util.*;
import java.lang.*;

public class CalculateSum{
    public static void main(String args[])
    {
        BufferedReader inputDataBR = new BufferedReader(new InputStreamReader(System.in));

        List<Double> persents = new ArrayList<>();
        persents.add(0.1);
        persents.add(0.02);

        List<Double> purchases = new ArrayList<>();
        purchases.add(100.0);
        purchases.add(300.0);

        double sum = 0;
        for (int i = 0; i < purchases.size(); i++) {
            sum += purchases.get(i) * persents.get(i);
        }
        System.out.println(sum);
    }
}
