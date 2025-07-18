import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WelcomerTest {

    @Test
    public void testGetHunterMessage() {
        Welcomer welcomer = new Welcomer();
        String message = welcomer.getHunterMessage();
        assertTrue(message.contains("hunter"), "Message should contain 'hunter'");
    }
}

