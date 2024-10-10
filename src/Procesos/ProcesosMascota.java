package Procesos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Controlador.coordinador;
import DAO.MascotaDao;
import VO.MascotaVo;

public class ProcesosMascota {

	private coordinador miCoordinador;

	public boolean registrar(String propietario, String nombre, String raza, String sexo) {
		if(nombre.length()<1) {
			JOptionPane.showMessageDialog(null, "ingrese el nombre");
			return false;
		}if(raza.length()<1) {
			JOptionPane.showMessageDialog(null, "ingrese la raza");
		    return false;
		}if(sexo.length()<1) {
			JOptionPane.showMessageDialog(null, "ingrese el sexo");
		    return false;
		}
		 MascotaDao mascotaDao= new MascotaDao();
		 return mascotaDao.registrar(propietario, nombre, raza, sexo);
	}

	public MascotaVo consultar (String idPropietario, String nombre) {
		if(nombre.length()<1) {
			JOptionPane.showMessageDialog(null,"ingrese el nombre de la mascota");
			return null;
		}
		MascotaDao mascotaDao= new MascotaDao();
		return mascotaDao.consultar(idPropietario, nombre);
	}



	public ArrayList<MascotaVo> listarMascotas() {
		MascotaDao mascotaDao= new MascotaDao();
		return mascotaDao.listar(this.miCoordinador);
	}

	
	public boolean eliminarMascota(String idPropietario, String nombre) {
		if (nombre.length() < 1) {
			return false;
		}
		MascotaDao mascotaDao= new MascotaDao();
		return mascotaDao.eliminar(idPropietario, nombre);
	}

	public void actualizar(String propietario, String nombre, String raza, String sexo) {
	
		if (nombre.length() < 1){
            JOptionPane.showMessageDialog(null, "Se debe ingresar el nombre del animal", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (raza.length() < 1){
            JOptionPane.showMessageDialog(null, "Se debe ingresar la raza del animal", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (sexo.length() < 1){
            JOptionPane.showMessageDialog(null, "Se debe ingresar el genero del animal", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        MascotaDao mascotaDao = new MascotaDao();
        mascotaDao.actualizar(propietario, nombre, raza, sexo);
    	
	}

}
