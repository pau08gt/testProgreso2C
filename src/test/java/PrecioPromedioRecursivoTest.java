import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrecioPromedioRecursivoTest {
    @Test
    void calculaPromedioRecursivamente() {
        GestionLibros gestion = new GestionLibros();
        double suma = 0;
        for (Libro libro : gestion.getLibros()) {
            suma += libro.getPrecio();
        }
        double promedioEsperado = suma / gestion.getLibros().size();

        assertEquals(promedioEsperado, gestion.precioPromedioRecursivo(), 0.001);
    }
}
