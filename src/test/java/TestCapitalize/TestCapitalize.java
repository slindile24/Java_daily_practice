package TestCapitalize;
import LearnUnitTesting.CapitalizeWord.Capitalize;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCapitalize {
    @Test
    public void testCapitalize(){
        Capitalize capitalize = new Capitalize();
        String result = capitalize.capitalize("hello");
        assertEquals("Hello",result);

    }
}
