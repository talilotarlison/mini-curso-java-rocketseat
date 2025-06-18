# Mini Curso Java - Introdução à Programação

Bem-vindo ao Mini Curso de Java da Rocketseat! Este projeto é uma introdução aos fundamentos da programação utilizando a linguagem Java, com foco em tipos primitivos e conceitos básicos.

## Índice

- [Sobre o Curso](#sobre-o-curso)
- [Objetivos](#objetivos)
- [Pré-requisitos](#pré-requisitos)
- [Conteúdo](#conteúdo)
- [Instalação](#instalação)
- [Exemplos de Código](#exemplos-de-código)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre o Curso

Este mini curso tem como objetivo ensinar os conceitos básicos de programação utilizando Java. Você aprenderá sobre tipos primitivos, estruturas de controle, e como criar pequenos programas.

## Objetivos

- Compreender os fundamentos da programação.
- Aprender sobre tipos primitivos em Java.
- Desenvolver habilidades para resolver problemas utilizando lógica de programação.

## Pré-requisitos

- Conhecimento básico de lógica de programação.
- Ambiente de desenvolvimento Java instalado (JDK).

## Conteúdo

1. Introdução ao Java
2. Tipos Primitivos
   - int
   - double
   - char
   - boolean
3. Operadores
4. Estruturas de Controle
   - Condicionais (if, else)
   - Laços de Repetição (for, while)
5. Exercícios Práticos

## Instalação

Para começar a programar em Java, siga os passos abaixo:

1. Baixe e instale o [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Configure a variável de ambiente `JAVA_HOME`.
3. Verifique a instalação executando o comando:

   ```bash
   java -version
   ```

## Exemplos de Código

Aqui estão alguns exemplos de código que você encontrará no curso:

### Exemplo 1: Tipos Primitivos

```java
public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.75;
        char inicial = 'J';
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Estudante: " + estudante);
    }
}
```

### Exemplo 2: Estruturas de Controle

```java
public class EstruturasDeControle {
    public static void main(String[] args) {
        int numero = 10;

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Esperamos que você aproveite este mini curso e aprenda muito sobre programação em Java!
