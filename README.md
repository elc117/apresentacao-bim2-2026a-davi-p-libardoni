# Apresentação sobre Classes em Java

 ## Trabalho proposto:
 Implementar uma classe em Java, com atributos, setters, getters e outros métodos, implementar uma classe de teste que instancie objetos dessa classe e chame métodos por meio deles, além de representar em um diagrama de classes UML.

 ### Classe Sanduíche

```java
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

    [...]

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

    
    // adições e remoções dos ingredientes
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

    [...]
}
```

### Partes importantes:
1. Dois construtores:
`public Sanduiche(String nome, Double preco)` e `public Sanduiche(String nome, ArrayList<String> ingredientes, Double preco, Double peso, boolean vegetariano)`
Por conta de uma propriedade do paradigma orientado a objetos chamada Polimorfismo, a linguagem Java permite a criação de múltiplas funções com o mesmo nome, desde que tenham o mesmo tipo de retorno, mas que se comportam de maneiras diferentes de acordo com o número de parâmetros.

2. Classe `ArrayList<>`:
A classe ArrayList é uma implementação de uma lista de tipo genérico. A notação `<>` indica que os elementos da lista pertencerão ao tipo que for inserido dentro do diamante, como por exemplo `ArrayList<String>`. Essa classe tem métodos implementados como `.remove()`, que é capaz de remover um elemento da lista sem precisar saber seu índice, apenas por seu valor, com um retorno booleano True se o item existia na lista, e False se não havia nenhum item correspondente.
