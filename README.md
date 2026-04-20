# 🚀 Leitura de Dados em Java

Projeto simples, criado para treinar **entrada de dados com `Scanner`** e **fluxo de decisão com `if/else`** em Java.

---

## 🧠 Conceitos praticados

* Entrada de dados (`Scanner`)
* Estruturas condicionais (`if`, `else if`, `else`)
* Interação via terminal
* Organização básica de código Java

---

## 📦 Tecnologias

* Java ☕
* Terminal / CLI
* Eclipse

---

## 🎮 Como funciona

Ao rodar o programa, você verá um menu com opções:

```
Biqueira ZS

Opcoes disponiveis:
1 - Prensado
2 - Skunk
3 - Dry
Qual voce deseja?
```

Depois de escolher:

* `1` → retorna mensagem de Prensado
* `2` → retorna mensagem de Skunk
* `3` → retorna mensagem de Dry
* qualquer outro número → **opção inválida**

---

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/java-leitura-dados.git
```

2. Entre na pasta:

```bash
cd java-leitura-dados
```

3. Compile:

```bash
javac LeituraDados.java
```

4. Execute:

```bash
java LeituraDados
```

---

## 🧩 Código principal

```java
package com.java.leituradados;
import java.util.Scanner;

public class LeituraDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Biqueira ZS");

        System.out.println("Opcoes disponiveis:");
        System.out.println("1 - Prensado");
        System.out.println("2 - Skunk");
        System.out.println("3 - Dry");
        System.out.println("Qual voce deseja?");

        int escolhas = sc.nextInt();

        if (escolhas == 1) {
            System.out.println("tu escolheu o prensado, toma! boa brisa.");
        } else if (escolhas == 2) {
            System.out.println("tu escolheu o skunk, toma! boa brisa camarada.");
        } else if (escolhas == 3){
            System.out.println("tu escolheu o dry, toma! boa brisa man");
        } else {
            System.out.println("opcao invalida");
        }
    }
}
```

---

## 🔥 Próximos passos (evolução)

* [ ] Adicionar validação de entrada (evitar erro se digitar texto)
* [ ] Criar menu com loop (`while`)
* [ ] Adicionar preços e cálculo total
* [ ] Separar lógica em métodos

---

## 💭 Sobre

Projeto feito unicamente para estudo e diversao, acredito que quando voce faz algo e essa coisa te faz rir ou te faz sentir algo bom, abre uma janela mental que faz com que vc se lembre das coisas.
A ideia não é profissional, mas é pra mostrar o conceito e a lógica!

Se você tá começando também: **continua. A consistência ganha de tudo.**

---
