import java.util.Scanner;
class ProjetoFinal
{	 
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES R�PIDOS - 50 PARA JOGAR.
	
	//inicio	
	
	public static void main(String[] args) throws InterruptedException {
		
	//tela de in�cio ##tela inicial##
		
	System.out.println("joguinho.exe\n\n");		
	menu();
	}
	
	//menu principal ##tela do menu##
	
	public static void menu() throws InterruptedException {
		Scanner input = new Scanner(System.in);   
	    int opMenu;
	    	do{
	    		System.out.println("\n\nMENU PRINCIPAL\n\n1 - NOVO JOGO \n2 - SAIR \n3 - CR�DITOS\n");	    		
	    		opMenu = input.nextInt();
	    		switch(opMenu){
	    		case 1:	    		
	    			game(); break; //IR PARA O M�TODO game()
	    		case 3:	    		
	    			credits(); break; //IR PARA O M�TODO credits()
	    		case 2:
	    			System.out.println("Obrigado por jogar, at� a pr�xima!");
	    			System.exit(0); break; //ENCERRAR A EXECU��O
	    		default:
	    			Narrar("\nOp��o inv�lida, digite novamente: ");}
	    	}while(opMenu !=1 && opMenu !=2 && opMenu !=3); input.close();
	}
	
	//game ##fluxo do jogo##
	
	public static void game() throws InterruptedException {
	Narrar("Fazer a instru��o de comandos (tutorial de como jogar),\nintrodu��o da hist�ria do jogo e apresenta��o do personagem.");
	}
	
	//credits ##tela de cr�ditos##
	
	public static void credits() throws InterruptedException {
	Narrar("Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
	Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribui��o com d�vidas e conte�do.\n- SENAC, pela estrutura.");
	}
	
	//m�todos auxiliares ##ferramentas internas##	
	public static void pause(int ms) {
	try{Thread.sleep(ms);}catch(InterruptedException e)
		{System.err.format("IOException: %s%n", e);}
	}
	public static void Narrar(String mensagem) throws InterruptedException {
    for (char caractere : mensagem.toCharArray()) {
    System.out.print(caractere);
    pause(narrador);}   
	}
}