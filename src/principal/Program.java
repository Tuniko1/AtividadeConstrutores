package principal;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import entities.Livro;



public class Program {

	
	public static void main(String[] args) {
		
		
		Livro livro;
		Scanner sc = new Scanner(System.in);
		char opcao;
		List<Livro> livros = new ArrayList<>();
		do {
			
				System.out.println("Não há livros nesta livraria!\n");	
				do {
					livro = new Livro("","",0);
				
				System.out.println("Deseja cadastrar um novo livro?");
				opcao = sc.next().charAt(0);
				
				if (Character.toLowerCase(opcao) == 's') {
					
					
					if (livro.getValor() < 0) {
						
						System.out.println("\n* É Obrigatório a inserção do valor do Livro!");
						livro.setValor(sc.nextInt());
			    	}  else {
			    				    		
					
						System.out.println("Entre com o valor: ");
						livro.setValor(sc.nextInt());

			    		}
					sc.nextLine();
					if (livro.getTitulo().isEmpty()) {
						System.out.println("\n* É Obrigatório a inserção do Título!");
						System.out.println("* Entre com um titulo:");
						livro.setTitulo(sc.nextLine());
						
					}else {
						System.out.println("* Entre com um titulo: ");
						livro.setTitulo(sc.nextLine());
					
					}
					
					if (livro.getEdicao().isEmpty()) {
						
						System.out.println("\n* É Obrigatório a inserção da Edição!");
						System.out.println("Entre com a edição: ");
						livro.setEdicao(sc.nextLine());					
						
					}else {
						
						System.out.println("Entre com a edição: ");
						livro.setEdicao(sc.nextLine());
					}
					
					
				
					livros.add(livro);
				}else {
					System.out.println("Pessoas Cadastradas:  1");
					for(Livro l : livros) {
						System.out.println(l+"\n");
				}}
				
				System.out.println("--- People Cadastrados: --");
				for(Livro l : livros) {
					
					System.out.println(l+"\n");
				}
			
				livros.add(livro);
				System.out.println("Deseja cadastrar mais uma pessoa?");
				System.out.println("Sim ou Não?");
				opcao = sc.next().charAt(0);
				sc.nextLine();
				}while(Character.toLowerCase(opcao) == 's');{
					System.exit(0);
				
				}
					
				
				System.out.println("\nDeseja reiniciar?");
				System.out.println("Sim ou Não?");
				opcao = sc.next().charAt(0);
				sc.nextLine();
				
				
		}while(Character.toLowerCase(opcao) == 's');
		sc.close();
	}

}
