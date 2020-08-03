import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mommifier {
    final ArrayList<String> VOWELS = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));

    public int counterPercentOfVowels(String string) {
        int length = string.length();
        int vowelNumber = 0;

        ArrayList<String> arrayString = new ArrayList<>(Arrays.asList(string.split("")));

        for (String str:arrayString) {
            if (VOWELS.contains(str.toLowerCase())) {
                vowelNumber += 1;
            }
        }

        int percent = vowelNumber * 100 / length;
        return  percent;
    }
}
