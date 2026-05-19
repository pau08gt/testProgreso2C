import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuscarPorTituloSecuencialTest {
    @Test
    void buscaPorTituloIgnorandoMayusculasYMinusculas() {
        GestionLibros gestion = new GestionLibros();
        Libro libro = gestion.buscarPorTituloSecuencial("clean code");

        assertNotNull(libro);
        assertEquals(101, libro.getCodigo());
        assertNull(gestion.buscarPorTituloSecuencial("No existe"));
    }
}
