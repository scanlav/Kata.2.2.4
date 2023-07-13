import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseTest {

    @Test
    @DisplayName("testOne")
    void testOne() {
        System.out.println("testOne");
    }

    @Test
    @DisplayName("testTwo")
    void testTwo() {
        System.out.println("testTwo");
    }
}
