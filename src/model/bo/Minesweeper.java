package model.bo;

import java.util.Random;
import model.vo.Campo;

/**
 *
 * @author willian
 */
public class Minesweeper {
    
    //A quantidade de minas é definida como 16% do mapa
    private static float dificuldade = 0.16f;
    
    public Minesweeper(){
        
    }

    public static int getMinas(int linha, int coluna) {
        return (int)((linha*coluna)*dificuldade);
    }
    
    public int[][] minar(int linha, int coluna){
        int[][]mapa = new int[linha][coluna];
        int minas = (int)((linha*coluna)*dificuldade);
        int i;
        int j;
        for(int c = 0;c < minas; c++){
            do{
                i = new Random().nextInt(linha);
                j = new Random().nextInt(coluna);
            }while(mapa[i][j] ==  -1);
           mapa[i][j] = -1;
        }
        return mapa;
    }
    
    public Campo abrir(int verificaLinha, int verificaColuna, Campo campo) {
         if(verificaLinha < 0 || verificaColuna < 0 || verificaColuna > campo.getLinha() - 1 || verificaLinha > campo.getColuna() - 1 || campo.getMapa()[verificaLinha][verificaColuna] != 0) 
            return campo;
        int minas = 0;
        for(int i = verificaLinha - 1; i <= verificaLinha + 1;i++){
            for(int j = verificaColuna - 1; j <= verificaColuna + 1;j++){
                if(!(j < 0 || i < 0 || j > campo.getLinha() - 1 || i > campo.getColuna() - 1) &&  campo.getMapa()[i][j] == -1)
                    minas++;
            }
        }
        if(minas == 0){
             campo.getMapa()[verificaLinha][verificaColuna] = -2;
            for(int i = verificaLinha - 1; i <= verificaLinha + 1;i++){
                for(int j = verificaColuna - 1; j <= verificaColuna + 1;j++){
                    if(!(j < 0 || i < 0 || j > campo.getLinha() - 1 || i > campo.getColuna() - 1))
                        if(i != verificaLinha || j != verificaColuna) 
                            campo = abrir(i,j,campo);
                }
            }
        } else  campo.getMapa()[verificaLinha][verificaColuna] = minas;
        
        return campo;
    }
    
}