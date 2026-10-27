# Chain of Responsibility – Sistema de Suporte de um Jogo Online

## Descrição
Este projeto demonstra o padrão de projeto comportamental **Chain of Responsibility** em Java, utilizando como exemplo um sistema de suporte de um jogo online.

O sistema encaminha chamados dos jogadores por diferentes níveis de suporte, permitindo que cada responsável trate os tipos de problemas pelos quais é responsável.

## Níveis de suporte
- **Atendente de Suporte:** problemas de acesso à conta.
- **Suporte Nível 2:** problemas de conexão.
- **Suporte Nível 3:** problemas de software.
- **Administrador do Sistema:** problemas de servidor.

Problemas de pagamento não são atendidos por nenhum dos níveis, retornando a mensagem "Sem atendimento".

## Tecnologias utilizadas
- Java
- JUnit 5
- Padrão de projeto Chain of Responsibility
- Padrão Singleton

## Testes
Os testes automatizados verificam se cada tipo de problema é encaminhado ao responsável correto e se chamados sem um responsável correspondente retornam "Sem atendimento".

## Diagramas
O projeto também conta com um diagrama de classes UML, que representa a estrutura das classes e seus relacionamentos, e um diagrama de estados, que ilustra conceitualmente o fluxo de atendimento dos chamados.

## Objetivo
Compreender e demonstrar a aplicação do padrão Chain of Responsibility, permitindo que uma solicitação passe por uma sequência de responsáveis até encontrar aquele que pode atendê-la.
