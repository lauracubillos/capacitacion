package tareaClase4;

public class Carro {

	private String colorCarro;

	public Carro() {

		colorCarro = null;

	}

	public String getColorCarro() {
		return colorCarro;
	}

	public void setColorCarro(String colorCarro) {
		if (colorCarro == "Rojo") {
			this.colorCarro = colorCarro;
		} else {
			System.out.println("No se permite color diferente a Azul");
		}
	}
}
