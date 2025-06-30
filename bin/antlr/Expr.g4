grammar Expr;

@header{
package antlr;
}

//Variáveis iniciais

prog: comando+ EOF ;
	
comando: criarFicha | editarFicha | levelUp;

criarFicha:
	'CRIAR_FICHA' nomePersonagem=IDENTIFICADOR
	declaracoesFicha
	'FIM_FICHA'
;

editarFicha:
	'EDITAR_FICHA' nomePersonagem=IDENTIFICADOR
	declaracoesFicha
	'FIM_EDICAO'
;

declaracoesFicha:(
	declaracaoIdade
    | declaracaoClasse
    | declaracaoRaca
    | declaracaoNivel
    | declaracaoVida
    | blocoAtributos
    | blocoInventario
)+;

// Declarações individuais
declaracaoIdade: 'IDADE' idade=NUM;
declaracaoClasse: 'CLASSE' classe=CLASSE;
declaracaoRaca: 'RACA' raca=RACA;
declaracaoNivel: 'NIVEL' nivel=NUM;
declaracaoVida: 'VIDA' vida=NUM;

blocoAtributos     : 'ATRIBUTOS' declaracaoAtributo+ 'FIM_ATRIBUTOS';
declaracaoAtributo : 
	nomeAtributo=('FORCA' | 'DESTREZA' | 'INTELIGENCIA' | 'CARISMA') 
	valorAtributo=NUM
;

blocoInventario    : 'INVENTARIO' declaracaoItem* 'FIM_INVENTARIO';
declaracaoItem     : quantidade=NUM '-' nomeItem=IDENTIFICADOR;

levelUp: 'LVL_UP' novoNivel=NUM? nomePersonagem=IDENTIFICADOR;


//Tokens (Regras Léxicas)
RACA: 'ANAO'|'ELFO'|'HUMANO';
CLASSE: 'GUERREIRO'|'MAGO'|'LADINO'|'BARDO';
IDENTIFICADOR: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
COMENTARIO_LINHA: '//' ~[\r\n]* -> skip;
COMENTARIO_BLOCO: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
