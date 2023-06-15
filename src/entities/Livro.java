package entities;

import java.util.Scanner;

public class Livro {
	
	private String titulo;
	private String edicao;
	private int valor;
	Scanner sc = new Scanner(System.in);
	
	public Livro (String titulo, String edicao, int valor){
		this.titulo = titulo;
		this.edicao = edicao;
		this.valor = valor;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo.isEmpty()) {
			System.out.println("* É Obrigatório a inserção do título!\n");
			setTitulo(titulo);
		}
		this.titulo = titulo;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		System.out.println("Insira a edição: " );
		edicao = sc.nextLine();
		if (edicao.isEmpty()) {
			System.out.println("* É Obrigatório a inserção da edição!\n");
			setEdicao(edicao);
		}
		this.edicao = edicao;
	}
	
	public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
    	System.out.println("Insira o valor: " );
		valor = sc.nextInt();
    	
		if (valor > 100) {
    		valor += (valor * (30/100));
    	}else if (valor < 0) {
			System.out.println("* É Obrigatório a inserção do título!\n");
			setValor(valor);
    	}   	
    	this.valor = valor;

    }
}
