# Projeto Orientação a Objetos em Java

Este projeto tem como objetivo demonstrar na prática conceitos de **Programação Orientada a Objetos (POO)** em Java.  
O código implementa um **sistema financeiro simplificado**, onde é possível:

- Criar uma carteira para um cliente, definindo **nome, CPF e saldo**.
- **Exibir os dados da carteira**.
- **Depositar ou sacar saldo**, com validação de valores.
- Manter o controle de dados do objeto de forma segura usando **encapsulamento**.

---

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA**
- **Git e GitHub** para versionamento de código

---

## Conceitos de POO Utilizados no Projeto

### 1. Classe
No código, a classe serve como molde para criar objetos, definindo quais **atributos** e **métodos** eles terão.

### 2. Atributos
Variáveis declaradas dentro da classe para armazenar o estado do objeto.  
Neste projeto, os atributos são **privados** para proteger os dados.

### 3. Construtor
Método especial executado na criação de um objeto, usado para inicializar seus atributos.  
Neste projeto, o construtor recebe parâmetros e atribui valores aos atributos.

### 4. Encapsulamento
Os atributos são privados e não podem ser acessados diretamente de fora da classe.
Eles podem ser acessados ou modificados de forma controlada por meio de getters, setters ou métodos específicos da classe, garantindo segurança e permitindo aplicar regras de negócio.

### 5. Getters e Setters
- **Getter**: retorna o valor de um atributo (uso de `return` para entregar o valor).
- **Setter**: altera o valor de um atributo (uso de `this` para diferenciar parâmetro do atributo da classe).

### 6. Métodos
Funções definidas dentro da classe para manipular dados ou executar ações relacionadas ao objeto.  
São usados para aplicar regras de negócio e manter a integridade dos dados.

---

## Estrutura do Projeto

- SistemaFin.java → Contém o método `main` para execução do programa.
- Carteira.java → Classe que define atributos, construtor, getters, setters e métodos.

---

## Documentação Complementar

Para um estudo mais detalhado sobre os conceitos de POO e exemplos adicionais, acesse o documento completo no Notion:  
[Documentação de POO no Notion](https://www.notion.so/Orientacao_a_objetos_Registro_Saldo_Carteira-24cf4d816bcb806e80e1dc13007a7f4a?source=copy_link)