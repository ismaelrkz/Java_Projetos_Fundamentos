# Estudo Prático de Coleções Java com ArrayList

Este projeto é uma **evolução do sistema de cadastro de alunos**, agora com foco na **utilização da interface de programação de Coleções em Java**, especificamente o **ArrayList**.

O objetivo principal é demonstrar **como gerenciar e persistir o cadastro de múltiplos objetos (`Aluno`) de forma dinâmica**, mantendo a **robustez e a integridade dos dados**, estabelecida previamente com o **Tratamento de Exceções**.

---

## Objetivo Principal do Programa

| Área                        | Objetivo                                                                                                                                                         |
|-----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Gerenciamento Dinâmico**  | Utilizar `ArrayList` para permitir que o usuário defina a quantidade de alunos a cadastrar em tempo de execução.                                                 |
| **Persistência de Objetos** | Iterar sobre a quantidade desejada, criando um novo objeto `Aluno` em cada loop e adicionando-o à lista (`listaAluno.add(a)`).                                   |
| **Robustez Mantida**        | Manter a validação rigorosa dos dados (**Notas: 0–10; Nome: Apenas Letras**) utilizando a `CustomException` e o `try/catch`.                                     |
| **Exibição Eficiente**      | Utilizar o **Enhanced For Loop (`for-each`)** para percorrer toda a coleção e exibir os dados completos (incluindo a Nota Final) de todos os alunos cadastrados. |

---

## O Estudo do ArrayList Neste Contexto

O sistema foi redesenhado na classe principal `MainClassAluno` para incluir a estrutura de coleção.

| Conceito                     | Aplicação no Projeto                                                                                              | Foco Didático                                                                 |
|------------------------------|-------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| **ArrayList**                | Usado para declarar uma lista tipada (`ArrayList<Aluno>`) que armazena zero ou mais objetos `Aluno`.              | Demonstra o uso de **listas dinâmicas** para um número variável de elementos. |
| **Método `add()`**           | Invocado dentro do `for` principal, adicionando cada novo objeto `Aluno` à coleção após a validação bem-sucedida. | Ilustra a **inserção de elementos** em uma lista tipada.                      |
| **Loop de Cadastro (`for`)** | Controla a criação de novos objetos `Aluno` baseado na quantidade inserida pelo usuário.                          | Conecta a interação do usuário com a **alocação dinâmica de objetos**.        |
| **Iteração (`for-each`)**    | Utilizado ao final do programa para percorrer todos os elementos da lista (`for (Aluno l : listaAluno)`).         | Ensina a forma mais **limpa e moderna** de percorrer coleções em Java.        |

---

## Estrutura do Projeto e Aplicação Prática

A estrutura de pacotes foi mantida (**exceção, modelo e execução**), com as principais mudanças concentradas na classe de execução.

---

### Pacote `br.com.ismael.projetoexcecoes.model` — O Modelo de Dados

#### **Classe `Aluno`**

- **Validação (Inalterada):**  
  Continua sendo o ponto central de integridade dos dados.  
  As exceções (`throws CustomException`) garantem que o objeto `Aluno` só é adicionado ao `ArrayList` se for **100% válido**.

- **`toString()`:**  
  A sobrescrita do método permite que, ao iterar e imprimir a lista (`System.out.println(l)`),  
  a saída seja **formatada e completa** (Nome, Notas e Nota Final).

---

### ⚙Pacote `br.com.ismael.projetoexcecoes` — Execução e Interação

#### **Classe `MainClassAluno`**

| Recurso | Função no Projeto |
|----------|-------------------|
| **`ArrayList<Aluno> listaAluno`** | A coleção é declarada e inicializada para receber os objetos. |
| **Loop de Quantidade** | A entrada `qtd` é validada com `try/catch` para garantir que o número de alunos seja um valor inteiro. |
| **Loop de Cadastro** | O `for (int i = 0; i < qtd; i++)` envolve a lógica de entrada de dados, garantindo que o programa solicite as informações para o número correto de alunos. |
| **Mecanismo de Persistência** | Após o preenchimento e validação dos dados, o comando `listaAluno.add(a)` armazena o objeto completo. |
| **Exibição Final** | O loop `for (Aluno l : listaAluno)` exibe a coleção completa de objetos persistidos. |

---

## Tecnologias Utilizadas

- **Java**
- **Paradigma POO** com foco em **Encapsulamento**
- **Tratamento de Exceções**  
  (`CustomException`, `try/catch`, `try-with-resources`)
- **Coleções Java** (`ArrayList`, `Enhanced For Loop`)

---

## Decisões de Design

- **Separação de Preocupações:**  
  A lógica de validação permanece na classe `Aluno`, enquanto a lógica de gerenciamento da coleção e interação está em `MainClassAluno`.

- **Segurança de Tipo:**  
  A declaração `ArrayList<Aluno>` evita erros de tipagem em tempo de execução, garantindo que a lista contenha apenas objetos do tipo `Aluno`.

- **Reutilização de Código:**  
  O código de validação robusta (usando `while`/`try/catch`) foi reutilizado e aninhado no loop de cadastro,  
  garantindo que cada aluno da lista seja válido.

---

## Conclusão

Este projeto demonstra a importância de **combinar uma estrutura de dados flexível (`ArrayList`)**  
com um **modelo de objeto robusto e validado** (`Aluno` com exceções).

O resultado é um sistema dinâmico, seguro e didático, reforçando práticas sólidas de **Programação Orientada a Objetos** e **tratamento de exceções em Java**.


## Documentação Complementar

Para um estudo mais detalhado sobre **POO e Tratamento de Exceções e ArrayList** aplicados a este projeto, acesse a documentação completa no Notion:  
**[Documentação do Projeto: Gerenciamento de Alunos com ArrayList em Java (Notion)](https://www.notion.so/Projeto_ArrayList_Cadastro_Aluno_Nota-290f4d816bcb809b95c8e939c29a7522?source=copy_link)**
