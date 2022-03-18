import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void multiply() {
        assertEquals(9, SkillDemoOne.mult(3, 3)); //this test should fail
    }
}
