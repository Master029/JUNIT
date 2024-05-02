package estructura;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class SistemaVentaEntradasTest {
    @DisplayName("Ej1")
    @Test
    void testAnyadirSala() {
        SistemaVentaEntradas sistema = new SistemaVentaEntradas();

        assertTrue(sistema.anyadirSala(1, "Sala 1"));
        assertFalse(sistema.anyadirSala(1, "Sala 1"));

        assertTrue(sistema.anyadirSala(2, "Sala 2"));
        assertTrue(sistema.anyadirSala(3, "Sala 3"));
        assertTrue(sistema.anyadirSala(4, "Sala 4"));
        assertTrue(sistema.anyadirSala(5, "Sala 5"));
        assertFalse(sistema.anyadirSala(6, "Sala 6"));
    }

    @Test
    @DisplayName("Ej2")
    void testComprarEntrada() {
        SistemaVentaEntradas sistema = new SistemaVentaEntradas();

        sistema.anyadirSala(1, "Sala 1");
        sistema.anyadirSala(2, "Sala 2");

        assertTrue(sistema.comprarEntrada(1, 10));
        assertTrue(sistema.comprarEntrada(2, 20));

        assertFalse(sistema.comprarEntrada(1, 0));
        assertFalse(sistema.comprarEntrada(1, 35));
        assertFalse(sistema.comprarEntrada(3, 15));
    }

    @Test
    @DisplayName("Ej3")
    void testTotalRecaudacion() {
        SistemaVentaEntradas sistema = new SistemaVentaEntradas();

        sistema.comprarEntrada(1, 10);
        sistema.comprarEntrada(2, 20);
        sistema.comprarEntrada(3, 5);

        double totalEsperado = 28.0;

        assertEquals(totalEsperado, sistema.totalRecaudacion());
    }
}
