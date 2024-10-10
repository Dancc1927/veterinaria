package Controlador;

import Principal.VentanaGestionarMascota;
import Principal.VentanaGestionarPersonas;
import Principal.VentanaPrincipal;
import Procesos.ProcesosMascota;
import Procesos.ProcesosPersona;

public class Principal {
	 public static void main(String[] args) {
	        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
	        VentanaGestionarMascota miVentanaGestionarMascotas = new VentanaGestionarMascota();
	        VentanaGestionarPersonas miVentanaGestionarPersonas = new VentanaGestionarPersonas();
	        
	        coordinador miCoordinador = new coordinador();
	        
	        ProcesosMascota misProcesosMascota = new ProcesosMascota();
	        ProcesosPersona misProcesosPersona = new ProcesosPersona();
	        
	        miVentanaPrincipal.setCoordinador(miCoordinador);
	        miVentanaGestionarMascotas.setCoordinador(miCoordinador);
	        miVentanaGestionarPersonas.setCoordinador(miCoordinador);
	        misProcesosMascota.setCoordinador(miCoordinador);
	        misProcesosPersona.setCoordinador(miCoordinador);
	        
	        miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
	        miCoordinador.setVentanaGestionarMascotas(miVentanaGestionarMascotas);
	        miCoordinador.setVentanaGestionarPersonas(miVentanaGestionarPersonas);
	        miCoordinador.setProcesosMascota(misProcesosMascota);
	        miCoordinador.setProcesosPersona(misProcesosPersona);
	        
	        miVentanaPrincipal.setVisible(true);
	    }
}
