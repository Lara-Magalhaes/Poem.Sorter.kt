package com.mutare.poem

data class Frase(val texto: String, val livro: String)

val frases = listOf(
    Frase("A literatura é a maneira mais agradável de ignorar a vida.", "Livro do Desassossego."),
    Frase(texto = "Você não precisa compreender toda a sua dor para reconhecer que ela merece cuidado.",
        livro = "Água Viva"),
    Frase(
        texto = "Por isso caro senhor, ame a sua solidão e carregue com queixas harmoniosas a dor que ela lhe causa.",
        livro = "Cartas a um jovem poeta."
    ),
    Frase(
        texto = "Sabe papai, quando o senhor quiser me bater, nunca mais eu vou reclamar...Pode me bater mesmo...",
        livro = "O Meu Pé de Laranja Lima."
    ),
    Frase(
        texto = "Imaginava para mim mesmo, aventuras e inventava uma vida, para viver ao menos de algum modo.",
        livro = "Memórias do Subsolo."
    ),
    Frase(
        texto = "Quando as portas estavam trancadas, todos queriam entrar no seu quarto. Agora que ele havia aberto, não vinha ninguém.",
        livro = "A Metamorfose"
    ),
    Frase(
        texto = "Sempre tremia de medo das demais pessoas e nunca tive sequer uma migalha de autoconfiança em relação às minhas palavras e aos meus atos como ser humano.",
        livro = "Declínio de um Homem."
    ),
    Frase(
        texto = "O problema estava em saber se é a doença que atrapalha o crime, ou se o crime, por sua natureza, é que sempre vem acompanhado de um certo grau de doença...",
        livro = "Crime e Castigo"
    ),

    Frase("Nessas horas eu sinto que entreguei toda a minha alma a alguém que a trata como se fosse uma flor de decoração.",
        "O Retrato de Dorian Gray"),
    // exemplos de frases

    Frase(texto = "Todo impulso que lutamos para asfixiar persiste na mente e nos envenena. A única maneira de nos livrarmos de uma tentação é ceder a ela.", "O Retrato de Dorian Gray")
)
