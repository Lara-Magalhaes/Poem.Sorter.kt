 Poem Sorter
App Android que sorteia frases de livros e poemas. A cada toque no botão Sortear, o app mostra uma frase junto com o livro de onde ela veio.
Projeto de estudo desenvolvido em linguagem Kotlin com Jetpack Compose.

O que ele faz? 
- Sorteio aleatório de frases com um toque
- Exibição da frase com o respectivo livro. 
- Interface minimalista com logo, fundo escuro e detalhes decorativos.
- Layout adaptável a diferentes tamanhos de tela

Tecnologias
- Kotlin
- Jetpack Compose 
- Estado com `remember` e `mutableStateOf`
- Renderização condicional com `if`
- Layout com `Column`, `Box`, `weight` e `Arrangement.spacedBy`
- Edge-to-edge com `safeDrawingPadding`

Estrutura do projeto
```
com.mutare.poem
├── MainActivity.kt    # Tela principal e lógica do sorteio
├── Frases.kt          # data class Frase + lista de frases
└── ui/theme/          # Cores, fontes e tema
```
Dados e persistência

As frases ficam em uma ‘data class’ e em uma lista simples, em um arquivo separado para manter o código organizado:

kotlin
data class Frase (val texto: String, val livro: String)

val frases = listOf(
    Frase("Texto da frase", "Livro"),
    
)
```
Por que não inserir as frases em um banco de dados?
> O projeto não usa banco de dados de propósito. O acervo é pequeno, fixo e somente para leitura, e o app não precisa salvar nada do usuário. Uma lista em memória resolve o problema com menos código e menos complexidade. Um banco só passaria a fazer sentido se o app ganhasse recursos como favoritos, frases cadastradas pelo usuário ou um acervo grande.

Identidade visual

- Fonte:  família tipográfica: “Alice”, importada para o projeto e usada no título e no botão. (download via Google Fronts).
- Cores: as cores (como o fundo do app e o dourado do botão) foram definidas em hexadecimal e importadas no tema do projeto (ui/theme).
- Logo a imagem da logo não acompanha o repositório. Ela deve ser importada por quem for executar o projeto, em `res/drawable`, com o nome do arquivo.

Como executar?
1. Clone o repositório 
2. Abra o projeto no Android Studio
3. Importe a imagem da logo em `res/drawable` (veja a seção acima)
4. Aguarde a sincronização do Gradle
5. Execute em um emulador ou dispositivo físico

 Observação:
As frases são citações curtas, sempre com a fonte indicada. As traduções podem variar conforme a edição de cada livro.

Demonstração:
Um vídeo de demonstração segue abaixo:
 
https://github.com/user-attachments/assets/ea56e863-f606-4c88-8664-8c0566367a0d




