import java.util.Scanner;

public class projetoserasa {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int acao; 
		int opcao; 
		int plano = 0;
		int confirmacao = 0;
		String decisao;
		
		System.out.println("Ol�, seja bem vindo ao CrediF�cil!");
		System.out.println("O novo sistema de cr�dito pessoal para ajudar voc� de maneira pr�tica e segura.");
		System.out.println("");
		try{Thread. sleep(1000);}catch(Exception erro){}
		do {
			System.out.println("____________________________");
			System.out.println("O que voc� deseja fazer?");
			System.out.println("1 - Solicitar novo cr�dito");
			System.out.println("0 - Finalizar servi�o");
			System.out.println("____________________________");
			System.out.print(">> "); 
			acao = ler.nextInt();
			
			if(acao == 1) {
				
				do {
					System.out.println("Antes precisamos que informe sua renda mensal");
					System.out.println("Sua renda mensal � equivalente �:");
					System.out.println("");
					System.out.println("1 - 1 sal�rio m�nimo");
					System.out.println("2 - Entre 1 e 3 sal�rios m�nimos");
					System.out.println("3 - Mais que 3 sal�rios m�nimos");
					System.out.println("0 - Voltar");
					System.out.print(">>: ");
					opcao = ler.nextInt();	
					
					
					if(opcao == 1) {
						
						System.out.println("");
						System.out.println("Para a renda informada temos as seguintes op��es de cr�dito:");
						System.out.println("1 - Plano F�cil");
						System.out.println("2 - Plano M�dio");
						System.out.println("3 -	Plano Master");
						System.out.println("0 - Voltar");
						System.out.print(">>: ");
						plano = ler.nextInt();
						
						switch(plano) {
							case 1:
								System.out.println("Voc� selecionou - Plano F�cil");
								System.out.println("R$2.500,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 2:
								System.out.println("Voc� selecionou - Plano M�dio");
								System.out.println("R$6.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 3:
								System.out.println("Voc� selecionou - Plano Master");
								System.out.println("R$10.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							
							default:
							break;		
							}
						}
					else if(opcao == 2) {
							System.out.println("");
							System.out.println("Para a renda informada temos as seguintes op��es de cr�dito:");
							System.out.println("1 - Plano F�cil");
							System.out.println("2 - Plano M�dio");
							System.out.println("3 -	Plano Master");
							System.out.println("0 - Voltar");
							System.out.print(">>: ");
							plano = ler.nextInt();
							
						
							switch(plano) {
							case 1:
								System.out.println("Voc� selecionou - Plano F�cil");
								System.out.println("R$15.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 2:
								System.out.println("Voc� selecionou - Plano M�dio");
								System.out.println("R$20.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 3:
								System.out.println("Voc� selecionou - Plano Master");
								System.out.println("R$40.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
						
							default:
							break;		
						}
					}
					else if(opcao == 3) {
							System.out.println("");
							System.out.println("Para a renda informada temos as seguintes op��es de cr�dito:");
							System.out.println("1 - Plano F�cil");
							System.out.println("2 - Plano M�dio");
							System.out.println("3 -	Plano Master");
							System.out.println("0 - Voltar");
							System.out.print(">>: ");
							plano = ler.nextInt();
							
						
							switch(plano) {
							case 1:
								System.out.println("Voc� selecionou - Plano F�cil");
								System.out.println("R$50.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 2:
								System.out.println("Voc� selecionou - Plano M�dia");
								System.out.println("R$75.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 3:
								System.out.println("Voc� selecionou - Plano Master");
								System.out.println("R$100.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
						
							default:
							break;		
						}
					}
			}while (confirmacao != 1 || opcao == 0);
				
				System.out.println("");
				System.out.println("Ficamos feliz que tenha encontrado um plano que te agrade!");
				System.out.println("Agora para concluirmos a sua contrata��o de cr�dito precisaremos de algumas informa��es suas, ok?");	
				
			do {	
				try{Thread. sleep(1000);}catch(Exception erro){}
				System.out.println("Primeiramente informe o seu nome:");
				System.out.print(">>: ");
				String nome = ler.next();
				System.out.println("Em seguida, informe o seu sobrenome:");
				System.out.print(">>: ");
				String sobrenome = ler.next();
				System.out.println("Informe tambem seu CPF, por favor:(XXX.XXX.XXX-XX)");
				System.out.print(">>: ");
				String cpf = ler.next();
				
				if(opcao == 1 && plano == 1) {	
					String Opcao = "Plano F�cil";
					String Plano = "R$2.500,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
					
				}
				else if(opcao == 1 && plano == 2) {
					String Opcao = "Plano M�dio";
					String Plano = "R$6.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 1 && plano == 3) {
					String Opcao = "Plano Master";
					String Plano = "R$10.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 2 && plano == 1) {
					String Opcao = "Plano F�cil";
					String Plano = "R$15.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 2 && plano == 2) {
					String Opcao = "Plano M�dio";
					String Plano = "R$25.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 2 && plano == 3) {
					String Opcao = "Plano Master";
					String Plano = "R$40.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 3 && plano == 1) {
					String Opcao = "Plano F�cil";
					String Plano = "R$60.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 3 && plano == 2) {
					String Opcao = "Plano M�dio";
					String Plano = "R$75.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 3 && plano == 3) {
					String Opcao = "Plano Master";
					String Plano = "R$100.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revis�o de Informa��es ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Sal�rio M�nimo");
					System.out.println("Opc�o: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				
					System.out.println("");
					System.out.println("Voc� confirma que suas informa��es est�o corretas?");
					System.out.println("Se as informa��es apresentadas estiverem incorretas, n�o ocorrera a confirma��o do seu novo cr�dito");
					System.out.println("Verifique por favor e fique a vontade para realizar a contrata��o do seu novo cr�dito pessoal");
					System.out.println("Confirma os dados? (SIM/N�O)");
					System.out.print(">>: ");
					decisao = ler.next();

			}while(!decisao.equals("SIM"));
				
					System.out.println("");
					System.out.println("Obrigado por optar pelo nosso servi�o!");
					System.out.println("Para qualquer d�vida ou necessidade, voc� pode ligar para o telefone (47)3332-1234");
					System.out.println("Ou entre em contato via Whatssap pelo n�mero (47)999887766");
					try{Thread. sleep(2000);}catch(Exception erro){}
			}
		}while (acao != 0);
	}
}
