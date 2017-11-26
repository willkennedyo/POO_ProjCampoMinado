package model.vo;

/**
 *
 * @author willian
 */
public class Campo {
    
    private int mapa[][];
    private int linha;
    private int coluna;
    private int flags;
    private  int minas;
    private int verificaLinha;
    private int verificaColuna;

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        this.flags = 0;
        this.mapa = new int [linha][coluna];
    }

    public int[][] getMapa() {
        return mapa;
    }

    public void setMapa(int[][] mapa) {
        this.mapa = mapa;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags += flags;
    }

    public  int getMinas() {
        return minas;
    }

    public  void setMinas(int minas) {
        this.minas = minas;
    }

    public int getVerificaLinha() {
        return verificaLinha;
    }

    public int getVerificaColuna() {
        return verificaColuna;
    }
    
       public int getValor(String indice){
        String [] x = indice.split(",");
        return this.mapa[Integer.parseInt(x[0])][Integer.parseInt(x[1])];
    }
    
    public void setIndice(String indice){
        String [] x = indice.split(",");
        this.verificaLinha = Integer.parseInt(x[0]);
        this.verificaColuna = Integer.parseInt(x[1]);
    }
    public void setIndice(int linha, int coluna){
        this.verificaLinha = linha;
        this.verificaColuna = coluna;
    }
}
