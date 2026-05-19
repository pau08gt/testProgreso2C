import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class OrdenarPorPrecioDescendenteTest {
    @Test
    void ordenaPorPrecioDeMayorAMenor() {
        GestionLibros gestion = new GestionLibros();
        ArrayList<Libro> ordenados = gestion.ordenarPorPrecioDescendente();

        for (int i = 0; i < ordenados.size() - 1; i++) {
            assertTrue(ordenados.get(i).getPrecio() >= ordenados.get(i + 1).getPrecio());
        }

        assertEquals(104, ordenados.get(0).getCodigo());
    }
}
