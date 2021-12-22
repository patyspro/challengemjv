# challengemjv
Desafio Mjv

### Classe File (Pesquisa):

#### Realizar uma breve descrição da classe em questão:

A classe java.io.File destina-se a obter informações sobre o arquivo e não sobre seu conteúdo. Portanto alguns exemplos do que podemos obter com essa classe
são: se o arquivo existe, se é possível lê-lo, se é de fato um arquivo, etc.

#### Apresentar alternativas de instanciação de objetos com contrutor ou metódos singleton:

Arquivo teste [MainArquivo](src/desafio)
Na construção de um objeto file podemos passar o parâmetro path (uma String) que se trata do caminho do arquivo.
```
File arquivo = new File ("caminho do arquivo");
System.out.println(arq.exists());
```
iniciando o trecho de código acima no método main com um caminho válido de um arquivo existente obtemos o retorno true no console.

#### Apresentar no mínimo 04 métodos mais utilizados destacando o seu contrato (tipo retorno + nome + parâmetros):

O método no trecho tem o seguinte contrato: public boolean exists
Ou seja, temos um método público podendo ser acessado fora da classe que retorna um boolean que tem um nome de exists não recebendo nenhum parâmetro.

```
File arq = new File("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\texto.txt");
		File diretorio = new File ("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\");
		
		System.out.println(arq.exists());//se houver arquivo
		System.out.println(arq.getPath());//retorna o caminho do arquivo
		System.out.println(arq.length());//retorna a quantidade de bytes do arquivo
		System.out.println(arq.isFile());//verifica se é um arquivo
		System.out.println(arq.isDirectory());//verifica se é um diretório
		
		System.out.println(diretorio.isDirectory());
```
Nesse último trecho da classe File temos outros testes realizados no nosso objeto arq e no objeto diretorio criado logo depois.
Destacando o método de nome getPath temos o seguinte contrato: é público, retorna uma String e não recebe parâmetros. Esse método,
segundo a documentação, converte seu caminho para uma string, esse retorno usa o caractere padrão para separação de nomes do diretório.
O trecho acima nos daria um resultado para o cenário de ter no mesmo diretorio um arquivo chamado texto.txt com 22 caracteres gravados nele:
true
D:\PROJETOS\MJV_JAVA\aulas\aula_6\src\desafio\texto.txt
22
true
false
true

Como podemos observar no método isDirectory a diferença entre o objeto arq e o objeto diretorio é apenas o nome do arquivo.
O método é público e retorna um booleano que verifica se o objeto é um diretório e não recebe parâmetros.

Parecido com esse o método isFile verifica se o objeto criado é um arquivo, retorna um booleano e não recebe parâmetros.

#### Apresentar se alguns dos métodos é sobrecarregado:

Nessa classe o método createTempFile é um método sobrecarregado. Em sua primeira assinatura (ou contrato) temos um método estático
o retorno um tipo File e como parâmetros um prefixo e um sufixo ambos Strings para gerar seu nome. Na sua sobrecarga temos um método
estático que também retorna um File, mas recebe três parâmetros: prefixo e sufixo ambos Strings e um File que se trata do diretório
em que será criado o arquivo temporário.

