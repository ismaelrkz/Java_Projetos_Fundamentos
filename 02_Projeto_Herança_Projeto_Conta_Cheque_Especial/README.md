# Projeto Herança e Polimorfismo em Java

Este projeto tem como objetivo demonstrar na prática conceitos de **Herança** e **Polimorfismo** em Java.  
O código implementa um sistema bancário simplificado, onde é possível:

- Criar uma conta comum (`Conta`) ou uma conta especial (`ContaEspecial`).
- Realizar operações de crédito e débito.
- Controlar saldo e limite de cheque especial.
- Demonstrar o comportamento de classes relacionadas por herança.

---

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA**
- **Git e GitHub** para versionamento de código

---

## Conceitos de POO Utilizados no Projeto

### 1. Herança
A classe `ContaEspecial` herda atributos e métodos da classe `Conta`.  
Isso evita duplicação de código e permite reutilização, criando uma relação hierárquica entre classes.

### 2. Polimorfismo
Permite que o mesmo método tenha comportamentos diferentes dependendo do objeto que o utiliza.  
Neste projeto, o método `debitar()` é sobrescrito em `ContaEspecial` para incluir a lógica de limite de cheque especial.

### 3. Modificador de Acesso `protected`
Os atributos da classe `Conta` foram definidos como `protected`.  
Isso possibilita que sejam acessados diretamente pela subclasse (`ContaEspecial`), mas não por outras classes externas ao pacote.

### 4. Construtor e `super()`
O construtor da subclasse `ContaEspecial` utiliza `super()` para chamar o construtor da superclasse `Conta`, garantindo a inicialização correta dos atributos herdados antes de definir os atributos específicos da subclasse.

### 5. Sobrescrita de Método (`@Override`)
A anotação `@Override` é utilizada quando a subclasse redefine um método herdado da superclasse.  
No código, o método `debitar()` é sobrescrito em `ContaEspecial` para aplicar regras de cheque especial, demonstrando o uso do polimorfismo.

---

## Estrutura do Projeto

- **Conta.java** → Classe base que define atributos e métodos comuns (`creditar`, `debitar`).
- **ContaEspecial.java** → Subclasse que herda de `Conta`, adiciona o atributo `limite` e sobrescreve o método `debitar()`.
- **Banco.java** → Classe principal que contém o método `main`, responsável por criar e manipular os objetos `Conta` e `ContaEspecial`.

---

## Documentação Complementar

Para um estudo mais detalhado sobre os conceitos de Herança e exemplos adicionais, acesse o documento completo no Notion:  
[Documentação sobre HERANÇA no Notion](https://www.notion.so/Heran-a_Projeto_Conta_Cheque_Especial-26bf4d816bcb80538a35ca0cba13ba7b?source=copy_link)
