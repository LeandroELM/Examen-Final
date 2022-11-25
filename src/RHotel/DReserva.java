package RHotel;

public class DReserva {
	private float Precio;
	private float total;
	private int reservar,disponible,noches;
	public DReserva(float precio, float total, int reservar, int disponible, int noches) {
		
		this.Precio = precio;
		this.total = total;
		this.reservar = reservar;
		this.disponible = disponible;
		this.noches = noches;
	}
	
	public float obtnerTotal(float total,int noches,float precio) {
		
		total=(int)noches * precio;
		
		return total;
	}
	
	public int obtenerReserva(int reservar) {
		
		return reservar;
	}
	
	
	public String obtenerNombre(String nombreC) {
		
		return nombreC;
		
	}
	
	public float obtenerPrecio(float precio,int reservar) {
		
		precio=reservar*precio;
		return precio;
	}
	

	public int obtenerDisponible(int disponible,int Nhabitaciones,int reservar) {
		disponible=Nhabitaciones -reservar;
		return disponible;
	}	
		public int obtenerNoches(int noches,float precio) {
			noches=(int)((int)noches*precio);
			return noches;
			
		}

		
		public void setPrecio(float precio) {
			Precio = precio;
		}

		

		public void setTotal(float total) {
			this.total = total;
		}

	

		public void setReservar(int reservar) {
			this.reservar = reservar;
		}

	

		public void setDisponible(int disponible) {
			this.disponible = disponible;
		}

		
		public void setNoches(int noches) {
			this.noches = noches;
		}
		
}
