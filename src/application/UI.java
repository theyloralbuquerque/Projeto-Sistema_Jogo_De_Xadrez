package application;

import xadrez.Cor;
import xadrez.PecaDeXadrez;
public class UI {
	
	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // M�todo que ir� imprimir o tabuleiro.
	// Recebe uma matriz do tipo PecaDeXadrez que chamaremos de pecas.
    public static void printTabuleiro(PecaDeXadrez[][] pecas) {
    	
        // Enquanto i for menor que o n�mero de linhas da matriz pecas.
        for (int i=0; i<pecas.length; i++) {
        	
            System.out.print((8 - i) + " "); // 8 menos o valor de i seguido de um espa�o.
            
            // Enquanto j for menor que o n�mero de linhas da matriz pecas.
            for (int j=0; j<pecas.length; j++) {
                printPeca(pecas[i][j]); // Chamada do m�todo printPeca passando como par�mentros o valor da matriz pecas.
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h"); // Impress�o da linha de orienta��o das colunas do xadrez.
    }

    private static void printPeca(PecaDeXadrez peca) {
    	if (peca == null) {
            System.out.print("-");
        }
        else {
            if (peca.getCor() == Cor.BRANCA) {
                System.out.print(ANSI_WHITE + peca + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + peca + ANSI_RESET);
            }
        }
        System.out.print(" "); // Espa�o para evitar que as pecas ou os tra�os (-) fiquem grudados na exibi��o do tabuleiro.
    }
}