# Gravação e Leitura de Dados em Arquivos de Texto com Java

Este projeto representa um **estudo prático sobre persistência de dados em sistema de arquivos**, utilizando as bibliotecas fundamentais da API `java.io`.

O objetivo central é demonstrar o ciclo completo de vida do dado: desde a **instanciação de objetos em memória**, passando pela **serialização em formato textual (CSV)**, até a **escrita física e leitura posterior** para validação da persistência.

---

## Objetivo Principal do Programa

| Área | Objetivo |
| :--- | :--- |
| **Persistência de Dados** | Demonstrar como gravar objetos de forma permanente em arquivos `.txt`. |
| **Manipulação de Streams** | Entender o papel decorativo de classes como `FileWriter`, `PrintWriter` e `BufferedReader`. |
| **Formatação de Dados** | Implementar um padrão de separação por delimitadores (estilo CSV) para interoperabilidade. |
| **Gestão de Recursos** | Praticar o controle manual de abertura e fechamento de fluxos de entrada e saída (I/O). |

---

## Fluxo de Operação de I/O

A lógica do programa foi estruturada para separar a representação do objeto da sua forma de armazenamento, garantindo que os dados possam ser lidos por outros sistemas.

| Classe de I/O | Função no Projeto | Papel Técnico |
| :--- | :--- | :--- |
| `File` | Representa o caminho do arquivo no sistema. | Abstração do arquivo físico. |
| `FileWriter` | Abre o canal de escrita e gerencia o modo *append*. | Stream de baixo nível (caracteres). |
| `PrintWriter` | Oferece métodos formatados como `println`. | Stream de alto nível (conveniência). |
| `FileReader` | Abre o canal de leitura de caracteres. | Ponte de leitura inicial. |
| `BufferedReader` | Cria um buffer de memória para leitura eficiente. | Otimização e leitura linha a linha. |



---

## Estrutura do Projeto

O projeto é dividido em dois componentes principais que separam o modelo da lógica de execução:

### 1. Classe `Cliente` — Modelo de Domínio
Define os atributos essenciais para representar o cliente.

* **Atributos**: `id`, `nome`, `cidade` e `telefone`.
* **Encapsulamento**: Uso de *Getters* e *Setters* seguindo o padrão JavaBeans.
* **Método `toFileString()`**: Define a "assinatura" de gravação do objeto (ex: `1;Ana;São Paulo;...`). Esta decisão separa a lógica de exibição (`toString`) da lógica de armazenamento.

---

### 2. Classe `MainClass` — Execução e Demonstração
Responsável por gerenciar o ciclo de vida dos dados e a interação com o sistema de arquivos.

| Recurso | Descrição |
| :--- | :--- |
| **Coleção Intermediária** | Usa `ArrayList<Cliente>` para agrupar dados antes da gravação em lote. |
| **Bloco de Escrita** | Itera sobre a lista e persiste cada cliente em uma nova linha do arquivo. |
| **Modo Append** | Configurado para adicionar novos dados sem apagar o histórico existente. |
| **Bloco de Leitura** | Recupera os dados linha a linha e os exibe no console para auditoria. |

---

## Tecnologias Utilizadas

* **Java SE** (Standard Edition)
* **Java I/O API** (`java.io`)
* **Coleções Java** (`ArrayList`)
* **Expressões Lambda** (para iteração de listas com `forEach`)

---

## Decisões de Design

### Formato CSV (Delimitador `;`)
Optou-se pelo ponto e vírgula para evitar conflitos com vírgulas naturais em nomes de cidades ou endereços, garantindo que o arquivo seja facilmente importado em planilhas ou bancos de dados.

### Tratamento de Exceções (`try/catch`)
Operações de I/O são consideradas "perigosas" pelo Java (*checked exceptions*). O uso de blocos `try/catch` garante que o programa trate falhas de permissão ou ausência de arquivo de forma controlada.

### Fechamento Manual de Recursos
O fechamento via `.close()` foi mantido explicitamente para fins didáticos, reforçando a compreensão do ciclo de vida dos *streams* e a necessidade de liberar recursos do Sistema Operacional.

---

## Conclusão

Este projeto solidifica os conceitos de **entrada e saída de dados**, provando que a persistência não exige necessariamente sistemas complexos para tarefas fundamentais. A estrutura modular adotada facilita a evolução para cenários de *parsing* e validação de dados avançada.

---

## Documentação Complementar

Para detalhes técnicos completos sobre a implementação das classes, a hierarquia da API `java.io` utilizada e justificativas detalhadas de cada método, consulte a documentação interna do projeto.

**[Documentação do Projeto: Gravação e Leitura de Arquivos em Java](https://www.notion.so/10_Projeto_Gravacao_Leitura_Arquivos_Texto-2b7f4d816bcb80388f89c6d16f71e17d?source=copy_link)**