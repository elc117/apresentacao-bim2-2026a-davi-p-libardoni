import java.util.ArrayList;

class Sanduiche{
    private ArrayList<String> ingredientes;
    private Double preco;
    private Double peso;
    private boolean vegetariano = false;
    
    
    // Construtores:
    
    // construtor parcial, que recebe apenas o preço
    public Sanduiche(Double preco) {
    	this.ingredientes = new ArrayList<String>();
    	this.preco = preco;
    }
    
    // construtor completo
    public Sanduiche(ArrayList<String> ingredientes, Double preco, Double peso, boolean vegetariano) {
    	this.ingredientes = ingredientes;
    	this.vegetariano = vegetariano;
    }
    
    
    // getters, métodos que retornam as propriedades privadas
    public ArrayList<String> getIngredientes() {
    	return this.ingredientes;
    }
    
    public Double getPreco() {
    	return this.preco;
    }
    
    public Double getPeso() {
    	return this.peso;
    }
    
    public boolean isVegetariano() {
    	return this.vegetariano;
    }
    
    
    
    // impressão do sanduiche
    public void printSanduiche() {
    	System.out.println("Pão");
    	for(String ingrediente : this.ingredientes) {
    		System.out.println(ingrediente);
    	}
    	System.out.println("Pão");
    }
    
    
    
    // adições e remoções dos ingredientes (diferente dos setters normais pois ingredientes é um ArrayList)
    public void addIngrediente(String ingrediente) {
    	this.ingredientes.add(ingrediente);
    }
    
    public boolean removeIngrediente(String ingrediente) {
    	return this.ingredientes.remove(ingrediente);
    }
    
    
 
    // setters, funções que definem os atributos privados
    public void setPreco(Double preco) {
    	this.preco = preco;
    }
    
    public void setPeso(Double peso) {
    	this.peso = peso;
    }
    
    public void setVegetariano(boolean veg) {
    	this.vegetariano = veg;
    }
}