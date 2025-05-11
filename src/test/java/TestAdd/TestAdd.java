package TestAdd;

import LearnUnitTesting.example.Add;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAdd {
    @Test
    public void testAdd(){
        Add add = new Add();
        int result = add.add(7,3);
        assertEquals(10,result);



    }
}
