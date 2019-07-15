# Design Patterns (EM DESENVOLVIMENTO)
Um padrão de projeto é uma solução consolidada para um problema recorrente no desenvolvimento e manutenção de software 
orientado a objetos.

## Padrões de Criação
Em um sistema orientado a objetos, a criação de certos objetos pode ser uma tarefa extremamente
complexa. Podemos destacar dois problemas relacionados a criação de objetos: a) definir qual classe concreta deve ser utilizada para criar o objeto; b) definir como os objetos devem ser criados e como eles se relacionam com outros objetos do
sistema. Seguindo o princípio do encapsulamento, essa complexidade deve ser isolada. Padrões de projeto de criação podem ser adotados para encapsular a criação de objetos em diversas situações distintas.
### Factory Method
Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um
determinado tipo.
### Abstract Method
Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos
de diversas famílias.
### Builder
Separar o processo de construção de um objeto de sua representação e permitir a sua criação
passo-a-passo. Diferentes tipos de objetos podem ser criados com implementações distintas
de cada passo.
### Prototype
Possibilitar a criação de novos objetos a partir da cópia de objetos existentes.
### Singleton
Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
### Multiton (não GoF)
Permitir a criação de uma quantidade limitada de instâncias de determinada classe e fornecer
um modo para recuperá-las.
### Object Pool (não GoF)
Possibilitar o reaproveitamento de objetos.

## Padrões Estruturais
As interações entre os objetos de um sistema podem gerar fortes dependências entre esses elementos.
Essas dependências aumentam a complexidade das eventuais alterações no funcionamento
do sistema. Consequentemente, o custo de manutenção aumenta. Utilizar padrões de
projeto estruturais ajuda a diminuir o acoplamento entre os objetos de um sistema orientado a objetos.
### Adapter
Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa,
possui uma interface diferente.
### Bridge
Separar uma abstração de sua representação, de forma que ambos possam variar e produzir
tipos de objetos diferentes.
### Composite
Agrupar objetos que fazem parte de uma relação parte-todo de forma a tratá-los sem
distinção.
### Decorator
Adicionar funcionalidade a um objeto dinamicamente.
### Facade
Prover uma interface simplificada para a utilização de várias interfaces de um subsistema.
### Front Controller (não GoF)
Centralizar todas as requisições a uma aplicaçãoWeb.
### ...
...

## Padrões Comportamentais
### ...
...
