
public class Episódio implements Video{
	private String nome;
	private int duração;
	private boolean infantil;
	
	public Episódio(String nome, int duração, boolean infantil) {
		
		this.nome = nome;
		this.duração = duração;
		this.infantil = infantil;
		
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo o episódio: "+this.getNome());
		
	}

	@Override
	public boolean isInfantil() {
		return this.infantil;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public int getDuração() {
		return this.duração;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDuração(int duração) {
		this.duração = duração;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	
	
	
}
