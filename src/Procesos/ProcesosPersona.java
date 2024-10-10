package Procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.PersonaVo;
import Controlador.coordinador;
import DAO.PersonaDao;
import VO.PersonaVO;

public class ProcesosPersona {

	public boolean registrar(String documento, String telefono, String nombre) {
	
	if(documento.length()<1) {
			JOptionPane.showMessageDialog(null, "Ingrese el documento de la persona");
		return false;
	}if(nombre.length()<1) {
		JOptionPane.showMessageDialog(null,"Ingrese el nombre");
		return false;
	}if(telefono.length()<1){
		JOptionPane.showMessageDialog(null, "Ingrese el telefono");
		return false;
	}
       PersonaDao personaDao = new PersonaDao();
       return personaDao.registrar(documento,nombre,telefono);
}

	public void actualizar(String documento, String nombre, String telefono) {
		if (consultar1(documento) != null) {
            if (documento.length() < 1){
                JOptionPane.showMessageDialog(null, "Se debe ingresar el documento de la persona", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (nombre.length() < 1) {
                JOptionPane.showMessageDialog(null, "Se debe ingresar el nombre de la persona", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (telefono.length() < 1) {
                JOptionPane.showMessageDialog(null, "Se debe ingresar el telefono de la persona", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            PersonaDao personaDao = new PersonaDao();
            personaDao.actualizar(documento, nombre, telefono);
        } else {
            JOptionPane.showMessageDialog(null, "La persona no está registrada", "Error", JOptionPane.ERROR_MESSAGE);
        }
	}

		private Object consultar1(String documento) {
			 if ( documento.length() < 1) {
		            JOptionPane.showMessageDialog(null, "Se debe ingresar el documento de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		            return null;
		        }
		return null;
	}

		public ArrayList<PersonaVO> listarPersonas() {
	        PersonaDao personaDao = new PersonaDao();
	        return personaDao.listar();
		}
	public PersonaVO consultar(String documento) {
		if( documento.length()<1) {
			JOptionPane.showMessageDialog(null, "debe ingresar el documento", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		PersonaDao personaDao = new PersonaDao();
        return personaDao.consultar(documento);
  
	}
	
	public boolean eliminarPersona1(String documento) {
        if (documento.length() < 1) {
            return false;
        }
        PersonaDao personaDao = new PersonaDao();
        return personaDao.eliminar(documento);
    }
	
}