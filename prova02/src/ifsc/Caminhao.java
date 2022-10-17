package ifsc;

public class Caminhao extends Veiculo {

	private int eixos;

	public Caminhao(String placa, int ano, int assento) {
		super.setPlaca(placa);
		super.setAno(ano);
		setEixos(assento);
	}

	@Override
	public String toString() {
		return "Caminhao [eixos=" + getEixos() + ", Placa = " + getPlaca() + ", Ano = " + getAno() + "]";
	}

	public Caminhao() {

	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public void exibirDados() {
		System.out.println("Placa = " + getPlaca() + ", Ano = " + getAno() + ",Eixos = " + getEixos());
	}
}
