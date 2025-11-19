# Estudo Prático de Expressões Lambda e Interfaces Funcionais em Java

Este projeto é uma **evolução do estudo sobre coleções Java**, agora com foco na **aplicação prática da Programação Funcional** dentro da linguagem Java.

O objetivo principal é demonstrar como **expressões Lambda** e **interfaces funcionais** podem tornar o código mais dinâmico, flexível e reutilizável, eliminando a necessidade de múltiplos métodos específicos para cada critério lógico.

O estudo é implementado com base em um **sistema de gerenciamento de produtos**, utilizando **ArrayList** em conjunto com **interfaces funcionais como Predicate e Consumer**.

---

## Objetivo Principal do Programa

| Área | Objetivo |
|------|-----------|
| **Programação Funcional** | Demonstrar o uso de Expressões Lambda como forma de implementar funções anônimas e reduzir o código repetitivo. |
| **Filtragem Dinâmica de Dados** | Aplicar *Predicates* para criar critérios de filtragem flexíveis sobre uma lista de produtos. |
| **Reutilização de Métodos** | Criar um único método genérico (`exibirPorCriterio`) capaz de tratar qualquer regra de exibição definida em tempo de execução via Lambda. |
| **Integração com Coleções Java** | Demonstrar o uso de `ArrayList` em conjunto com funções Lambda para iteração e filtragem de objetos. |
| **Leitura Didática do Código** | Exibir claramente a relação entre Paradigma Funcional e POO, destacando a integração natural entre ambos no Java moderno. |

---

## O Estudo das Expressões Lambda Neste Contexto

O sistema foi projetado para **exibir produtos conforme diferentes critérios**, como status, categoria ou preço, utilizando **funções anônimas** e **interfaces funcionais**.

| Conceito | Aplicação no Projeto | Foco Didático |
|-----------|----------------------|----------------|
| **Lambda Expression** | Usada para definir dinamicamente a regra de filtragem dentro das chamadas do método `exibirPorCriterio`. | Ensina a escrever funções anônimas de forma concisa, sem necessidade de classes ou métodos extras. |
| **Interface Funcional Predicate** | Representa uma função que testa uma condição e retorna `true` ou `false`. | Mostra a aplicação prática de filtros em listas utilizando `predicate.test(objeto)`. |
| **Consumer** | Utilizado indiretamente pelo método `forEach` para percorrer a coleção e exibir os produtos. | Demonstra o uso de ações funcionais sem retorno em coleções. |

---

## Estrutura do Projeto e Aplicação Prática

O projeto foi desenvolvido de forma **modular e clara**, composto por duas classes principais:

### Classe `Produto` — O Modelo de Dados

Representa os **atributos e comportamentos essenciais** de um produto.

| Recurso | Função no Projeto |
|----------|------------------|
| **Atributos (`id`, `nome`, `preço`, `estoque`, `categoria`, `status`)** | Modelam as informações básicas de um item de hardware. |
| **Construtor Completo** | Garante a criação de objetos `Produto` totalmente inicializados. |
| **Getters e Setters** | Mantêm o encapsulamento e permitem acesso controlado aos dados. |
| **Método `toString()`** | Formata a saída de cada produto para exibição amigável no console. |

---

### Classe `MainClass` — Execução e Demonstração

Responsável por **criar a lista de produtos, aplicar os filtros e exibir os resultados**.

| Recurso | Função no Projeto |
|----------|------------------|
| **`ArrayList<Produto>`** | Armazena dinamicamente todos os produtos criados. |
| **`forEach()`** | Itera sobre a coleção, aplicando um `Consumer` para exibir os itens. |
| **`exibirPorCriterio()`** | Método genérico que recebe uma lista e um `Predicate<Produto>` para testar condições dinâmicas. |
| **Expressões Lambda** | Definem o comportamento do `Predicate` em tempo de execução. |

> 💡 Cada chamada do método `exibirPorCriterio` implementa, **em tempo real**, o método abstrato `test(T t)` da interface `Predicate`.

---

## Tecnologias Utilizadas

- **Java**
- **Paradigma Funcional e POO combinados**
- **Interfaces Funcionais:** `Predicate`, `Consumer`, `Function`, `Supplier`
- **Coleções Java:** `ArrayList`
- **Lambda Expressions**

---

## Decisões de Design

### Código Genérico e Reutilizável
Um único método (`exibirPorCriterio`) pode aplicar **qualquer regra de filtragem**, reduzindo duplicações.

### Integração entre POO e Programação Funcional
Os objetos `Produto` mantêm o **encapsulamento e a modelagem orientada a objetos**, enquanto os filtros são definidos com **funções anônimas e expressivas**.

### Uso de Interfaces Funcionais da Biblioteca Padrão
Evita a criação de interfaces personalizadas, utilizando recursos **nativos do Java moderno**.

### Legibilidade e Clareza
As expressões lambda tornam o código mais direto, eliminando a necessidade de **classes internas anônimas**.

---

## Conclusão

Este projeto ilustra como a **Programação Funcional em Java** pode ser aplicada de maneira simples e prática, mesmo em sistemas orientados a objetos.

O uso de **Lambda Expressions** e **Interfaces Funcionais** reduz significativamente a verbosidade do código e amplia a flexibilidade da aplicação.

O resultado é um programa **didático, limpo e moderno**, que demonstra a capacidade do Java de **unir abstração orientada a objetos e funções de primeira classe** em um mesmo ecossistema.

---

## Documentação Complementar

Para uma análise detalhada sobre **Lambda Expressions**, **Predicate**, **Consumer**, e o funcionamento completo do método `exibirPorCriterio`, consulte o documento técnico:

**[Documentação do Projeto: Lambda e Interfaces Funcionais em Java (Notion)](https://www.notion.so/08_Projeto_Lambda_Produto-294f4d816bcb802d8cebc2a5d9ac5852?source=copy_link)**x
