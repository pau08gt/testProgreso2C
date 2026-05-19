import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContarRecursivoTest {
    @Test
    void cuentaLibrosRecursivamente() {
        GestionLibros gestion = new GestionLibros();
        assertEquals(gestion.getLibros().size(), gestion.contarRecursivo(0));

        gestion.agregarLibro(new Libro(201, "Nuevo", "Autor", 2024, 20.0));
        assertEquals(6, gestion.contarRecursivo(0));
    }
}
