import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgregarLibroTest {
    @Test
    void agregaLibroConCodigoUnicoYRechazaDuplicado() {
        GestionLibros gestion = new GestionLibros();
        int cantidadInicial = gestion.getLibros().size();

        assertTrue(gestion.agregarLibro(new Libro(200, "Patrones de Diseño", "Gamma", 1994, 60.0)));
        assertEquals(cantidadInicial + 1, gestion.getLibros().size());

        assertFalse(gestion.agregarLibro(new Libro(200, "Duplicado", "Autor", 2022, 10.0)));
        assertEquals(cantidadInicial + 1, gestion.getLibros().size());
    }
}
