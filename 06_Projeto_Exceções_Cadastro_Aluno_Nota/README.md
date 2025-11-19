# Estudo Prático de Tratamento de Exceções em Java

Este projeto foi desenvolvido com foco **prático e didático** no estudo aprofundado do **Tratamento de Exceções em Java**.  
Ele simula um módulo simples de **cadastro de alunos e notas**, com o objetivo principal de garantir a **integridade dos dados** através de **regras de validação rigorosas**.

O projeto demonstra como utilizar **exceções customizadas** para validar regras de negócio e como estruturar o código de interação com o usuário, garantindo que apenas dados válidos sejam persistidos — resultando em um software mais **robusto e amigável**.

---

## Objetivo Principal do Programa

- **Garantir a Qualidade da Entrada de Dados**  
  Implementar validações estritas (ex.: notas entre 0 e 10, nomes sem caracteres numéricos) em todos os pontos de entrada do sistema (`setters`).

- **Educação sobre Exceções**  
  Aplicar e demonstrar o uso correto de `throw`, `throws`, **exceções customizadas** (Checked Exceptions), `try/catch` e `try-with-resources`.

- **Processamento**  
  Calcular a **nota final ponderada** do aluno e exibir o resultado.

---

## O Estudo do Tratamento de Exceções Neste Contexto

O sistema foi construído sobre **três pilares fundamentais** do tratamento de erros em Java:

| Conceito | Aplicação no Projeto | Foco Didático |
|-----------|----------------------|----------------|
| **Exceção Customizada (`CustomException`)** | Classe que estende `Exception`, tornando-a **Checked**. | Define regras de negócio claras, forçando o tratamento de erros. |
| **Propagação de Erros (`throws` & `throw`)** | Métodos privados (`validarNota`) usam `throw` para lançar a exceção, e os setters públicos usam `throws` para propagá-la. | Diferencia o ato de **lançar (`throw`)** do ato de **declarar/propagar (`throws`)**. |
| **Captura de Erros (`try/catch` & `while`)** | O `while(true)` na `main` envolve o `try/catch`, garantindo repetição até entrada válida. | Cria um mecanismo de repetição persistente até a validação ser bem-sucedida. |

---

## Estrutura do Projeto e Aplicação Prática

O projeto está dividido em pacotes, separando a **definição da exceção**, o **modelo de dados** e a **execução principal**.

### Pacote `br.com.ismael.projetoexcecoes.exception` — *A Regra de Negócio*

#### Classe `CustomException`
- Estende `Exception`, configurando-a como **Exceção Verificada (Checked Exception)**.
- É lançada sempre que uma **regra de validação é violada**.

---

### Pacote `br.com.ismael.projetoexcecoes.model` — *O Modelo de Dados*

#### Classe `Aluno`
- **Encapsulamento Rígido**: utiliza atributos `private` (`nomeAluno`, `notas`).
- **Setters Validados**: todos os métodos `set` chamam validações privadas e propagam (`throws CustomException`) erros.  
  Isso impede que o objeto `Aluno` receba dados inconsistentes.

#### Métodos Internos de Validação e Lógica

| Método | Tipo | Objetivo | Tratamento de Erros |
|--------|------|-----------|---------------------|
| `calcularNotaFinal()` | `private` | Calcula a média ponderada das notas. | Lógica de negócio pura. |
| `validarNota(double valor)` | `private` | Verifica se a nota está no intervalo [0, 10]. | Lança (`throw`) `CustomException` se inválida. |
| `validarTexto(String valor)` | `private` | Verifica se o texto contém apenas letras e espaços. | Lança (`throw`) `CustomException` se vazio, numérico ou especial. |
| `toString()` | `@Override` | Representação formatada do objeto. | Formatação de saída (`%.1f`). |

---

### Pacote `br.com.ismael.projetoexcecoes` — *Execução e Interação*

#### Classe `MainClassAluno`
- **Uso de try-with-resources**  
  O objeto `Scanner` é inicializado dentro do `try` (`Scanner teclado = ...`) para garantir **fechamento automático** do recurso e evitar vazamentos.

- **Tratamento de Erros de Regra e de Digitação**
    - **`CustomException`**: captura erros de regra de negócio lançados pelos setters e exibe mensagem amigável, repetindo o loop `while`.
    - **`InputMismatchException`**: trata erros do `Scanner` quando o tipo de dado é incorreto (ex.: letra em campo numérico), limpando o buffer com `teclado.nextLine()` para evitar loops infinitos.

- **Loop de Persistência**
  A combinação `while(true)` + `break` dentro do `try` garante que o fluxo só prossiga após uma entrada **100% validada**.

---

## Tecnologias Utilizadas

- **Java**
- **Paradigma POO** com foco em **Encapsulamento**
- **Tratamento de Exceções**  
  (Checked Exceptions, `try-with-resources`, `throw`, `throws`, `try/catch`)

---

## Decisões de Design

- **Exceções Checked**  
  A `CustomException` estende `Exception` para demonstrar a **obrigatoriedade do tratamento** e a **clareza da propagação (`throws`)**.

- **Validação em Camadas**  
  Os setters funcionam como uma **fachada de validação**, delegando o trabalho aos métodos privados — centralizando a lógica de verificação.

- **Interação Robusta**  
  A estrutura `while/try/catch` na `main` é o **núcleo do projeto**, mostrando a forma ideal de validar dados em aplicações console.

---

## 📚 Documentação Complementar

Para um estudo mais detalhado sobre **POO e Tratamento de Exceções** aplicados a este projeto, acesse a documentação completa no Notion:  
**[Documentação do Projeto: Tratamento de Exceções em Java (Notion)](https://www.notion.so/Projeto_Exce-es_Cadastro_Aluno_Nota-28bf4d816bcb80ce81bfcd1e8d9c651d?source=copy_link)**
