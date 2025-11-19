# FolhaDePagamento – Gestão de Remuneração

Este projeto foi desenvolvido para demonstrar, de forma prática, o **conceito de Abstração** na Programação Orientada a Objetos (POO) em Java.  
Ele simula um sistema de **folha de pagamento** para cargos da área de tecnologia (CTO, Tech Lead e Developer), onde a lógica de cálculo salarial é **definida de forma abstrata** na classe base e **especializada** em cada subclasse.

---

## O Que é Abstração?

**Abstração** é o pilar da POO que permite definir **um contrato comum** para classes relacionadas, sem se preocupar com os detalhes da implementação.

No projeto, isso é feito através da **classe abstrata** `Funcionario`, que declara o método `calcularSalario()` sem implementação.  
Cada cargo fornece sua **própria versão concreta** deste método, isolando a lógica de cálculo em um único lugar e garantindo consistência no acesso.

---

## Estrutura do Projeto e Papel da Abstração

- **Classe Abstrata `Funcionario`:**
    - Define os atributos comuns (`numeroRegistro`, `nomeFuncionario`, `posicaoFuncionario`, `salarioBase`).
    - Declara o método **abstrato** `calcularSalario()`, que deve ser sobrescrito em todas as subclasses.
    - Atua como um **contrato**, garantindo que todo funcionário terá uma forma de calcular seu salário, independentemente do cargo.

- **Subclasses Concretas:**
    - **ChiefTechnologyOfficer:** Implementa `calcularSalario()` somando salário base, bônus mensal e benefício de carro.
    - **TechLead:** Implementa `calcularSalario()` considerando percentual de performance, PRL e vale-refeição.
    - **Developer:** Implementa `calcularSalario()` somando salário base, bônus de performance, auxílio home-office, PRL e vale-refeição.

---

## Benefícios da Abstração

- **Contrato Claro:** Todas as subclasses são obrigadas a implementar `calcularSalario()`.
- **Flexibilidade:** Novos cargos podem ser adicionados sem alterar a classe principal ou o código cliente.
- **Desacoplamento:** A classe de execução (`MainClassFolhaPagamento`) não precisa conhecer os detalhes de cada cálculo — apenas chama `calcularSalario()`.
- **Manutenção Simplificada:** Caso a assinatura do método mude, todas as subclasses serão automaticamente obrigadas a se adequar.

---

## Relação com Herança e Polimorfismo

Embora o foco seja a **abstração**, este projeto também utiliza:

- **Herança:** as subclasses herdam atributos e comportamento básico de `Funcionario`.
- **Polimorfismo:** o array `Funcionario[]` permite armazenar objetos de diferentes tipos, e o **despacho dinâmico** garante que a versão correta de `calcularSalario()` seja chamada em tempo de execução.

---

## Formatação de Saída

O uso de `String.format()` garante **relatórios alinhados e legíveis**, separando a **responsabilidade de formatação** da **lógica de cálculo**.

- `%10d` → Inteiro alinhado à direita.
- `%-20s` → String alinhada à esquerda.
- `%10.2f` → Valor monetário com duas casas decimais.

---

## Tecnologias Utilizadas

- **Java**
- **IntelliJ IDEA** ou **Eclipse**
- **Git e GitHub** para versionamento de código

---

## Decisões de Design

- **Abstração como pilar principal:** o método `calcularSalario()` é abstrato para forçar a implementação em cada cargo.
- **Uso de Getters e Setters:** garante encapsulamento e boas práticas.
- **Extensibilidade:** respeita o **Princípio Aberto/Fechado (OCP)** — o sistema está aberto para novos cargos, mas fechado para modificações no núcleo.

---

## Documentação Complementar

Para um estudo mais detalhado sobre os conceitos de Abstração e exemplos adicionais, acesse o documento completo no Notion:  
[**Documentação de Abstração no Notion**](https://www.notion.so/Projeto_Abstracao_Folha_De_Pagamento-27cf4d816bcb80b78999dc712873e336?source=copy_link)
