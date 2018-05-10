package View;
import java.util.Scanner;

import Controle.*;
import MODELOS.*;
import ESTRUTURAS.*;


public class Inicio {

	public static void main(String[] args) {
		Secretario secre01 = new Secretario();
		secre01.setSenha(010203);
		
		Secretario secre02 = new Secretario();
		secre01.setSenha(444444);
		
		boolean op = true;
		Scanner sc= new Scanner(System.in);
		int Sc;
		
		while(op) {
			System.out.println(" Sistema de Biblioteca ");
			System.out.println("------------------------");
			System.out.println("     Digite sua opcao: ");
			System.out.println("   [1] Cadastrar: ");
			System.out.println("   [2] Exibir: ");
			System.out.println("   [3] Remover: ");
			System.out.println("   [4] Sair: ");
			System.out.println("------------------------");
			
			Sc = sc.nextInt();
			switch (Sc) {
			case 1:
				Biblioteca cadastro = new Biblioteca();
				Livro livro = new Livro();
				System.out.println("Digite o nome do livro:");
				
				cadastro.castrarDocumentos(livro);
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
			}
			
			
		}
		
		
		
		
		
		

	}

}
