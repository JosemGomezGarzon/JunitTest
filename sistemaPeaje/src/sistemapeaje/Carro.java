package SistemaPeaje;
/**
* Esta clase denominada Carro modela un tipo específico de Vehículo
* que llega a un peaje. Tiene un atributo estático que representa su
* valor del peaje en $10000.
* @version 1.2/2020
*/

public class Carro extends Vehiculo {
    // Atributo estático que identifica el valor de peaje a pagar por un carro
    public static int valorPeaje = 10000;
    /**
    * Constructor de la clase Carro
    * @param placa Parámetro que define la placa de un carro
    */
    public Carro(String placa) {
        super(placa); // Invoca al constructor de la clase padre
    }
    /**
    * Método que devuelve el valor del peaje para un carro
    * @return El valor del peaje para un carro
    */
    public int getValorPeaje() {
        return valorPeaje;
    }
    /**
    * Método que establece el valor del peaje para un carro
    * @param Parámetro que define el valor del peaje para un carro
    */
    static void setValorPeaje(int valorPeaje) {
        valorPeaje = valorPeaje;
    }

    /**
    * Método que muestra en pantalla la placa y el valor del peaje de un
    * carro
    */
    void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}