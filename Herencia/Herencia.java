/**
 * Ejemplo de Herencia en Java.
 * 
 * La herencia permite que una clase hija herede atributos y métodos de una clase padre.
 */
public class Herencia {

    // Clase base Animal con un método hablar
    static class Animal {
        public void hablar() {
            System.out.println("El animal hace un sonido");
        }
    }

    // Clase derivada Perro que sobrescribe el método hablar
    static class Perro extends Animal {
        @Override
        public void hablar() {
            System.out.println("El perro ladra");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n🧪 Herencia:");
        Animal animal = new Animal();
        animal.hablar();

        Perro perro = new Perro();
        perro.hablar();
    }
}
