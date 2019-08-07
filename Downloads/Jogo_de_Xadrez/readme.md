# Xadrez!

* obs: Não é preciso fazer o xadrez funcionar!!!!!

## Considerções:

* Usem o projeto do eclipse ou do netbeans para começar. Caso preferir outra IDE ou outra forma de desenvolvimento, apenas copie as classes e importe o arquivo "poo_tabuleiro" (poo_tabuleiro/src/poo_tabuleiro.jar) no local adequado.

* O arquivo poo_tabuleiro é do tipo jar e contém os arquivos .class das classes que não estão diretamente declaradas no projeto. Os fontes que originaram o jar entram-se na pasta src em poo_tabuleiro.

### É necessário adicionar o arquivo poo_tabuleiro.jar ao projeto.

* Eclipse:

1. clicar com o botão direito do mouse em cima da pasta do projeto.

2. Build Path > add External Archives.

3. Escolha o poo_tabuleiro.jar.

* Netbeans:

1. clicar com o botão direito do mouse em cima da pasta do projeto.

2. Propriedades

3. Bibliotecas

4. adicionar JAR/pasta

5. Escolha o poo_tabuleiro.jar.

### Tarefas

* Com todos os conceitos de orientação a objetos visto e quaisquer extras que souberem, façam:

1. Importe o arquivo .jar

2. Mude o tabuleiro para que tenha o tamanho real de um jogo de xadrez.

3. Crie todas as peças necessárias para que o jogo de xadrez funcione.

4. Tente criar um objeto do tipo Peca. O que acontece? Porquê? (pesquisar o que é uma classe abstrata).

5. Crie cinco novas classes que desenhe o tabuleiro (usar herança e polimorfismo) de forma diferente, mas sem reimplementar o método desenhar.

6. Faça com que o método movimentosPossiveis da Torre devolva as casas as quais ela pode se mexer (para testar, é preciso usar o método selecionar da peca antes de atualizar e desenhar o tabuleiro).

7. Escolha ou o Bispo ou o Cavalo e também implemente o método movimentosPossiveis.

Para resolver os itens não deve ser preciso mexer nas classes dentro do jar. Entretanto, será preciso entender como elas funcionam.

Exemplo: A Torre quando selecionada deve retornar as Casas as quais ela pode terminar o movimento. Casa com "- -" é uma casa em que a Torre pode ir.
```
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|- -|- -|- -| T |- -|- -|- -|- -|
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
```

A Torre pode andar em cima de uma peça de outra cor, mas não pode andar em cima de uma de mesma cor.

```
+---+---+---+---+---+---+---+---+
|   |   |   | t |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |-p-|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|- -|- -|- -| T |- -| P |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |- -|   |   |   |   |
+---+---+---+---+---+---+---+---+
```

## Recomendações:
1. Entender o que o código faz antes de começar a programar.
2. Fazer diagramas, testes e comentários para ajudar no entendimento do código.

## Condições:
1. No máximo em dupla.
2. Entrega no dia 30/5, por email.
3. A dupla poderá ser arguida sobre as resoluções e caso as respostas não sejam satisfatórias, poderá ter suas notas alteradas.
