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

# Descrição da Linguagem

Regras Léxicas  
RACA: 'ANAO' | 'ELFO' | 'HUMANO';  
ATRIBUTOS: 'FORCA' | 'DESTREZA' | 'INTELIGENCIA' | 'CARISMA';  
CLASSE: 'GUERREIRO' | 'MAGO' | 'LADINO' | 'BARDO';  

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

# Como Executar o Compilador
Pré-requisitos

Java 11+
ANTLR4 (incluído nas dependências)

1. Clone o Repositório
bashgit clone https://github.com/LaisOli22/rpg-compilador.git  
cd rpg-compilador
2. Instale as Dependências

3. Gere os Arquivos ANTLR


## Usando tasks do VSCode

Pressione Ctrl+Shift+P (ou Cmd+Shift+P no Mac)  
Digite Tasks: Run Task    
Escolha uma das tarefas disponíveis:  

"Gerar ANTLR" - para gerar os arquivos ANTLR  
"Compilar projeto" - para compilar o projeto  
"Executar Main" - para executar o programa principal  

## Ou manualmente
Compilar gramática  

    java -jar lib/antlr-4.13.2-complete.jar -visitor -no-listener -package antlr src/antlr/Expr.g4 -o src/antlr  

Compilar arquivos java  

    javac -cp "lib\antlr-runtime-4.13.2.jar;lib\gson-2.6.2.jar" -d bin src\antlr\*.java  

executar Main  
 
    java -cp "bin;lib\antlr-runtime-4.13.2.jar;lib\gson-2.6.2.jar" antlr.Main  

# Resultado
O compilador gerará um arquivo fichas_rpg.json contendo todas as fichas processadas.  
## Exemplos de Programas
### //Altere a ficha pela classe Main.java  
### Exemplo 1: Ficha Básica de Guerreiro  
CRIAR_FICHA Thor  
IDADE 150  
CLASSE GUERREIRO    
RACA ANAO  
NIVEL 8  
VIDA 120  

ATRIBUTOS  
FORCA 18  
DESTREZA 12   
INTELIGENCIA 10  
CARISMA 8  
FIM_ATRIBUTOS  

INVENTARIO
1 - Escudo  
FIM_INVENTARIO  
FIM_FICHA  

### Exemplo 2: Mago Élfico com Level Up  
CRIAR_FICHA Legolas  
IDADE 75  
CLASSE MAGO  
RACA ELFO  
NIVEL 1  
VIDA 80  

ATRIBUTOS  
FORCA 8  
DESTREZA 16  
INTELIGENCIA 20  
CARISMA 14  
FIM_ATRIBUTOS  

INVENTARIO  
1 - Cajado  
5 - Pergaminhos  
FIM_INVENTARIO  
FIM_FICHA

// Evoluindo o personagem  
LEVEL_UP Legolas 4 

### Exemplo 3: Edição de Ficha Existente
CRIAR_FICHA Lou
IDADE 87
CLASSE BARDO
RACA HUMANO
NIVEL 5
VIDA 85
ATRIBUTOS
FORCA 18
DESTREZA 14
INTELIGENCIA 16
CARISMA 15
FIM_ATRIBUTOS
FIM_FICHA 

// Editando a ficha posteriormente
EDITAR_FICHA Lou 
NIVEL 7  
VIDA 100  

INVENTARIO  
3 - Pocoes_de_Cura   
FIM_INVENTARIO  
FIM_EDICAO   




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