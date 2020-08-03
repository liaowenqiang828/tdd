import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_count_the_percent_of_vowels_in_string () {
        Mommifier mommifier = new Mommifier();
        String str = "abcdef";

        int result = mommifier.counterPercentOfVowels(str);
        
        assertEquals(33, result);
    }

    @Test
    void should_return_right_percent_result_when_string_contains_uppercase_letters () {
        Mommifier mommifier = new Mommifier();
        String str = "abcdEf";

        int result = mommifier.counterPercentOfVowels(str);

        assertEquals(33, result);
    }

    @Test
    void should_insert_mommy_for_each_vowel_if_percent_great_than_30 () {
        Mommifier mommifier = new Mommifier();
        String str = "abcdef";

        String result = mommifier.insertMommyAfterVowels(str);

        assertEquals("amommybcdemommyf", result);
    }
}
