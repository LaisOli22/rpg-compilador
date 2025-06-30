package antlr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FichaPersonagem {
	private String nome;
	private int idade;
	private int vida;
	private int nivel;
	private String raca;
	private String classe;
	private Map<String, Integer> atributos = new HashMap<>();
	private List<Item> inventario = new ArrayList<>();
	
	public FichaPersonagem(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade){
		
		this.idade = idade;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida){
		
		this.vida = vida;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel){
		
		this.nivel = nivel;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca){
		
		this.raca = raca;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe){
		
		this.classe = classe;
	}

	public List<Item> getInventario() {
		return inventario;
	}

	public void adicionarInventario(Item item) {
		inventario.add(item);
	}

	public Map<String, Integer> getAtributos() {
		return atributos;
	}

	public void adicionarAtributos(String nome, int valor){
		 
		atributos.put(nome,valor);
	}
	
}
