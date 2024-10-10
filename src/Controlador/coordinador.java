package Controlador;

import java.util.ArrayList;
import DAO.PersonaDao;
import Principal.VentanaGestionarMascota;
import Principal.VentanaGestionarPersonas;
import Principal.VentanaPrincipal;
import Procesos.ProcesosMascota;
import Procesos.ProcesosPersona;
import VO.MascotaVo;
import VO.PersonaVO;

public class coordinador {
  
	private VentanaPrincipal miVentanaPrincipal;
    private VentanaGestionarMascota miVentanaGestionarMascotas;
    private VentanaGestionarPersonas miVentanaGestionarPersonas;
    private ProcesosMascota misProcesosMascota;
    private ProcesosPersona misProcesosPersona;
    
    public void setProcesosMascota(ProcesosMascota procesosMascota) {
        this.misProcesosMascota = procesosMascota;
    }
    
    public void setProcesosPersona(ProcesosPersona procesosPersona) {
        this.misProcesosPersona = procesosPersona;
    }
    
    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.miVentanaPrincipal = ventanaPrincipal;
    }
    
    public void setVentanaGestionarMascotas(VentanaGestionarMascota ventanaGestionarMascotas) {
        this.miVentanaGestionarMascotas = ventanaGestionarMascotas;
    }
    
    public void setVentanaGestionarPersonas(VentanaGestionarPersonas ventanaGestionarPersonas) {
        this.miVentanaGestionarPersonas = ventanaGestionarPersonas;
    }
    
    public void mostrarVentanaGestionarMascotas() {
        this.miVentanaGestionarMascotas.setVisible(true);
    }
    
    public void mostrarVentanaGestionarPersonas() {
        this.miVentanaGestionarPersonas.setVisible(true);
    }
    
    public boolean registarPersona(String documento, String telefono, String nombre) {
        return this.misProcesosPersona.registrar(documento, telefono, nombre);
    }
    
    public boolean registrarMascota(String propietario, String nombre, String raza, String sexo) {
        return this.misProcesosMascota.registrar(propietario, nombre, raza, sexo);
    }
    
    public void editarPersona(String documento, String telefono, String nombre) {
        this.misProcesosPersona.actualizar(documento, nombre, telefono);
        this.miVentanaGestionarPersonas.mostrar(documento);
    }
    
    public void editarMascota(String propietario, String nombre, String raza, String sexo) {
        this.misProcesosMascota.actualizar(propietario, nombre, raza, sexo);
    }
    
    public boolean eliminarPersona(String documento) {
        return this.misProcesosPersona.eliminarPersona(documento);
    }
    
    public boolean eliminarMascota (String idPropietario, String nombre) {
        return this.misProcesosMascota.eliminarMascota(idPropietario, nombre);
    } 
    
    public void listarPersonas() {
        ArrayList<PersonaDao> lista = this.misProcesosPersona.listarPersonas();
        this.miVentanaGestionarPersonas.listarPersonas(lista);
    }
    
    public void listarMascotas() {
        ArrayList<MascotaVo> lista = this.misProcesosMascota.listarMascotas();
        this.miVentanaGestionarMascotas.listarMascotas(lista);
    }
    
    public PersonaVO consultarPersona(String documento) {
        return this.misProcesosPersona.consultar(documento);
    }
    
    public PersonaVO consultarPersona(String documento, boolean mensaje) {
        return this.misProcesosPersona.consultar(documento, mensaje);
    }
    
    public MascotaVo consultarMascota (String idPropietario, String nombre) {
        return this.misProcesosMascota.consultar(idPropietario, nombre);
    }
}

}
