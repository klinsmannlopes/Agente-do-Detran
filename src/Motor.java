
public class Motor {
	
		private int numCilindro;
		private int potencia;
		private int chassi;
		private boolean assoiado;
		
		public Motor(){
			this.setNumCilindro(0);
			this.setPotencia(0);
			this.setAssoiado(false);
			this.setChassi(0);
		}
		
		public Motor(int numCili, int pot, int cha, boolean ass){
			this.setNumCilindro(numCili);
			this.setPotencia(pot);
			this.setAssoiado(ass);
			this.setChassi(cha);
		}
		
		public int getNumCilindro() {
			return numCilindro;
		}
		public void setNumCilindro(int numCilindro) {
			this.numCilindro = numCilindro;
		}
		public int getPotencia() {
			return potencia;
		}
		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		public int getChassi() {
			return chassi;
		}
		public void setChassi(int chassi) {
			this.chassi = chassi;
		}
		public boolean isAssoiado() {
			return assoiado;
		}
		public void setAssoiado(boolean assoiado) {
			this.assoiado = assoiado;
		}
		
		
	}


