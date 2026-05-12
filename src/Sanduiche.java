import java.util.ArrayList;

class Sanduiche{
	private String nome;
    private ArrayList<String> ingredientes;
    private Double preco;
    private Double peso;
    private boolean vegetariano = false;
    private boolean paoIntegral = false;
    
    // Construtores:
    
    // construtor parcial, que recebe apenas o nome e preço
    public Sanduiche(String nome, Double preco) {
    	this.nome = nome;
    	this.ingredientes = new ArrayList<String>();
    	this.preco = preco;
    }
    
    // construtor completo
    public Sanduiche(String nome, ArrayList<String> ingredientes, Double preco, Double peso, boolean vegetariano) {
    	this.nome = nome;
    	this.ingredientes = ingredientes;
    	this.preco = preco;
    	this.peso = peso;
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
    public void printSanduiche(double descontoPercent) {
    	String pao = "Pão";
    	if(this.paoIntegral == true) pao += " Integral";
    	
    	System.out.println("=================\n");
    	System.out.println("Nome: "+this.nome);
    	
    	if(descontoPercent > 0) {
    		double precoDescontado = this.preco * (1 - (descontoPercent / 100));
    		System.out.printf("Preço: R$ %.2f (-%.0f%%)\n",precoDescontado,descontoPercent);
    	}else {    		
    		System.out.printf("Preço: R$ %.2f\n",this.preco);
    	}
    	
    	if(this.peso != null) System.out.println("Peso: "+this.peso+"g");
    	System.out.println("\n"+pao);
    	for(String ingrediente : this.ingredientes) {
    		System.out.println(ingrediente);
    	}
    	System.out.println(pao);
    	
    	if(this.vegetariano == true) System.out.println("\n*** Vegetariano ***");

        System.out.println("\n=================\n");
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
    
    public void setPaoIntegral(boolean integ) {
    	this.paoIntegral = true;
    }
}