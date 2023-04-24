import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCommon {
    @Test
    public void letterCounter() {

        String word = "Hello";
        int length = WordCounter.wordCounter(word);
        Assertions.assertEquals(5, length);

        String word2 = "";
        Assertions.assertEquals(0, word2.length());
    }

}
