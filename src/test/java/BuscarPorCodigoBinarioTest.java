import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuscarPorCodigoBinarioTest {
    @Test
    void buscaPorCodigoUsandoBinaria() {
        GestionLibros gestion = new GestionLibros();
        gestion.agregarLibro(new Libro(99, "Libro Menor", "Autor", 2024, 12.5));
        gestion.agregarLibro(new Libro(300, "Libro Mayor", "Autor", 2024, 80.0));

        Libro encontrado = gestion.buscarPorCodigoBinario(99);
        assertNotNull(encontrado);
        assertEquals("Libro Menor", encontrado.getTitulo());

        assertNull(gestion.buscarPorCodigoBinario(999));
    }
}
