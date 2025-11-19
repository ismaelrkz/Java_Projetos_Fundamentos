# Módulo ERP – Processamento de Entidades Fiscais

Este projeto foi desenvolvido para demonstrar, de forma prática e didática, o uso dos principais pilares da **Programação Orientada a Objetos (POO)** em Java — **Abstração, Herança, Interfaces e Polimorfismo**.  
Ele simula o núcleo de um **módulo ERP** responsável pelo **processamento polimórfico de entidades fiscais**, especificamente no cálculo de tributos para diferentes tipos de produtos (Nacionais e Internacionais).

O objetivo é evidenciar como esses pilares se unem para construir um código **flexível**, **fácil de manter** e em conformidade com o **Princípio Aberto/Fechado (Open/Closed Principle - OCP)**.

---

## O Que São os Pilares da POO Neste Contexto?

O sistema foi desenvolvido sobre quatro pilares fundamentais, aplicados de forma integrada:

- **Abstração:**  
  Define o contrato comum para todos os produtos, concentrando atributos e comportamentos essenciais.  
  Implementada através da **classe abstrata `Produto`** e da **interface `InterfaceTributos`**, que define o comportamento esperado (`calcularImpostos()`).

- **Herança:**  
  Permite que classes concretas reutilizem atributos e lógicas da classe base.  
  As classes **`ProdutoNacional`** e **`ProdutoInternacional`** herdam de **`Produto`**, evitando duplicação de código e garantindo coesão.

- **Interfaces:**  
  Estabelecem um contrato de comportamento obrigatório.  
  A **`InterfaceTributos`** assegura que todas as classes que a implementam possuam o método `calcularImpostos()`, garantindo padronização no acesso à funcionalidade de tributação.

- **Polimorfismo:**  
  Permite que objetos de diferentes classes concretas sejam tratados de forma uniforme.  
  No `MainERP`, um array do tipo `InterfaceTributos[]` processa produtos de origens distintas, executando a lógica correta de cálculo em tempo de execução.

---

## Estrutura do Projeto e Aplicação Didática

O projeto está dividido em pacotes, cada um com responsabilidades bem definidas, favorecendo **desacoplamento** e **organização modular**.

### Pacote `br.com.erp.model` – Contratos e Tipos

- **Classe Abstrata `Produto`:**
    - Centraliza os atributos comuns a todos os produtos (nome, valor base, origem).
    - Atua como o **contrato de estado**.
    - Base para especialização nas subclasses concretas.
    - Pilares: *Abstração* e *Herança*.

- **Interface `InterfaceTributos`:**
    - Define o contrato de comportamento de cálculo de impostos.
    - Pilares: *Abstração* e *Interface*.

- **Enum `Origem`:**
    - Garante segurança de tipo, permitindo apenas valores `NACIONAL` ou `INTERNACIONAL`.
    - Pilares: *Robustez e Tipagem Segura*.

---

### Pacote `br.com.erp.core` – Implementações Concretas

- **Classe `ProdutoNacional`:**
    - Estende `Produto` e implementa `InterfaceTributos`.
    - Especializa o cálculo de impostos nacionais (**ICMS** e **IPI**).
    - Adiciona o atributo `regiaoFabricacao`.

- **Classe `ProdutoInternacional`:**
    - Estende `Produto` e implementa `InterfaceTributos`.
    - Especializa o cálculo de impostos internacionais (**II de Importação**, **ICMS de Importação**, **IPI**).
    - Adiciona o atributo `paisOrigem`.

**Encapsulamento da Lógica:**  
Os métodos internos de cálculo (ex: `impostosNacionais()`) são privados, reforçando o princípio de **encapsulamento**.  
Apenas o método público `calcularImpostos()` é acessível externamente, garantindo segurança e integridade da lógica fiscal.

---

### Pacote `br.com.erp.app` – Execução e Processamento

- **Classe `MainERP`:**
    - Simula o núcleo do sistema ERP.
    - Demonstra o **polimorfismo por interface**, armazenando objetos de diferentes tipos (`ProdutoNacional` e `ProdutoInternacional`) no mesmo array (`InterfaceTributos[]`).
    - A chamada `p.calcularImpostos()` é resolvida dinamicamente em tempo de execução (*runtime*), executando o comportamento adequado conforme o tipo de produto.

---

## Benefícios do Design e Aplicação do Princípio OCP

Este design segue fielmente o **Princípio Aberto/Fechado (Open/Closed Principle - OCP)**:

- **Aberto para Extensão:**  
  É possível adicionar novas classes de produtos (ex: `ProdutoIsentoDeICMS`) apenas **estendendo `Produto`** e **implementando `InterfaceTributos`**, sem alterar o código existente.

- **Fechado para Modificação:**  
  O código principal (`MainERP`) **não precisa ser modificado**.  
  O processamento continua funcional, pois depende apenas do **contrato `InterfaceTributos`**, e não das classes concretas.

**Resultado:**  
O sistema é altamente **desacoplado**, **modular** e **manutenível**.  
Alterações na lógica tributária de um produto não impactam os demais componentes do sistema.

---

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA**
- **Git e GitHub** para versionamento
- **Paradigma POO** com foco em princípios SOLID

---

## Decisões de Design

- **Pilares Combinados:** O projeto integra *Abstração*, *Herança*, *Interfaces* e *Polimorfismo* em um único fluxo funcional.
- **Uso de Contratos:** A interface `InterfaceTributos` define o comportamento, garantindo consistência entre implementações.
- **Encapsulamento Rígido:** Acesso restrito aos métodos internos de cálculo.
- **Extensibilidade:** O sistema segue o **OCP**, permitindo evoluções sem comprometer o núcleo do ERP.

---

## Documentação Complementar

Para um estudo mais detalhado sobre os conceitos de POO aplicados a este projeto e exemplos adicionais, acesse o documento completo no Notion: [**Documentação de Pilares da POO no Notion**](https://www.notion.so/Projeto_Interfaces_Modulo_ERP-280f4d816bcb80bd900afbc2cce8f065?source=copy_link)
