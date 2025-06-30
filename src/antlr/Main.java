package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
        		CharStream input = CharStreams.fromString("""
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
                    
INVENTARIO
1 - Adaga
50 - Moedas
5 - Pocoes
1 - Alaude
FIM_INVENTARIO
FIM_FICHA
               
""");
            
            System.out.println("=== COMPILADOR DE FICHAS RPG ===\n");
            //1.Análise léxica e sintática
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ParseTree tree = parser.prog();
            
            // 2. Criar e executar o visitor
            FichaInterpretador visitor = new FichaInterpretador();
            visitor.visit(tree);
            
            System.out.println("\n=== EXECUCAO CONCLUIDA COM SUCESSO! ===");
            
            // 3. Geração de código
            SymbolTable symbolTable = visitor.getSymbolTable();
            
            if (symbolTable.obterTodasFichas().isEmpty()) {
            	System.out.println("\n Nenhuma ficha valida encontrada para gerar JSON");
            } else {
            	System.out.println("\n=== GERANDO ARQUIVO JSON ===");
                
                GeradorCodigo jsonGenerator = new GeradorCodigo();
                String outputPath = "fichas_rpg.json";
                
                jsonGenerator.geradorCodigo(symbolTable, outputPath);
                
                System.out.println("JSON gerado com sucesso: " + outputPath);
                
            }
            
        } catch (Exception e) {
            System.err.println("ERRO durante a execução:");
            e.printStackTrace();
        }
    }
}
   
    	
    	