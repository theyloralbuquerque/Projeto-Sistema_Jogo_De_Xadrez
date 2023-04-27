package jogo_de_tabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pecas; // Uma matriz do tipo Peca que chamaremos de pecas.

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca [linhas][colunas]; // Uma nova matriz pecas do tipo Peca com os valores de [linhas] e [colunas].
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

     // M�todo peca do tipo Peca, que recebe como argumento linha e coluna e retorna a matriz pecas com os valores de linha e coluna.
    public Peca peca(int linha, int coluna) {
        return pecas[linha][coluna];
    }

    /*
     * Sobrecarga do m�todo peca do tipo Peca, que recebe como argumento o objeto posicao do tipo Posicao
     * e retorna a matriz pecas com os valores de linha e coluna.
     */
    public Peca peca(Posicao posicao) {
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    // M�todo que aloca uma pe�a no tabuleiro
    public void colocarPeca(Peca peca, Posicao posicao) {
    	
        // A matriz na posi��o[posicao.getLinha()][posicao.getColuna()] vai receber o valor de peca.
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        
        // O objeto peca chama atributo posicao da classe Peca recebe o valor de posicao, portanto o valor de peca n�o � mais null.
        peca.posicao = posicao;
    }
}