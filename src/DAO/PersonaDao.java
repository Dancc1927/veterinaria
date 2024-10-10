package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import VO.Conexion;
import VO.PersonaVO;

public class PersonaDao {

	public boolean registrar(String documento, String nombre, String telefono) {
		Conexion miConexion = new Conexion();
        try {
            Statement consulta = miConexion.getConnection().createStatement();
            consulta.executeUpdate("INSERT INTO personas (documento,telefono,nombre) VALUES (\""+documento+"\",\""+telefono+"\",\""+nombre+"\")");
            JOptionPane.showMessageDialog(null, "Se ha registrado a "+nombre);
            consulta.close();
            miConexion.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo registrar a la persona", "Error", JOptionPane.ERROR_MESSAGE);
            miConexion.desconectar();
		return false;
	}

}    public PersonaVO consultar(String documento) {
    PersonaVO personaConsultada = new PersonaVO();
    Conexion miConexion = new Conexion();
    try {
        Statement consulta = miConexion.getConnection().createStatement();
        PreparedStatement consultar = miConexion.getConnection().prepareStatement("SELECT * FROM personas WHERE documento=\""+documento+"\"");
        ResultSet res = consultar.executeQuery();
        boolean existe = false;
        while(res.next()) {
            existe = true;
            personaConsultada.setDocumento(res.getString("documento"));
            personaConsultada.setNombre(res.getString("nombre"));
            personaConsultada.setTelefono(res.getString("telefono"));
        }
        consulta.close();
        miConexion.desconectar();
        if (existe)
            return personaConsultada;
        else
            return null;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        miConexion.desconectar();
        return null;
    }
}

public boolean eliminar (String documento) {
    Conexion miConexion = new Conexion();
    try {
        Statement consulta = miConexion.getConnection().createStatement();
        boolean resultado = consulta.executeUpdate("DELETE FROM personas WHERE documento=\""+documento+"\"") != 0;
        consulta.close();
        miConexion.desconectar();
        return resultado;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        miConexion.desconectar();
        return false;
    }
}
public ArrayList<PersonaVO> listar() {
	// TODO Auto-generated method stub
	return null;
}

}
