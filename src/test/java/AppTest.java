import org.example.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    // Test de la méthode add avec des nombres positifs
    @Test
    void testAddPositiveNumbers() {
        Assertions.assertEquals(5, App.add(2, 3), "2 + 3 devrait être égal à 5");
    }

    // Test de la méthode add avec un nombre négatif
    @Test
    void testAddNegativeNumber() {
        Assertions.assertEquals(1, App.add(3, -2), "3 + (-2) devrait être égal à 1");
    }

    // Test de la méthode add avec zéro
    @Test
    void testAddZero() {
        Assertions.assertEquals(5, App.add(5, 0), "5 + 0 devrait être égal à 5");
        Assertions.assertEquals(0, App.add(0, 0), "0 + 0 devrait être égal à 0");
    }

    // Test de la méthode add avec des grands nombres
    @Test
    void testAddLargeNumbers() {
        Assertions.assertEquals(1000000000, App.add(500000000, 500000000), "500000000 + 500000000 devrait être égal à 1000000000");
    }

    // Test de la méthode add avec des nombres négatifs
    @Test
    void testAddTwoNegativeNumbers() {
        Assertions.assertEquals(-5, App.add(-2, -3), "-2 + (-3) devrait être égal à -5");
    }

    // Test de la méthode add avec des résultats négatifs
    @Test
    void testAddResultingNegative() {
        Assertions.assertEquals(-1, App.add(-3, 2), "-3 + 2 devrait être égal à -1");
    }

    // Test de la méthode add avec des nombres flottants convertis en entiers (par exemple)
    @Test
    void testAddFloatingPointNumbers() {
        // Si vous voulez tester des valeurs non-entières, vous pourriez par exemple arrondir les résultats
        double result = 2.5 + 3.4;
        Assertions.assertEquals(5.9, result, 0.01, "2.5 + 3.4 devrait être égal à 5.9");
    }
}
