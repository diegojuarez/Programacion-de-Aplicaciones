package mx.edu.utng.asociaciones_clase;

import java.util.List;

public class ArchivoDeTarjeta {
	private String nombre;
	private List<TrajetaAnimada> asociadas;
	Tarjeta [] tarjetas = new Tarjeta[1];
	
	public ArchivoDeTarjeta(List<TrajetaAnimada> asociadas) {
		this.asociadas = asociadas;
		// TODO Auto-generated constructor stub
	}
	public void adicionar(Tarjeta tarjeta){
		
	}
public void modificar(Tarjeta tarjeta){
		
	}
public void eliminar(Tarjeta codigo){
	
}
public void getDatos(){
	
}
public void nroRegistros(){
	
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the asociadas
 */
public List<TrajetaAnimada> getAsociadas() {
	return asociadas;
}
/**
 * @param asociadas the asociadas to set
 */
public void setAsociadas(List<TrajetaAnimada> asociadas) {
	this.asociadas = asociadas;
}


}
