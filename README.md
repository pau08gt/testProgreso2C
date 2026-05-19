# Evaluación del Progreso – Programación III
# Sistema de Gestión de Biblioteca

## Objetivo

Desarrollar un sistema visual de gestión de biblioteca utilizando **Java Swing** y estructuras de datos basadas en **ArrayList**. El sistema permitirá administrar libros, realizar búsquedas, ordenamientos y aplicar métodos recursivos.

---

## Temas evaluados

- ArrayList
- Búsqueda secuencial
- Búsqueda binaria
- Ordenamiento manual (Burbuja o Inserción directa)
- Recursividad
- Interfaz gráfica Swing
- Integración entre clases

---

## Restricciones

No está permitido utilizar:

```java
Collections.sort()
Collections.binarySearch()
```

Los algoritmos deben implementarse manualmente.

La lógica de negocio debe implementarse dentro de la clase:

```java
GestionLibros
```

No colocar lógica directamente en:

```java
Ventana.java
```

---

# Estructura del proyecto

El proyecto contiene los siguientes archivos:

```text
src/
├── Libro.java
├── GestionLibros.java
└── Ventana.java
```

---

# Clase Libro

Debe representar:

```java
private int codigo;
private String titulo;
private String autor;
private int anioPublicacion;
private double precio;
```

Implementar:

- Constructor
- Getters y Setters
- Método `toString()`

Condición:

El atributo `codigo` debe ser único.

---

# Clase GestionLibros

Debe contener:

```java
private ArrayList<Libro> libros;
```

Precargar cinco libros.

Ejemplo:

| Código | Título | Autor | Año | Precio |
|----------|---------|--------|------|---------|
|101|Clean Code|Robert Martin|2008|45.50|
|102|Java Cómo Programar|Deitel|2014|60.00|
|103|Algoritmos|Cormen|2009|75.20|
|104|Thinking in Java|Bruce Eckel|2006|55.80|
|105|Patrones de Diseño|GoF|1995|70.00|

---

# Métodos obligatorios

Implementar los siguientes métodos:

### Agregar libro

```java
boolean agregarLibro(Libro libro)
```

Requisitos:

- Verificar que el código no exista previamente.
- Utilizar búsqueda secuencial.
- Retornar:

```java
true
```

si se agrega correctamente.

```java
false
```

si el código ya existe.

---

### Buscar por título

```java
Libro buscarPorTituloSecuencial(String titulo)
```

Debe utilizar búsqueda secuencial.

Si no existe:

Retornar:

```java
null
```

---

### Ordenar por precio

```java
ArrayList<Libro> ordenarPorPrecioDescendente()
```

Ordenar:

Mayor → menor

Utilizar:

- Método burbuja
o
- Inserción directa

---

### Buscar por código

```java
Libro buscarPorCodigoBinario(int codigo)
```

Implementar búsqueda binaria.

Antes de buscar:

Ordenar previamente por código.

Si no existe:

Retornar:

```java
null
```

---

# Métodos recursivos

Implementar:

### Contar elementos

```java
int contarRecursivo(int indice)
```

Debe contar la cantidad de libros sin usar ciclos.

---

### Suma recursiva

```java
double sumaPreciosRecursiva(int indice)
```

Debe sumar los precios de todos los libros utilizando recursividad.

---

### Promedio recursivo

```java
double precioPromedioRecursivo()
```

Debe calcular el promedio usando métodos recursivos.

---

# Interfaz gráfica

Implementar la clase:

```java
Ventana.java
```

Utilizar:

```java
JTabbedPane
```

La interfaz debe tener:

---

## Pestaña 1: Registro

Componentes mínimos:

- JSpinner → código
- JTextField → título
- JTextField → autor
- JTextField → año
- JTextField → precio
- JButton → Agregar
- JList → listado

Funcionalidades:

- Registrar libro
- Mostrar mensajes de éxito o error
- Actualizar listado

---

## Pestaña 2: Búsquedas y ordenamiento

Debe incluir botones para:

- Buscar por título
- Buscar por código
- Ordenar por precio descendente

Mostrar resultados mediante:

- JList
o
- JOptionPane

---

## Pestaña 3: Recursividad

Debe mostrar:

- Total de libros
- Suma de precios
- Precio promedio

Los resultados deben obtenerse llamando a métodos de:

```java
GestionLibros
```

---

# Requisitos adicionales

1. Realizar pruebas con al menos cinco registros nuevos.
2. Agregar capturas de funcionamiento.
3. Realizar commits descriptivos.
4. Crear el repositorio con formato:

```text
apellido_apellido_p3
```

5. Subir el proyecto a GitHub.

---

# Criterios de evaluación

## Implementación de métodos (6 puntos)

| Método | Puntaje |
|----------|----------:|
| agregarLibro() | 1 |
| buscarPorTituloSecuencial() | 1 |
| ordenarPorPrecioDescendente() | 1 |
| buscarPorCodigoBinario() | 1 |
| contarRecursivo() | 0.75 |
| sumaPreciosRecursiva() | 0.75 |
| precioPromedioRecursivo() | 0.50 |

Total: **6 puntos**

---

## Interfaz Swing e integración (4 puntos)

| Criterio | Puntaje |
|-----------|----------:|
| Uso correcto de JTabbedPane 
| Uso de JList 
| Registro funcional 
| Integración con GestionLibros

Total: **4 puntos**

---

# Entrega

Subir:

- Enlace del repositorio GitHub con nombres apellido y version en cada commits
