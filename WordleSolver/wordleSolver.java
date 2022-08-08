import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wordleSolver {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the 5 letter word with _ in place of letters you don't know the location of.");
        String word = sc.nextLine();
        sc.close();

        List<String> wordleAnswers = new ArrayList<String>();
       
        BufferedReader bf = new BufferedReader(
            new FileReader("WordleSolver/wordle_list.txt"));
        String line = bf.readLine();

        while (line != null) {
            wordleAnswers.add(line);
            line = bf.readLine();
        }
        bf.close();
       
        String[] array = wordleAnswers.toArray(new String[0]);
        
        ArrayList<String> found = new ArrayList<String>();

        for (String str: array) {
            int allMatching = 0;
            for (int i = 0; i < word.length(); i++) {
                if (str.charAt(i) == word.charAt(i) || word.charAt(i) == '_') {
                    allMatching += 1;
                }
            }
            if (allMatching == 5) {
                found.add(str);
            }
        }

        for (String str: found) {
            System.out.println("Match Found: " + str);
        }
    }
}
