import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public String insertMommyAfterVowels(String str) {
        int percent = counterPercentOfVowels(str);
        Stream<String> newStringArray = null;
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(str.split("")));

        if (percent > 30) {
            newStringArray = stringArray.stream().map((string) -> {
                if (VOWELS.contains(string.toLowerCase())) {
                    string = string + "mommy";
                }
                return string;
            });
        } else {
            newStringArray = stringArray.stream();
        }
        return newStringArray.collect(Collectors.joining(""));
    }
}
