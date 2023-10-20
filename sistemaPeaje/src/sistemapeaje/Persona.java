package sistemapeaje;

import SistemaPeaje.Camion;
import SistemaPeaje.Carro;
import SistemaPeaje.Moto;
import SistemaPeaje.Vehiculo;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Persona {
    public String nombre;
    public String apellidos;
    public String numeroDocumento;
    public List<Vehiculo> vehiculos; 
    
    public Persona(String nombre, String apellidos, String numeroDocumento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.vehiculos = new ArrayList<>();
 
    }
    

    public String getNombre() {
        return nombre;
    }
    

    public String getApellidos() {
        return apellidos;
    }
    

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }


    public void desasignarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.contains(vehiculo)) {
            vehiculos.remove(vehiculo);
        }
    }
    

    public int calcularTotalPeajes() {
        int totalPeajes = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Carro) {
                totalPeajes += Carro.valorPeaje;
            } else if (vehiculo instanceof Moto) {
                totalPeajes += Moto.valorPeaje;
            } else if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                totalPeajes += camion.numeroEjes * camion.valorPeajeEje;
            }
        }
        return totalPeajes;
    }
}
