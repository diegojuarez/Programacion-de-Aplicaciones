package mx.edu.utng.asociaciones_clase;

import java.util.ArrayList;
import java.util.List;





public class TrajetaAnimada extends Tarjeta{
	
	private List<Imagen> imagens;
	private List<Fondo> fondos;
	private List<Dedicatoria> dedicatorias;
	

	public TrajetaAnimada(List<Remitente> remitentes,
			List<Destinatario> destinatarios, List<Imagen> imagens, List<Fondo> fondos) {
		
		super(remitentes, destinatarios);
		this.dedicatorias = new ArrayList<Dedicatoria>();
		this.imagens = imagens;
		this.fondos = fondos;
		// TODO Auto-generated constructor stub
	}

	
}
