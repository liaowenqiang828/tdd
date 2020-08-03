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
}
