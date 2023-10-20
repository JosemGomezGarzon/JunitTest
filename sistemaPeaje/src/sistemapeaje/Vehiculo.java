package SistemaPeaje;
/**
* Esta clase abstracta denominada Vehículo modela diferentes tipos de
* vehículos que pueden llegar a un peaje. Un vehículo posee como
* único atributo su placa.
* @version 1.2/2020
*/
abstract public class Vehiculo {
    public String placa; // Atributo que define la placa de un vehículo
    
    /**
    * Constructor de la clase Vehículo
    * @param placa Parámetro que define la placa de un vehículo
    */
    Vehiculo(String placa) {
        this.placa = placa;
    }
}