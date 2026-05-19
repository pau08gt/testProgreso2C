import java.util.ArrayList;

public class GestionLibros {
    private ArrayList<Libro> libros;

    public GestionLibros() {
        libros = new ArrayList<>();
       
    }

    private void precargarLibros() {
        libros.add(new Libro(101, "Clean Code", "Robert C. Martin", 2008, 45.50));
        libros.add(new Libro(102, "Java Básico", "Ana Torres", 2020, 28.75));
        libros.add(new Libro(103, "Estructuras de Datos", "Luis Pérez", 2019, 35.20));
        libros.add(new Libro(104, "Algoritmos", "Carla Ruiz", 2021, 50.00));
        libros.add(new Libro(105, "Programación Swing", "Mario Díaz", 2018, 30.40));
    }

   
}
