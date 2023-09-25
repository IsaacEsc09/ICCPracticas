package poo;

public class TarjetaMetro {
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int calcularViajes() {
		int costoViaje=5;
		return saldo/costoViaje;
	}
	
	public int calcularSobrante() {
		int costoViaje=5;
		return saldo%costoViaje;
	}
	
	public TarjetaMetro(int nuevoSaldo) {
		this.saldo=nuevoSaldo;
	}
	
	public String toString() {
		return "Con "+saldo+" pesos \n"+
				"puedes realizar "+calcularViajes()+" viajes\n"+
				"y te sobra "+calcularSobrante()+" pesos";
	}
	
}
