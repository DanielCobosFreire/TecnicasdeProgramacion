/**
 * Ejemplo de Abstracción en Java.
 * 
 * La abstracción oculta los detalles internos y muestra solo la información relevante.
 */
public class Abstraccion {
    
    // Clase que representa una persona con nombre y edad
    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método que muestra la información relevante de la persona
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    }

    public static void main(String[] args) {
        System.out.println("🧪 Abstracción:");
        Persona persona1 = new Persona("Carlos", 30);
        persona1.mostrarInfo();
    }
}
