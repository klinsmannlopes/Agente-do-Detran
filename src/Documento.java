
public class Documento {
	private String cor;
	private String modelo;
	private String placa;
	private Veiculo veic;
	
	Documento(){
		this.setCor("");
		this.setModelo("");
		this.setPlaca("");
		this.setVeic(null);
	}
	
	Documento(String color, String mod, String pla, Veiculo vei){
		this.setCor(color);
		this.setModelo(mod);
		this.setPlaca(pla);
		this.setVeic(vei);
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Veiculo getVeic() {
		return veic;
	}
	public void setVeic(Veiculo veic) {
		this.veic = veic;
	}

}
