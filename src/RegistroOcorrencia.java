
public class RegistroOcorrencia {
	public void registrarOcorrencia(Documento doc1, Documento doc2, int est1, int est2){
		Veiculo vei1 = doc1.getVeic();
		Veiculo vei2 = doc2.getVeic();
		
		if (doc1.getVeic().getMotor().getChassi() != doc2.getVeic().getMotor().getChassi()) {
			System.out.println("Número de chassi igual.");
		} else {
			vei1.setEstado(est1);
			vei2.setEstado(est2);

			if (est1 == 0) {
				doc1.getVeic().getMotor().setAssoiado(false);
			} else if (est2 == 0) {
				doc2.getVeic().getMotor().setAssoiado(false);
			}
		}
	}
	
	public void registrarOcorrencia(Documento doc1, Documento doc2, Documento doc3, int est1, int est2, int est3){

		if (doc1.getVeic().getMotor().getChassi() != doc2.getVeic().getMotor().getChassi()) {
			System.out.println("Chassi do documento 1 igual ao do documento 2.");
		} else {
			doc1.getVeic().setEstado(est1);
			doc2.getVeic().setEstado(est2);
			if (est1 == 0) {
				doc1.getVeic().getMotor().setAssoiado(false);
			} else if (est2 == 0) {
				doc2.getVeic().getMotor().setAssoiado(false);
			}
		}
		
		if (doc1.getVeic().getMotor().getChassi() != doc3.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 1 igual ao do documento 3.");
		}
		else{	doc1.getVeic().setEstado(est1);
			doc3.getVeic().setEstado(est3);
			if (est1 == 0) {
				doc1.getVeic().getMotor().setAssoiado(false);
			} else if (est3 == 0) {
				doc3.getVeic().getMotor().setAssoiado(false);
			}
		}
		

		if (doc2.getVeic().getMotor().getChassi() != doc3.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 2 igual ao do documento 3.");
		}
		else{doc2.getVeic().setEstado(est2);
			doc3.getVeic().setEstado(est3);
			if (est2 == 0) {
				doc2.getVeic().getMotor().setAssoiado(false);
			} else if (est3 == 0) {
				doc3.getVeic().getMotor().setAssoiado(false);
			}
		}
		
	}
	
	public void registrarOcorrencia(Documento doc1, Documento doc2, Documento doc3,Documento doc4, int est1, int est2, int est3, int est4){

		if (doc1.getVeic().getMotor().getChassi() != doc2.getVeic().getMotor().getChassi()) {
			System.out.println("Chassi do documento 1 igual ao do documento 2.");
		} else {
			doc1.getVeic().setEstado(est1);
			doc2.getVeic().setEstado(est2);
			if (est1 == 0) {
				doc1.getVeic().getMotor().setAssoiado(false);
			} else if (est2 == 0) {
				doc2.getVeic().getMotor().setAssoiado(false);
			}
		}
		
		if (doc1.getVeic().getMotor().getChassi() != doc3.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 1 igual ao do documento 3.");
		}
		else{	doc1.getVeic().setEstado(est1);
			doc3.getVeic().setEstado(est3);
			if (est1 == 0) {
				doc1.getVeic().getMotor().setAssoiado(false);
			} else if (est3 == 0) {
				doc3.getVeic().getMotor().setAssoiado(false);
			}
		}
		
		if (doc1.getVeic().getMotor().getChassi() != doc4.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 1 igual ao do documento 4.");
		}
		else{	doc1.getVeic().setEstado(est1);
			doc4.getVeic().setEstado(est4);
			if (est1 == 0) {
				doc1.getVeic().getMotor().setAssoiado(false);
			} else if (est3 == 0) {
				doc4.getVeic().getMotor().setAssoiado(false);
			}
		}

		if (doc2.getVeic().getMotor().getChassi() != doc3.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 2 igual ao do documento 3.");
		}
		else{doc2.getVeic().setEstado(est2);
			doc3.getVeic().setEstado(est3);
			if (est2 == 0) {
				doc2.getVeic().getMotor().setAssoiado(false);
			} else if (est3 == 0) {
				doc3.getVeic().getMotor().setAssoiado(false);
			}
		}
		
		if (doc2.getVeic().getMotor().getChassi() != doc4.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 2 igual ao do documento 4.");
		}
		else{doc2.getVeic().setEstado(est2);
			doc4.getVeic().setEstado(est4);
			if (est2 == 0) {
				doc2.getVeic().getMotor().setAssoiado(false);
			} else if (est4 == 0) {
				doc4.getVeic().getMotor().setAssoiado(false);
			}
		}
		
		if (doc3.getVeic().getMotor().getChassi() != doc4.getVeic().getMotor().getChassi()){
			System.out.println("Chassi do documento 3 igual ao do documento 4.");
		}
		else{doc3.getVeic().setEstado(est3);
			doc4.getVeic().setEstado(est4);
			if (est3 == 0) {
				doc3.getVeic().getMotor().setAssoiado(false);
			} else if (est4 == 0) {
				doc4.getVeic().getMotor().setAssoiado(false);
			}
		}
		
	}

}
