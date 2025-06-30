package antlr;

import java.util.HashMap;
import java.util.Map;

public class FichaInterpretador extends ExprBaseVisitor<Object> {
	// Mapa para armazenar todas as fichas criadas
	private SymbolTable symbolTable;
    private String fichaAtual;
    private Map<String, Object> fichaData;
    
    public FichaInterpretador() {
        this.symbolTable = new SymbolTable();
    }
    
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    
    // Visita a arvore sintatica
    @Override
    public Object visitProg(ExprParser.ProgContext ctx) {
        for (ExprParser.ComandoContext comando : ctx.comando()) {
            visit(comando);
        }
        
        return null;
    }
  
    @Override
    public Object visitComando(ExprParser.ComandoContext ctx) {
        return visitChildren(ctx);
    }
    
    @Override
    public Object visitCriarFicha(ExprParser.CriarFichaContext ctx) {
    	fichaAtual = ctx.IDENTIFICADOR().getText();
        fichaData = new HashMap<>();
        fichaData.put("nome", fichaAtual);
        
        System.out.println("Criando ficha para: " + fichaAtual);
        
        visit(ctx.declaracoesFicha());
        
        symbolTable.adicionarFicha(fichaAtual, fichaData);
        
        fichaAtual = null;
        fichaData = null;
        return null;
    }
   
    @Override
    public Object visitEditarFicha(ExprParser.EditarFichaContext ctx) {
        String nomeFicha = ctx.IDENTIFICADOR().getText();
        
        // Verificar se a ficha existe
        if (!symbolTable.existeFicha(nomeFicha)) {
            System.out.println("ERRO: Ficha '" + nomeFicha + "' não encontrada!");
            return null;
        }
        
        // Recuperar dados existentes
        fichaAtual = nomeFicha;
        fichaData = new HashMap<>(symbolTable.obterFicha(nomeFicha));
        
        System.out.println("Editando ficha: " + nomeFicha);
        
        // Processa as alterações
        visit(ctx.declaracoesFicha());
        symbolTable.adicionarFicha(fichaAtual, fichaData);
        System.out.println("Ficha " + fichaAtual + " atualizada!");
        
        System.out.println(fichaData);
        
        fichaAtual = null;
        fichaData = null;
        return null;
    }

    @Override
    public Object visitDeclaracoesFicha(ExprParser.DeclaracoesFichaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaracaoIdade(ExprParser.DeclaracaoIdadeContext ctx) {
        int idade = Integer.parseInt(ctx.NUM().getText());
        fichaData.put("idade", idade);
        System.out.println("Idade definida: " + idade);
        return null;
    }

    @Override
    public Object visitDeclaracaoClasse(ExprParser.DeclaracaoClasseContext ctx) {
        String classe = ctx.CLASSE().getText();
        fichaData.put("classe",classe);
        System.out.println("Classe definida: " + classe);
        return null;
    }

    @Override
    public Object visitDeclaracaoRaca(ExprParser.DeclaracaoRacaContext ctx) {
        String raca = ctx.RACA().getText();
        fichaData.put("raca",raca);
        System.out.println("Raça definida: " + raca);
        return null;
    }
    

    @Override
    public Object visitDeclaracaoNivel(ExprParser.DeclaracaoNivelContext ctx) {
        int nivel = Integer.parseInt(ctx.NUM().getText());
        fichaData.put("nivel",nivel);
        System.out.println("Nível definido: " + nivel);
        return null;
    }

    @Override
    public Object visitDeclaracaoVida(ExprParser.DeclaracaoVidaContext ctx) {
        int vida = Integer.parseInt(ctx.NUM().getText());
        fichaData.put("vida",vida);
        System.out.println("Vida definida: " + vida);
        return null;
    }
    
    @Override
    public Object visitBlocoAtributos(ExprParser.BlocoAtributosContext ctx) {
    	Map<String, Integer> atributos = new HashMap<>();
        
        for (ExprParser.DeclaracaoAtributoContext atributo : ctx.declaracaoAtributo()) {
            String nomeAtributo = atributo.nomeAtributo.getText();
            int valorAtributo = Integer.parseInt(atributo.valorAtributo.getText());
            
            atributos.put(nomeAtributo.toLowerCase(), valorAtributo);
            System.out.println("Atributo " + nomeAtributo + ": " + valorAtributo);
        }
        
        fichaData.put("atributos", atributos);
        return null;
    }

    @Override
    public Object visitDeclaracaoAtributo(ExprParser.DeclaracaoAtributoContext ctx) {
        
        return null;
    }
    
    @Override
    public Object visitBlocoInventario(ExprParser.BlocoInventarioContext ctx) {
    	Map<String, Integer> inventario = new HashMap<>();
        
        for (ExprParser.DeclaracaoItemContext item : ctx.declaracaoItem()) {
            int quantidade = Integer.parseInt(item.NUM().getText());
            String nomeItem = item.IDENTIFICADOR().getText();
            
            inventario.put(nomeItem, quantidade);
            System.out.println("Item: " + quantidade + " " + nomeItem);
        }
        
        fichaData.put("inventario", inventario);
        
        return null;
    }
 
    @Override
    public Object visitDeclaracaoItem(ExprParser.DeclaracaoItemContext ctx) {
        
        return null;
    }
    
    @Override
    public Object visitLevelUp(ExprParser.LevelUpContext ctx) {
        String nomeFicha = ctx.IDENTIFICADOR().getText();
        
        if (!symbolTable.existeFicha(nomeFicha)) {
            System.out.println("ERRO: Ficha '" + nomeFicha + "' não encontrada!");
            return null;
        }
        Map<String, Object> ficha = symbolTable.obterFicha(nomeFicha);
        int nivelAtual = (Integer) ficha.get("nivel");
        int vidaAtual = (Integer) ficha.get("vida");
        int novoNivel;
        
        if (ctx.NUM() != null) {
            // Nível específico foi fornecido
            novoNivel = Integer.parseInt(ctx.NUM().getText());
        } else {
            // Incrementa o nível atual
            novoNivel = nivelAtual + 1;
        }
        
        // Aumenta a vida proporcionalmente (+10 HP por nível)
        int vidaAdicional = (novoNivel - nivelAtual) * 10;
        int novaVida = vidaAtual + vidaAdicional;
  
        ficha.put("nivel", novoNivel);
        ficha.put("vida", novaVida);
        symbolTable.adicionarFicha(nomeFicha, ficha);
        
        System.out.println("=== LEVEL UP! ===");
        System.out.println("Personagem: " + nomeFicha);
        System.out.println("Nível: " + nivelAtual + " → " + novoNivel);
        System.out.println("Vida aumentou em: " + vidaAdicional + " pontos");
        System.out.println("Nova vida total: " + novaVida);
        System.out.println();
        
        return null;
       
    }
    
}