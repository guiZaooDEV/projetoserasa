import java.util.Scanner;

public class projetoserasa {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int acao; 
		int opcao; 
		int plano = 0;
		int confirmacao = 0;
		String decisao;
		
		System.out.println("Olá, seja bem vindo ao CrediFácil!");
		System.out.println("O novo sistema de crédito pessoal para ajudar você de maneira prática e segura.");
		System.out.println("");
		try{Thread. sleep(1000);}catch(Exception erro){}
		do {
			System.out.println("____________________________");
			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Solicitar novo crédito");
			System.out.println("0 - Finalizar serviço");
			System.out.println("____________________________");
			System.out.print(">> "); 
			acao = ler.nextInt();
			
			if(acao == 1) {
				
				do {
					System.out.println("Antes precisamos que informe sua renda mensal");
					System.out.println("Sua renda mensal é equivalente à:");
					System.out.println("");
					System.out.println("1 - 1 salário mínimo");
					System.out.println("2 - Entre 1 e 3 salários mínimos");
					System.out.println("3 - Mais que 3 salários mínimos");
					System.out.println("0 - Voltar");
					System.out.print(">>: ");
					opcao = ler.nextInt();	
					
					
					if(opcao == 1) {
						
						System.out.println("");
						System.out.println("Para a renda informada temos as seguintes opções de crédito:");
						System.out.println("1 - Plano Fácil");
						System.out.println("2 - Plano Médio");
						System.out.println("3 -	Plano Master");
						System.out.println("0 - Voltar");
						System.out.print(">>: ");
						plano = ler.nextInt();
						
						switch(plano) {
							case 1:
								System.out.println("Você selecionou - Plano Fácil");
								System.out.println("R$2.500,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 2:
								System.out.println("Você selecionou - Plano Médio");
								System.out.println("R$6.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 3:
								System.out.println("Você selecionou - Plano Master");
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
							System.out.println("Para a renda informada temos as seguintes opções de crédito:");
							System.out.println("1 - Plano Fácil");
							System.out.println("2 - Plano Médio");
							System.out.println("3 -	Plano Master");
							System.out.println("0 - Voltar");
							System.out.print(">>: ");
							plano = ler.nextInt();
							
						
							switch(plano) {
							case 1:
								System.out.println("Você selecionou - Plano Fácil");
								System.out.println("R$15.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 2:
								System.out.println("Você selecionou - Plano Médio");
								System.out.println("R$20.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 3:
								System.out.println("Você selecionou - Plano Master");
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
							System.out.println("Para a renda informada temos as seguintes opções de crédito:");
							System.out.println("1 - Plano Fácil");
							System.out.println("2 - Plano Médio");
							System.out.println("3 -	Plano Master");
							System.out.println("0 - Voltar");
							System.out.print(">>: ");
							plano = ler.nextInt();
							
						
							switch(plano) {
							case 1:
								System.out.println("Você selecionou - Plano Fácil");
								System.out.println("R$50.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 2:
								System.out.println("Você selecionou - Plano Média");
								System.out.println("R$75.000,00 em 60x");
								System.out.println("1 - Contratar plano");
								System.out.println("0 - Voltar");
								System.out.print(">>: ");
								confirmacao = ler.nextInt();
							break;
							case 3:
								System.out.println("Você selecionou - Plano Master");
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
				System.out.println("Agora para concluirmos a sua contratação de crédito precisaremos de algumas informações suas, ok?");	
				
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
					String Opcao = "Plano Fácil";
					String Plano = "R$2.500,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
					
				}
				else if(opcao == 1 && plano == 2) {
					String Opcao = "Plano Médio";
					String Plano = "R$6.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 1 && plano == 3) {
					String Opcao = "Plano Master";
					String Plano = "R$10.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 2 && plano == 1) {
					String Opcao = "Plano Fácil";
					String Plano = "R$15.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 2 && plano == 2) {
					String Opcao = "Plano Médio";
					String Plano = "R$25.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 2 && plano == 3) {
					String Opcao = "Plano Master";
					String Plano = "R$40.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 3 && plano == 1) {
					String Opcao = "Plano Fácil";
					String Plano = "R$60.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 3 && plano == 2) {
					String Opcao = "Plano Médio";
					String Plano = "R$75.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				else if(opcao == 3 && plano == 3) {
					String Opcao = "Plano Master";
					String Plano = "R$100.000,00 em 60x";
					System.out.println("");
					System.out.println("--- Revisão de Informações ---");
					System.out.println("Nome: "+ nome +" "+sobrenome+"");
					System.out.println("CPF: "+ cpf +"");
					System.out.println("Renda: 1 Salário Mínimo");
					System.out.println("Opcão: "+ Opcao +"");
					System.out.println("Plano : "+ Plano +"");
				}
				
					System.out.println("");
					System.out.println("Você confirma que suas informações estão corretas?");
					System.out.println("Se as informações apresentadas estiverem incorretas, não ocorrera a confirmação do seu novo crédito");
					System.out.println("Verifique por favor e fique a vontade para realizar a contratação do seu novo crédito pessoal");
					System.out.println("Confirma os dados? (SIM/NÃO)");
					System.out.print(">>: ");
					decisao = ler.next();

			}while(!decisao.equals("SIM"));
				
					System.out.println("");
					System.out.println("Obrigado por optar pelo nosso serviço!");
					System.out.println("Para qualquer dúvida ou necessidade, você pode ligar para o telefone (47)3332-1234");
					System.out.println("Ou entre em contato via Whatssap pelo número (47)999887766");
					try{Thread. sleep(2000);}catch(Exception erro){}
			}
		}while (acao != 0);
	}
}
