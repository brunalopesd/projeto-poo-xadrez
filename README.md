
### Xadrez

Trabalho final proposto para disciplina de orientaçao a objetos.

### Tarefas solicitadas.

* Com todos os conceitos de orientação a objetos visto e quaisquer extras que souberem, façam:

1. Mude o tabuleiro para que tenha o tamanho real de um jogo de xadrez.

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


