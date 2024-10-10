package Principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.coordinador;


public class VentanaPrincipal extends JFrame implements ActionListener{
     
	 JPanel miPanel;
	 JLabel title;
	 JButton ConsultarPersonas,ConsultarMascotas;
	 
	public VentanaPrincipal(){
	
		
		iniciarComponentes();
		setSize(500,400);
		setTitle("Ventana principal");
		setLocationRelativeTo(null);
	
		
	}
	
	public void iniciarComponentes() {
		
	   miPanel= new JPanel();
	   miPanel.setLayout(null);
	  // miPanel.setBackground(Color.red);
	   
	   title= new JLabel();
	   title.setText("SISTEMA VETERINARIA ABC");
	   title.setBounds(200,0,150,30);
	   
	   ConsultarPersonas= new JButton();
	   ConsultarPersonas.setText("Gestionar Personas");
       ConsultarPersonas.setBounds(100,270,130,30);
	   
       ConsultarMascotas= new JButton();
       ConsultarMascotas.setText("Gestionar Mascotas");
       ConsultarMascotas.setBounds(300,270,130,30);
       
       
	   miPanel.add(title);
	   miPanel.add(ConsultarMascotas);
	   miPanel.add(ConsultarPersonas);
	   add(miPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ConsultarPersonas) {
			
			}
		
	}

	public void setCoordinador(coordinador miCoordinador) {
		// TODO Auto-generated method stub
		
	}

   
	 
    
}
