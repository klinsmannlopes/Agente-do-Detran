
public class Principal {

	public static void main(String[] args) {

		Motor mot1 = new Motor(123, 10, 1234, false);
		Motor mot2 = new Motor(124, 20, 1235, false);
		Motor mot3 = new Motor(125, 30, 1236, false);
		Motor mot4 = new Motor(126, 40, 1237, false);
		
		Veiculo vec1 = new Veiculo(100, 50, 10000, 100, mot1); 
		mot1.setAssoiado(true); 

		Veiculo vec2 = new Veiculo(200, 60, 11000, 100, mot2); 
		mot2.setAssoiado(true); 

		Veiculo vec3 = new Veiculo(300, 70, 12000, 100, mot3); 
		mot3.setAssoiado(true); 

		Veiculo vec4 = new Veiculo(400, 80, 13000, 100, mot4); 
		mot4.setAssoiado(true); 

		Documento docum1 = new Documento("Azul", "Uno", "abc", vec1);
		Documento docum2 = new Documento("Rosa", "Gol", "asda", vec2);
		Documento docum3 = new Documento("Verde", "Palio", "qwe", vec3);
		Documento docum4 = new Documento("Preto", "Onix", "alfc", vec4);
		
		RegistroOcorrencia reg1 = new RegistroOcorrencia();
		
		reg1.registrarOcorrencia(docum1, docum2, 90, 85);
		
		reg1.registrarOcorrencia(docum1, docum2, docum3, 80, 60, 80);
		
		reg1.registrarOcorrencia(docum1, docum2, docum3, docum4, 70, 45, 60, 0);

	}

}
