/**
 * Ejemplo de Polimorfismo en Java.
 * 
 * El polimorfismo permite que diferentes clases respondan de forma distinta a un mismo método.
 */
public class Polimorfismo {

    // Clase base Animal con método hablar
    static class Animal {
        public void hablar() {
            System.out.println("El animal hace un sonido");
        }
    }

    // Clase Gato que sobrescribe hablar
    static class Gato extends Animal {
        @Override
        public void hablar() {
            System.out.println("El gato maúlla");
        }
    }

    // Clase Perro que sobrescribe hablar
    static class Perro extends Animal {
        @Override
        public void hablar() {
            System.out.println("El perro ladra");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n🧪 Polimorfismo:");
        Animal[] animales = { new Gato(), new Perro() };

        for (Animal a : animales) {
            a.hablar();
        }
    }
}
