package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//imports referentes ao scanner de arquivo
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        try {
            
            File arquivo = new File(args[0]);
            Scanner scan = new Scanner(arquivo);
            Vector<String> txtVector = new Vector<String>();
            while(scan.hasNextLine()){
                txtVector.add(scan.nextLine()); 
            }
            String txtString = String.join("\n", txtVector);        	
            CharStream input = CharStreams.fromString(txtString);
            
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
   
    	
    	
