package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Onibus onibus1 = new Onibus("abcd", 1901, 11);
		Onibus onibus2 = new Onibus("abcd", 1902, 22);
		Onibus onibus3 = new Onibus("abcd", 1903, 33);
		Caminhao caminhao1 = new Caminhao("abcd", 1901, 1);
		Caminhao caminhao2 = new Caminhao("abcd", 1902, 2);
		Caminhao caminhao3 = new Caminhao("abcd", 1903, 3);
		ArrayList<Onibus> GO = new ArrayList<>();
		ArrayList<Caminhao> GC = new ArrayList<>();
		GO.add(onibus1);
		GO.add(onibus2);
		GO.add(onibus3);
		GC.add(caminhao1);
		GC.add(caminhao2);
		GC.add(caminhao3);

		for (Caminhao i : GC) {
			System.out.println(i.toString());
		}
		for (Onibus i : GO) {
			System.out.println(i.toString());
		}
	}

}
