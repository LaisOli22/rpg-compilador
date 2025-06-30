package antlr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorCodigo {

	public void geradorCodigo(SymbolTable symbolTable, String outputPath) {
        try {
           
            Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
            
            // Obter todas as fichas
            Map<String, Map<String, Object>> fichas = symbolTable.obterTodasFichas();
            
            if (fichas.isEmpty()) {
                System.out.println("Nenhuma ficha encontrada para gerar JSON");
                return;
            }
   
            System.out.println("Fichas encontradas: " + fichas.keySet());
            
            // Criar estrutura final do JSON
            Map<String, Object> jsonOutput = new HashMap<>();
            jsonOutput.put("fichas", fichas);
            jsonOutput.put("total", fichas.size());
            jsonOutput.put("gerado_em", java.time.LocalDateTime.now().toString());
            
            // Converter para JSON
            String json = gson.toJson(jsonOutput);
            
            // Escrever no arquivo
            try (FileWriter writer = new FileWriter(outputPath)) {
                writer.write(json);
                System.out.println("JSON gerado com sucesso!");
                System.out.println("Arquivo: " + outputPath);
                System.out.println("\nConteúdo gerado:");
                System.out.println(json);
            }
            
        } catch (IOException e) {
            System.err.println("ERRO ao escrever arquivo JSON: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("ERRO na geração do JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}