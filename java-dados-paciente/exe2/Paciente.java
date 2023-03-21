package exe2;

public class Paciente {
	String nome;
	double peso;
	double altura;
	double quadril;
	int idade;
	double frequenciaAlvo;

	public Paciente(String nome, double peso, double altura, double quadril, int idade) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
		this.idade = idade;

	}

	public double calculeIMC() {
		double IMC = peso / (altura * altura);

		return IMC;
	}

	public double calculeBai() {
		double bai = (float) (quadril / (altura * (Math.sqrt(altura))));
		return bai;
	}

	public double Freqcard() {
		double freq = 220 - idade;

		return freq;
	}

	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		double freq = Freqcard();
		alvo[0] = freq * 0.50;
		alvo[1] = freq * 0.85;

		return alvo;
	}

}
