package antlr;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Map<String, Object>> fichas;
    
    public SymbolTable() {
        this.fichas = new HashMap<>();
    }
    
    public void adicionarFicha(String nome, Map<String, Object> dadosFicha) {
        // Criar uma cópia para evitar modificações acidentais
        Map<String, Object> ficha = new HashMap<>(dadosFicha);
        fichas.put(nome, ficha);
        System.out.println("Ficha " + nome + " adicionada à tabela de símbolos");
    }
    
    public Map<String, Map<String, Object>> obterTodasFichas() {
        return new HashMap<>(fichas);
    }
    
    public Map<String, Object> obterFicha(String nome) {
        return fichas.get(nome);
    }
    
    public boolean existeFicha(String nome) {
        return fichas.containsKey(nome);
    }
}
