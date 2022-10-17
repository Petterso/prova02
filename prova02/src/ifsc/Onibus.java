package ifsc;

public class Onibus extends Veiculo {

	private int assento;

	public Onibus(String placa, int ano, int assento) {
		super.setPlaca(placa);
		super.setAno(ano);
		setAssento(assento);
	}

	@Override
	public String toString() {
		return "Onibus [eixos=" + getAssento() + ", Placa = " + getPlaca() + ", Ano = " + getAno() + "]";
	}

	public Onibus() {

	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public void exibirDados() {
		System.out.println("Placa = " + getPlaca() + ", Ano = " + getAno() + ",Assento = " + getAssento());
	}
}
