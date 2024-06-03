# Funcionamento do Contador em Java

Este programa em Java permite contar de um número para outro, fornecidos pelo usuário.

## Como funciona

1. O programa solicita que o usuário insira dois parâmetros (números inteiros) através do terminal.

2. O método `contar(parametroUm, parametroDois)` é chamado, onde a lógica de contagem é implementada.

3. Dentro do método `contar`, é verificado se o primeiro parâmetro é maior que o segundo. Se for, uma exceção é lançada, indicando que o segundo parâmetro deve ser maior que o primeiro.

4. Se a condição acima não for atendida, a contagem é realizada. A diferença entre o segundo e o primeiro parâmetro é calculada e um loop imprime os números de forma incremental no console.

## Observações

- Este programa só aceita números inteiros como entrada.
- Se o segundo parâmetro for menor ou igual ao primeiro, o programa lançará uma exceção.

