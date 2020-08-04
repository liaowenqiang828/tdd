import com.sun.tools.javac.util.Iterators;

import javax.imageio.spi.RegisterableService;
import java.util.*;
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

    public String insertMommyAfterContiunedVowelsSet(String string) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(string.split("")));
//        ArrayList<Integer> indexes = new ArrayList<>();

        int count = 0;
        for (String str:stringArray) {
            if (VOWELS.contains(str)) {
                count += 1;
            } else {
                if (count > 1) {
//                    indexes.add(stringArray.indexOf(str) - 1);
                    stringArray.set(stringArray.indexOf(str) - 1, stringArray.get(stringArray.indexOf(str) - 1) + "mommy");
                }
                count = 0;
            }
        }
        return stringArray.stream().collect(Collectors.joining(""));
    }

}
