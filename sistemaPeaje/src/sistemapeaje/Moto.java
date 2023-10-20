package SistemaPeaje;
/**
* Esta clase denominada Moto modela un tipo específico de Vehículo
* que llega a un peaje. Tiene un atributo estático que representa su
* valor del peaje en $5000.
* @version 1.2/2020
*/
public class Moto extends Vehiculo {
    // Atributo estático que identifica el valor de peaje a pagar por una moto
    public static int valorPeaje = 5000;
    /**
    * Constructor de la clase Moto
    * @param placa Parámetro que define la placa de una moto
    */
    public Moto(String placa) {
        super(placa); // Invoca al constructor de la clase padre
    }
    /**
    * Método que devuelve el valor del peaje para una moto
    * @return El valor del peaje para una moto
    */
    public int getValorPeaje() {
        return valorPeaje;
    }
    /**
    * Método que establece el valor del peaje para una moto
    * @param Parámetro que define el valor del peaje para una moto
    */
    static void setValorPeaje(int valorPeaje) {
        valorPeaje = valorPeaje;
    }
    /**
    * Método que muestra en pantalla la placa y el valor del peaje de
    * una moto
    */
    void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}