import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaPreciosRecursivaTest {
    @Test
    void sumaPreciosRecursivamente() {
        GestionLibros gestion = new GestionLibros();
        double sumaEsperada = 0;
        for (Libro libro : gestion.getLibros()) {
            sumaEsperada += libro.getPrecio();
        }

        assertEquals(sumaEsperada, gestion.sumaPreciosRecursiva(0), 0.001);
    }
}
