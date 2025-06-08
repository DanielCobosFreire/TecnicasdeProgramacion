/**
 * Ejemplo de Encapsulación en Java.
 * 
 * La encapsulación consiste en proteger los datos y solo permitir el acceso controlado a ellos.
 */
public class Encapsulacion {
    
    // Clase que representa una cuenta bancaria con saldo privado
    static class CuentaBancaria {
        private double saldo;

        public CuentaBancaria() {
            this.saldo = 0;
        }

        // Método para depositar dinero en la cuenta, validando la cantidad
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
            }
        }

        // Método para obtener el saldo actual
        public double getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        System.out.println("\n🧪 Encapsulación:");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
