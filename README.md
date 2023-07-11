# compositePattern
Implementação do padrão Composite em Java.

# Problema

![UML](https://a.imagem.app/bFDH91.png)

Implemente o código do diagrama UML. O uso das classes deverá ser demonstrado
na sua função main de uma Classe Principal, cujo conteúdo está na página seguinte (você
pode adaptar o conteúdo das strings ou números, se desejar).

# Alguns requisitos:
● Devem ser implementados os getters e setters necessários, mesmo que não estejam
listados no diagrama. Fique atento aos atributos private!

● O construtor de Episódio deve receber nome, duração (em minutos) e infantil (um
atributo booleano que diz se o conteúdo do episódio é voltado para o público infantil ou
não). O construtor de Episódios deve receber somente o nome

● Para o método reproduzir da classe Episódio, basta exibir no terminal uma
informação como "Reproduzindo o episódio X", onde X é o nome do Vídeo em
questão.

● O método getDuração da Episódios deve retornar a duração total de todo o
conteúdo que foi adicionado nela

● O método reproduzir() da Episódios deve reproduzir em sequência o conteúdo
que foi adicionado nela

● O método isInfantil() da Episódios deve verificar se há algum conteúdo que não
é infantil dentro de sua lista de Vídeos. Se houver pelo menos um conteúdo que não é
infantil, ele retorna false, caso contrário, retorna true.

# input


~~~java
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
~~~

# output

```
O total da duração de Black Mirror é de 361 minutos.
Os episódios não são apropriados para crianças!
Vamos maratonar!
Reproduzindo os episódios de Black Mirror
Reproduzindo os episódios de Black Mirror S01
Reproduzindo o episódio The National Anthem
Reproduzindo o episódio Fifteeen Million Merits
Reproduzindo o episódio The Entire History of You
Reproduzindo os episódios de Black Mirror S02
Reproduzindo o episódio Be Right Back
Reproduzindo o episódio White Bear
Reproduzindo o episódio The Waldo Moment
Reproduzindo o episódio White Christmas
```
