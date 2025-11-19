# Filtragem Declarativa de Objetos com a Stream API em Java

Este projeto representa uma **evolução nos estudos sobre coleções Java**, com foco na **programação funcional** e no **processamento declarativo de listas** utilizando a **Stream API** (introduzida no Java 8).

O objetivo central é demonstrar como **operações funcionais (filter, map, reduce)** podem ser aplicadas sobre listas de objetos para realizar **filtragem, transformação e agregação** de forma concisa, imutável e altamente expressiva.

O estudo é implementado sobre um **sistema de gerenciamento de produtos**, que emprega `ArrayList`, `Enum` e operações da API Stream para manipulação de dados de forma moderna e elegante.

---

## Objetivo Principal do Programa

| Área | Objetivo |
| :--- | :--- |
| **Stream API** | Demonstrar o uso prático das operações `filter`, `map`, `reduce` e `forEach` em coleções. |
| **Processamento Declarativo** | Ensinar como expressar a lógica de filtragem e agregação por meio de funções, sem loops explícitos. |
| **Enumerações e Segurança de Tipo** | Utilizar `Enum` para representar categorias de produto com segurança e consistência. |
| **Agregação de Dados** | Calcular totais de estoque e valores de inventário usando operações de redução. |
| **Código Limpo e Funcional** | Demonstrar a integração fluida entre POO e programação funcional no Java moderno. |

---

## O Uso da Stream API Neste Contexto

A lógica do programa foi projetada para **filtrar produtos por tipo** (**VERDURA**, **FRUTA**, **LEGUME**) e exibir os produtos filtrados, a quantidade total em estoque e o valor total do inventário do tipo selecionado.

| Conceito | Aplicação no Projeto | Foco Didático |
| :--- | :--- | :--- |
| `filter()` | Seleciona produtos cujo tipo corresponde ao valor informado pelo usuário. | Ensinar uso de **Predicados** dentro de Streams. |
| `map()` | Transforma objetos `Produto` em quantidades ou valores monetários. | Demonstrar **transformação de fluxo**. |
| `reduce()` | Soma valores de forma acumulativa. | Reforçar conceito de **agregação funcional**. |
| `forEach()` | Consome a Stream e imprime objetos filtrados. | Mostrar integração com **Consumers**. |

---

## Estrutura do Projeto e Aplicação Prática

O projeto é claro, modular e dividido em três componentes principais:

### 1. Classe `Produto` — Modelo de Dados
Define os atributos essenciais para representar cada item.

| Recurso | Função no Projeto |
| :--- | :--- |
| **Atributos** (`id`, `nome`, `preco`, `quantidade`, `tipo`) | Representam os dados fundamentais do produto. |
| **Construtor Completo** | Permite criar objetos totalmente inicializados. |
| **Encapsulamento** (`getters/setters`) | Protege e organiza o acesso às propriedades. |
| **`toString()` Formatado** | Fornece saída clara e organizada no console. |

---

### 2. Enum `TipoProduto` — Definição dos Tipos
Define as categorias possíveis do produto: **VERDURA**, **FRUTA**, **LEGUME**.

* **Benefícios**: Evita erros de digitação, garante valores válidos, e melhora legibilidade e manutenção.

---

### 3. Classe `MainClass` — Execução e Demonstração
Responsável por criar a lista, interagir com o usuário e processar os dados.

| Recurso | Descrição |
| :--- | :--- |
| **Criação da lista** (`ArrayList<Produto>`) | Constrói a fonte de dados do programa. |
| **Interação via `Scanner`** | Permite que o usuário selecione o tipo desejado. |
| **Método `selecaoTipo()`** | Realiza filtragem, soma de quantidades e cálculo do valor total. |
| **Uso de Stream API** | Aplica as operações funcionais sobre a lista. |

---

## Tecnologias Utilizadas

* **Java**
* **Paradigma Funcional** aplicado ao Java
* **API Stream** (`filter`, `map`, `reduce`, `forEach`)
* **Enums**
* **POO + Programação Funcional** combinadas
* **Coleções Java** (`ArrayList`)

---

## Decisões de Design

### Separação Clara de Responsabilidades
A lógica de processamento fica 100% no método `selecaoTipo`. A `main` apenas inicializa dados e chama comportamentos.

### Enfoque Didático
Optou-se por **não implementar tratamento de exceções** no *input* via `Scanner` para manter:
* Código conciso.
* Clareza conceitual sobre o uso da Stream API.

### Processamento Declarativo
A Stream API substitui loops imperativos, tornando o código:
* Mais limpo e expressivo.
* Menos propenso a erros.
* Adequado para processamento paralelo no futuro.

### Imutabilidade Operacional
A Stream original **não é modificada**; cada operação cria um **novo fluxo**.

---

## Conclusão

Este projeto apresenta uma introdução prática e clara ao **processamento funcional de coleções em Java**.

A combinação de **filter / map / reduce**, **POO com Enums** e **arquitetura modular** resulta em um código **moderno, simples e altamente legível**, ideal para estudos e domínio da **Stream API**.

---

## Documentação Complementar

Para detalhes técnicos completos sobre a estrutura geral do código, o funcionamento das operações `filter`, `map` e `reduce`, e as justificativas de design, consulte a documentação interna do projeto.
**[Documentação do Projeto: Filtragem Declarativa de Objetos com a Stream API em Java (Notion)](https://www.notion.so/09_Projeto_Stream_Sistema_Analise_Vendas-2aaf4d816bcb8025925ed9b13eb9cbab?source=copy_link)**