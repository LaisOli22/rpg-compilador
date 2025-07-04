# Compilador de Fichas RPG
Um compilador desenvolvido com ANTLR4 para criar e gerenciar fichas de personagens de RPG, convertendo uma linguagem específica de domínio (DSL) em formato JSON.

## Equipe

Laís Oliveira  
Victor de Carvalho  
Peri Macedo    
Bernardo Braga

## Motivação
O mundo dos RPGs é rico em criatividade e storytelling, mas frequentemente sofre com a complexidade de gerenciar fichas de personagens. Jogadores e mestres precisam constantemente criar, editar e acompanhar a evolução de personagens com diversos atributos, inventários e características.
Este projeto nasceu da necessidade de simplificar e automatizar o processo de criação e gerenciamento de fichas de RPG através de uma linguagem intuitiva e natural, permitindo que jogadores foquem no que realmente importa: a aventura!

## O que você pode fazer?

### 🎭 Criar Fichas de Personagem
Crie fichas completas com todas as informações do seu personagem:
- **Informações básicas**: nome, idade, classe, raça, nível e pontos de vida
- **Atributos**: força, destreza, inteligência e carisma
- **Inventário**: itens com quantidades

### ✏️ Editar Fichas Existentes
Modifique qualquer aspecto de uma ficha já criada, desde atributos até inventário.

### 📈 Level Up
Faça seus personagens evoluírem com o comando de level up, opcionalmente especificando o novo nível.

## Classes e Raças Disponíveis

**Classes:** Guerreiro, Mago, Ladino, Bardo  
**Raças:** Anão, Elfo, Humano 

# Como usar?

## Estrutura Básica:

    CRIAR_FICHA [nome]
        IDADE [número]
        CLASSE [classe]
        RACA [raça]
        NIVEL [número]
        VIDA [número]
        
        ATRIBUTOS
            [atributo] [valor]
            ...
        FIM_ATRIBUTOS
        
        INVENTARIO
            [quantidade] - [item]
            ...
        FIM_INVENTARIO
    FIM_FICHA

## Exemplos de Programas

### Criando uma ficha
#### Crie um arquivo .txt como abaixo e envie como parâmetro na hora de executar o Main 

```
CRIAR_FICHA Lou
    IDADE 201
    CLASSE MAGO
    RACA HUMANO
    NIVEL 10
    VIDA 85
    
    ATRIBUTOS
        FORCA 12
        DESTREZA 14
        INTELIGENCIA 20
        CARISMA 18
    FIM_ATRIBUTOS
    
    INVENTARIO
        1 - cajado
        5 - pocao
    FIM_INVENTARIO
FIM_FICHA
``` 

### Exemplo 2: Mago Élfico com Level Up 
```
CRIAR_FICHA Legolas
    IDADE 7
    CLASSE MAGO
    RACA ELFO
    NIVEL 10
    VIDA 85
    
    ATRIBUTOS
        FORCA 12
        DESTREZA 7
        INTELIGENCIA 2
        CARISMA 8
    FIM_ATRIBUTOS
FIM_FICHA
```  

### Evoluindo o personagem  
```
LEVEL_UP 8 Legolas 
```
ou simplesmente:
  ```
  LVL_UP Legolas
  ```

### Exemplo 3: Edição de Ficha Existente
```
EDITAR_FICHA Legolas
    VIDA 90
    INVENTARIO
        1 - Cajado  
        5 - Pergaminhos 
        3 - pocao
        1 - anel_poder
    FIM_INVENTARIO
FIM_EDICAO
```


# Como Executar o Compilador
Pré-requisitos

Java 11+
ANTLR4 (incluído nas dependências)

1. Clone o Repositório
bashgit clone https://github.com/LaisOli22/rpg-compilador.git  
cd rpg-compilador

2. Compile os arquivos Java

3. Execute o arquivo Main.java


# Usando o Codespaces

## 1. Gerar os arquivos do ANTLR
No terminal do Codespaces, execute:  
```
bash -c "java -jar lib/antlr-4.13.2-complete.jar -visitor -no-listener src/antlr/Expr.g4"
```
## 2. Compilar arquivos java
No terminal do Codespaces, execute: 
``` 
javac -cp "lib/antlr-runtime-4.13.2.jar:lib/gson-2.6.2.jar" -d bin src/antlr/*.java
```
## 3. Executar arquivo Main
Executar programa principal: 
*É necessário passar o arquivo .txt contendo os comandos como parâmetro de execução, substitua o "fichaExemplo.txt" pelo seu arquivo criado*

``` 
java -cp "bin:lib/antlr-runtime-4.13.2.jar:lib/gson-2.6.2.jar" antlr.Main fichaExemplo.txt
```

# Usando tasks do VSCode

Pressione Ctrl+Shift+P (ou Cmd+Shift+P no Mac)  
Digite Tasks: Run Task    
Escolha uma das tarefas disponíveis:  

"Gerar ANTLR" - para gerar os arquivos ANTLR  
"Compilar projeto" - para compilar o projeto  
"Executar Main" - para executar o programa principal  

# Ou manualmente
Compilar gramática  

    java -jar lib/antlr-4.13.2-complete.jar -visitor -no-listener -package antlr src/antlr/Expr.g4 -o src/antlr  

Compilar arquivos java  

    javac -cp "lib\antlr-runtime-4.13.2.jar;lib\gson-2.6.2.jar" -d bin src\antlr\*.java  

executar Main  
*É necessário passar o arquivo .txt contendo os comandos como parâmetro de execução, substitua o "fichaExemplo.txt" pelo seu arquivo criado*

    java -cp "bin;lib\antlr-runtime-4.13.2.jar;lib\gson-2.6.2.jar" antlr.Main fichaExemplo.txt

# Resultado
O compilador gerará um arquivo fichas_rpg.json contendo todas as fichas processadas.  

## Saída do Compilador  
O compilador gera um arquivo JSON estruturado:    
json{  
  "fichas": {  
    "Thor": {  
      "nome": "Thor",  
      "idade": 50,  
      "classe": "GUERREIRO",  
      "raca": "ANAO",   
      "nivel": 8,  
      "vida": 120,  
      "atributos": {  
        "forca": 18,  
        "destreza": 12,    
        "inteligencia": 10,  
        "carisma": 8  
      },
      "inventario": {  
        "Escudo": 1  
      }
    }
  },
  "total": 1,  
  "gerado_em": "2025-06-25T14:30:00"
}
