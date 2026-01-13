# Serialização e Persistência de Objetos em Arquivos Binários com Java

Este projeto representa um **estudo sobre a persistência de estados de objetos**, utilizando o mecanismo nativo de **Serialização do Java**. 

O objetivo central é demonstrar como transformar objetos em fluxos de bytes para armazenamento em disco e, posteriormente, reconstruí-los integralmente na memória (desserialização), mantendo a integridade e a tipagem dos dados através da interface `Serializable`.

---

## Objetivo Principal do Programa

| Área | Objetivo |
| :--- | :--- |
| **Serialização de Objetos** | Converter instâncias de classes Java em sequências de bytes para persistência física. |
| **Desserialização** | Reconstruir objetos originais a partir de arquivos binários utilizando *Casting*. |
| **Versionamento de Classe** | Compreender o papel do `serialVersionUID` na consistência estrutural dos dados. |
| **Manipulação de Streams** | Utilizar `ObjectOutputStream` e `ObjectInputStream` para gerenciar fluxos de objetos. |

---

## O Fluxo de Serialização vs. Desserialização

A lógica do programa foca na capacidade do Java de "congelar" um objeto em memória e "descongelá-lo" posteriormente, garantindo que o estado interno do objeto permaneça idêntico ao momento da gravação.



| Conceito | Aplicação no Projeto | Foco Didático |
| :--- | :--- | :--- |
| `Serializable` | Interface marcadora que habilita a classe para persistência binária. | Essencial para o funcionamento do `ObjectOutputStream`. |
| `writeObject()` | Grava a coleção inteira no arquivo, realizando o loop interno nos objetos. | Demonstra a eficiência de persistir estruturas de dados complexas. |
| `readObject()` | Recupera os bytes e reconstrói o objeto como tipo `Object`. | Introduz a necessidade de **Casting** para o tipo original. |
| `serialVersionUID` | Identificador de versão da classe `Produto`. | Garante que a classe lida seja compatível com a classe gravada. |

---

## Estrutura do Projeto

O projeto é modular e focado na relação entre a estrutura do objeto e os fluxos de I/O:

### 1. Classe `Produto` — Modelo de Dados
Define a entidade que terá seu estado persistido.

* **Atributos**: `id`, `nome` e `quantidade`.
* **Interface `Serializable`**: Implementação obrigatória para permitir a conversão em bytes.
* **`serialVersionUID`**: Definido como `1L` para garantir consistência entre gravação e leitura.
* **`toString()` (Padrão CSV)**: Utilizado para validar a integridade dos dados após a reconstrução do objeto.

---

### 2. Classe `MainClass` — Orquestração de I/O
Gerencia os processos de escrita e leitura binária utilizando blocos `try/catch`.

| Recurso | Descrição |
| :--- | :--- |
| **Agrupamento de Dados** | Uso de `ArrayList<Produto>` para gerenciar múltiplos registros em memória. |
| **FileOutputStream** | Cria o canal de saída de bytes brutos para o arquivo `.bin`. |
| **ObjectOutputStream** | Transforma a estrutura do objeto Java em dados binários (*Serialização*). |
| **FileInputStream** | Abre o fluxo para leitura dos bytes persistidos no disco. |
| **ObjectInputStream** | Classe responsável pela interpretação dos bytes lidos (*Desserialização*). |

---

## Tecnologias Utilizadas

* **Java**
* **Java I/O API** (`java.io`)
* **Mecanismo de Serialização** (`Serializable`)
* **Coleções Java** (`ArrayList` e `forEach`)

---

## Decisões de Design e Implementação

### Reconstrução via Casting
Como o método `readObject()` retorna um tipo genérico `Object`, o projeto demonstra a importância do **Casting** explícito para `(ArrayList<Produto>)`. Este é um ponto crítico onde a JVM valida se os bytes lidos correspondem à estrutura da classe `Produto`.

### Tratamento de Exceções Específicas
O código implementa uma hierarquia de capturas para garantir robustez:
* **`EOFException`**: Tratada preventivamente para casos de leitura além do fim do arquivo.
* **`IOException`**: Captura falhas de comunicação com o sistema de arquivos ou permissões.
* **`Exception` (Genérica)**: Utilizada para capturar erros de conversão de bytes ou inconsistências de classe.

### Fechamento de Recursos
O fechamento manual dos recursos via `.close()` (ex: `out.close()`, `in.close()`) foi mantido para reforçar o entendimento do ciclo de vida dos *streams* e a importância da liberação de memória e handles do Sistema Operacional.

---

## Conclusão

Este projeto demonstra a capacidade do Java de tratar persistência de forma nativa e eficiente. Ao utilizar arquivos binários, o sistema preserva a estrutura exata dos objetos, permitindo que coleções inteiras sejam recuperadas com poucas linhas de código, servindo como base para sistemas de cache e persistência leve.

---

## Documentação Complementar

Para detalhes técnicos sobre a hierarquia de classes `java.io`, o funcionamento do *Casting* na desserialização e o uso de exceções em I/O, consulte a documentação completa.

**[Documentação do Projeto: Serialização e Arquivos Binários em Java](https://www.notion.so/11_Projeto_Gravacao_Leitura_Arquivos_Binario-2bcf4d816bcb806fbc1afd8dc11008ff?source=copy_link)**