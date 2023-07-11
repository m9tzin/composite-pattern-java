
public class Principal {
	public static void main(String[] args) {
		Episódios s01 = new Episódios("Black Mirror S01");
		Episódio ep01 = new Episódio("The National Anthem", 44, false);
		Episódio ep02 = new Episódio("Fifteeen Million Merits", 62, false);
		Episódio ep03 = new Episódio("The Entire History of You", 49, false);
		
		s01.adicionar(ep01);
		s01.adicionar(ep02);
		s01.adicionar(ep03);

		Episódios s02 = new Episódios("Black Mirror S02");

		Episódio ep04 = new Episódio("Be Right Back", 48, false);
		Episódio ep05 = new Episódio("White Bear", 42, false);
		Episódio ep06 = new Episódio("The Waldo Moment", 43, false);
		Episódio ep07 = new Episódio("White Christmas", 73, false);

		s02.adicionar(ep04);
		s02.adicionar(ep05);
		s02.adicionar(ep06);
		s02.adicionar(ep07);
		
		Episódios série = new Episódios("Black Mirror");
		série.adicionar(s01);
		série.adicionar(s02);
		
		System.out.println("O total da duração de " + série.getNome() + " é de " +
	série.getDuração() + " minutos.");
		if ( série.isInfantil() == true )
			System.out.println("Os episódios são apropriados para crianças");
		else
			System.out.println("Os episódios não são apropriados para crianças!");
		System.out.println("Vamos maratonar!");
		série.reproduzir();
	}
}
