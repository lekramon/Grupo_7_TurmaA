import java.util.Scanner;
class ProjetoFinal
{	 
	
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES R�PIDOS - 50 PARA JOGAR.
	
	static int arma = 0; 	// 1 = Shotgun // 2 = Katana
	
	
	//inicio	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	//tela de in�cio ##tela inicial##
		
		int escolha = 1;
			
	Narrar("________________| OniricMancer |__________________\r\n"
			+ "\r\n"
			+ "Ei..........Voc� est� a�?.......\r\n"
			+ "Consegue me ouvir?..... Abra os olhos.......");
	do {
		
	Narrar("\n1 - Abrir | 2 - Esperar um pouco e abrir | 3 - N�o\n");
	escolha = entradaDados();
	
	if (escolha == 1) {
		Narrar("\nObrigada. � que voc� precisa sair daqui... Hmmm... U R G E N T E. Vamos l�!"); 
	}
		else if (escolha == 2) {
			pause(100);
			Narrar("\nObrigada. � que voc� precisa sair daqui... Hmmm... U R G E N T E. Vamos l�! \n");
		}
			else if (escolha == 3) {
				Narrar("\nVoc� precisa da minha ajuda... Confie em mim!"); }	
		
	}while (escolha != 1 && escolha != 2 && escolha != 3);
	
	menu();
	}
	
	//menu principal ##tela do menu##
	
	public static void menu() throws InterruptedException { 
	    int opMenu;
	    	do{
	    		System.out.println("\n1 - INSTRU��ES \n2 - JOGAR \n3 - CR�DITOS\n4 - SAIR");	    		
	    		opMenu = entradaDados();
	    		switch(opMenu){
	    		case 1:	    		
	    			instrucoes(); break; //IR PARA O M�TODO instrucoes()
	    		case 2:	    		
	    			cap1(); break; //IR PARA O M�TODO cap1()
	    		case 3:
	    			credits(); break; //IR PARA O M�TODO credits()
	    		case 4:
	    			System.out.println("Obrigado por jogar, at� a pr�xima!");
	    			System.exit(0); break; //ENCERRAR A EXECU��O
	    		default:
	    			Narrar("\nOp��o inv�lida, digite novamente: ");}
	    	}while(opMenu !=1 && opMenu !=2 && opMenu !=3);
	}
	
	//game ##fluxo do jogo##
	
	public static void cap1() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, cont = 3;
		String resposta;
		
	Narrar("Cap�tulo I - OniricMancer - O mundo do Sonho Paradoxal\r\n"
			+ "												\r\n"
			+ "Tente lembrar o seu nome pelo menos, qual era mesmo?\r\n"
			+ "\r\n");
	do {
	Narrar("1. Ellora\n");
	escolha1 = entradaDados();
	
	if (escolha1 == 1) {
		Narrar("Ok, Ellora, vamos l�. Ainda bem que voc� acordou. Quer saber o que est� acontecendo ou \r\n"
				+ "quer fugir na escurid�o? \r\n"
				+ "\r\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida!\n");
	}
	} while(escolha1 != 1);
	
	
	do {
		
		Narrar("1 - Eu n�o estou entendendo nada. Porque a sua voz � igual a minha e n�o consigo te ver? Que lugar � esse?\n");
		escolha2 = entradaDados();
	
	if (escolha2 == 1) {
		Narrar(" Ellora... Voc� precisa sair daqui pois n�o pertence a este lugar. N�o posso dar muitos detalhes mas � \r\n"
				+ "como se voc� estivesse em um sonho REM. Mas n�o s� a sua imagina��o, entende? ... Uma c�pia do seu f�sico T A M B � M! \r\n"
				+ "Aqui se chama OniricMancer, um mundo secund�rio. Esse lugar s� sobrevive porque pessoas como voc� n�o conseguem achar a sa�da. Saiba que \r\n"
				+ "provavelmente n�o ir� se lembrar de muito al�m do pr�prio nome e de mim, sua consci�ncia que est� t�o confusa quanto voc�. Consegue ver \r\n"
				+ "aquela torre brilhante e neon no horizonte? Voc� precisa chegar at� l� e recuperar suas lembran�as, est�o todas criptografadas em uma pasta! \n\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida! \n");
	}
	} while(escolha2 != 1);
	
	do {
		Narrar("1 - Como farei isso? O que encontrarei no caminho? | 2 - Eu n�o sei se consigo!\n");
		escolha3= entradaDados();
		
	if (escolha3 == 1) {
		Narrar("Encontrar�s inimigos que tentar�o te atrasar. Suas emo��es e medos criam vida cibern�tica aqui. Tentar�o te hackear\n"
			+ "modificar suas lembran�as, apagar os dados do seu subconsciente! Vem, tenho um lugar pra te mostrar que vai te\n"
			+ "ajudar a se proteger.\n\n");
	}
	else if (escolha3 == 2) {
		Narrar("Ellora, quer ficar presa com entidades cibern�ticas que apagar�o qualquer resqu�cio de dados do seu ser e nunca mais voltar \r\n"
				+ "para o seu mundo prim�rio? Vem logo! Tenho um lugar pra te mostrar que vai te ajudar a se proteger.\n\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida!\n");
	}
	} while (escolha3 != 1 && escolha3 != 2);
	
	Narrar("\n\"Voc� e sua consci�ncia passam por uma rua muito familiar de sua inf�ncia mas bastante alterada, como se fossem hologramas falhando.\n" 
		+ "� um beco escuro e com luzes coloridas piscando. Uma estranha sensa��o de que aquilo respira tamb�m... Ao chegar numa portinha pequena\n" 
		+ "e cheia de fios conectados a uma tela, um homem com uma cicatriz que cobria toda a sua careca, olhos de led vermelho e corpo multilado\n"
		+ "por pe�as de cibertecnologia, apareceu.\"\n\n"
		+ "Vexon: \"Ol�... quanto tempo n�o recebemos uma visita aqui! Meu nome � Vexon, muito prazer. Veja bem...por seguran�a preciso que voc� resolva\n" 
		+ "um desafio para descobrir a senha que abre esta porta. Sabe como �... muitos androids tentam acabar com o meu com�rcio... Eu s� quero\n"
		+ "ajudar quem vem aqui perdido e sem lembran�as, entende? E eles querem impedir isso, se alimentam dos que aqui ficam presos.\n\"");
	Narrar("Vexon: \"Resolva o seguinte puzzle e o resultado, se correto, abrir� a porta a sua frente!\"\n");
	do {
		Narrar("Escreva um comando que imprima \"Abrir porta a frente!\"\nR: ");
		resposta = input.nextLine();
		
		if (resposta.equals("System.out.print(\"Abrir porta a frente!\");") || resposta.equals("System.out.println(\"Abrir porta a frente!\");")) {
			Narrar("\nVexon: \"� isso! Eu sabia que voc� era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, Ellora!\"");
		}
		else {			
			Narrar("Vexon: \"Sinto muito querida...\"");
			cont--;
			System.out.println("\nTentativas restantes: " + cont);
		}
		
		if (cont == 0) {
			Narrar("Voc� n�o conseguiu provar sua inoc�ncia para Vexon, logo, n�o poder� sair deste mundo.\n");
			System.out.println("\nFIM DE JOGO");
			Narrar("\nRedirecionando ao menu................\n");
			menu();	
		}
		
	}while(!(resposta.equals("System.out.print(\"Abrir porta a frente!\");") || resposta.equals("System.out.println(\"Abrir porta a frente!\");") || (cont == 0)));
		
	do {
		Narrar("\n\n1. Uma alma o que?... Eu sou o que??????\n");
		escolha4 = entradaDados();
		
		if (escolha4 == 1) {
		Narrar("\nVexon: \"Nada, entra logo!\"\n");
		}
		
		else {
			Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
		}
	}	
	while (!(escolha4 == 1));
	
	Narrar("\nVexon: \"Aqui, essas s�o as que mais gosto. Guardei para quando algu�m especial como voc� chegasse! Como prefere buscar sua liberdade? "
			+ "\nCom uma Shotgun Hacker 88 ou uma Katana 60?\"");
	
	do {
		Narrar("\n1. Hmm... escolho a Shotgun? | 2. Er... pode ser a Katana, eu acho\n");
		escolha5 = entradaDados();
		
		if (escolha5 == 1) {
			arma = 1;
		}
		
		else if (escolha5 == 2) {
			arma = 2;
		}
		
		else  {
			Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
		}
	}
	
	while ( (escolha5 != 1) && (escolha5 != 2) );	
	
	Narrar("\nVexon: \"Bom... �... voc� parece saber usar essas coisas, n�o sabe?\"\n" + "N�o responde, vamos sair logo daqui!\n");
	Narrar("\nVexon: \"Espere! Um momento. Onde ser� que deixei?... AH! Aqui est�! Pegue esta capa de chuva, acredite, vai precisar neste mundo! "
			+ "\nH� duas Adagas capazes de hackear sistemas no bolso da capa, use somente em casos de extrema necessidade. Pode salvar a sua vida.\"");
	
	do {
		Narrar("\n\n1. Obrigada, Vexon. Tenha um bom dia amanh�.\n");
		escolha6 = entradaDados();
		if (escolha6 == 1) {
	Narrar("\nVexon: \"Aqui s� h� noite, minha cara... Os melhores sonhos acontecem depois que o sol se p�e, lembra?\"");
		}
		
		else {
			Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
		}
	}
	
	while (escolha6 != 1);
	
	cap2();
	
	}
	
	public static void cap2() throws InterruptedException {
		Narrar("\n\nCap�tulo II - OniricMancer - ");
	}

	
	//credits ##tela de cr�ditos##
	
	public static void credits() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		int voltar;
	Narrar("Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
	Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribui��o com d�vidas e conte�do.\n- SENAC, pela estrutura.");
	System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - N�o");
	voltar = input.nextInt();
	
	if (voltar == 1) {
		menu(); 
	}
	else {
		System.exit(0);
	}
		
	}
	
	
	//Instru��es #como jogar#
	
	public static void instrucoes() throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		int voltar;
		
		Narrar("As op��es de escolha ser�o sempre identificadas em '1', '2' ou '3'.");
		System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - N�o");
		voltar = input.nextInt();
		
		if (voltar == 1) {
			menu(); 
		}
		else {
			System.exit(0);
		}
			
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
	
	public static int entradaDados() {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	return n;
	}
}