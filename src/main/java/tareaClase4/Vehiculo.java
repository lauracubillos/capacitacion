package tareaClase4;

public class Vehiculo {

	
	private String conbustion;
	private int cantidadLlantas;
	
	public Vehiculo() {
		
		conbustion = null;
		cantidadLlantas = 0;

		
	}

	public String getConbustion() {
		return conbustion;
	}

	public void setConbustion(String conbustion) {
		if (conbustion == "Disel") {
		this.conbustion = conbustion;
		}else {
			System.out.println("Error no se permite diferente a gasolina");
		}
		}

	public int getCantidadLlantas() {
		return cantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		if (cantidadLlantas<3) {
			this.cantidadLlantas = cantidadLlantas;
		}else {
			System.out.println("Error no se permite crear vehiculos con menos de 4 llantas");
	}
}
	}
