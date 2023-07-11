import java.util.LinkedList;

public class Episódios implements Video {
	private String nome;
	private LinkedList<Video> videos;
	
	public Episódios(String nome) {
		
		this.nome = nome;
		this.videos = new LinkedList<Video>();
		
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo " +this.getNome());
		for (Video video : this.videos) {
			video.reproduzir();
		}
		
	}

	@Override
	public boolean isInfantil() {
		return false;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public int getDuração() {
		int tot=0;
		for (Video video : this.videos) {
				tot += video.getDuração();
			}
		
		return tot;
	}
	
	public void adicionar(Video video) {
		this.videos.add(video);
	}
	public void remover(Video video) {
		this.videos.remove(video);
	}
	
}