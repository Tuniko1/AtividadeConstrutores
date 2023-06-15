package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	
	public static void main(String[] args) {
		
		Livro lv = new Livro("","",0);
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		do {
			
				System.out.println("Não há livros nesta livraria!\n");	
				System.out.println("Deseja cadastrar um novo livro?");
				opcao = sc.next().charAt(0);
				
				if (Character.toLowerCase(opcao) == 's') {
					
					System.out.println("Entre com o titulo: ");
					lv.setTitulo(sc.nextLine());
					
					
					System.out.println("Entre com a edição: ");
					lv.setEdicao(sc.nextLine());
					
					System.out.println("Entre com o valor: ");
					lv.setValor(sc.nextInt());
					//String telefone = sc.nextLine();
					
				/*System.out.println("Insira um novo livro: \n");
				
				lv.setTitulo(lv.getTitulo());*/
				
				}else {
				System.out.println("Titulo: "+lv.getTitulo()+" Edição: "+lv.getEdicao()+" valor: "+lv.getValor());
				}
				System.out.println("Titulo: "+lv.getTitulo()+" Edição: "+lv.getEdicao()+" valor: "+lv.getValor());
				
				System.out.println("\nDeseja reiniciar?");
				System.out.println("Sim ou Não?");
				opcao = sc.next().charAt(0);
				sc.nextLine();
		}while(Character.toLowerCase(opcao) == 's');
		
	}

}
