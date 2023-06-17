package entities;



public class Livro {
	
	private String titulo;
	private String edicao;
	private double valor ;
	
	
	public Livro (String titulo, String edicao, int valor){
		this.titulo = titulo;
		this.edicao = edicao;
		this.valor = valor;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		 
		
		this.titulo = titulo;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		
		
		this.edicao = edicao;
	}
	
	public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
 
		if (valor > 100) {
			double taxa = 30/100; 
    		valor += (valor * (30/100));
    		System.out.println("Foi aplicada uma taxa de "+taxa+" valor: R$"+valor);
    	}	
    	this.valor = valor;

    }
	public String toString() {
		return "Titulo: "+getTitulo()
				+"\nEdicao: "+getEdicao()
				+"\nValor" +getValor();
	}
		
		
	
}
