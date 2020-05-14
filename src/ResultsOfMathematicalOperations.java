import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResultsOfMathematicalOperations {
    public static void main(String[] args) {
        File file = new File("MathematicalOperations.txt");
        Scanner reading = new Scanner(file);

        String add = reading.nextLine();
        System.out.println(add);

        PrintWriter wynik = new PrintWriter("ResultsOperations.txt");
        wynik.println("1+2=3");
        wynik.close();
    }
}
