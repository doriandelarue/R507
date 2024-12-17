import org.example.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAdd() {
        Assertions.assertEquals(5, App.add(2, 3), "2 + 3 devrait être égal à 5");
    }
}
