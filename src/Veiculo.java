
public class Veiculo {
	private int peso;
	private int velo;
	private float preco;
	private int estado;
	private Motor motor;
	
	Veiculo(){
		this.setPeso(0);
		this.setVelo(0);
		this.setPreco(0);
		this.setEstado(0);
		this.setMotor(null);
	}
	
	Veiculo(int pes, int vel, float pre, int est, Motor mot){
		this.setPeso(pes);
		this.setVelo(vel);
		this.setPreco(pre);
		this.setEstado(est);
		this.setMotor(mot);
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getVelo() {
		return velo;
	}
	public void setVelo(int velo) {
		this.velo = velo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

}
