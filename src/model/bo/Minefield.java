package model.bo;

import java.util.Random;

/**
 *
 * @author willian
 */
public class Minefield {
    private int mapa[][];
    private String[] minas;
    //A quantidade de minas é definida como 16% do mapa
    private static float dificuldade = 0.16f;
    
    public Minefield(int linha, int coluna){
        mapa = new int[linha][coluna];
        
    }
    private void minar(int linha, int coluna){
        int campo = linha*coluna;
        minas = new String [(campo*(int)(dificuldade))];
        for(int i = 0;i < minas.length; i++){
            minas[i] = (new Random().nextInt(linha  - 1))+","+(new Random().nextInt(coluna - 1));
        }
    }
    private boolean explodiu(String pos){
        
//         for (int i = 0;i < minas.length;i++)
//            if(minas[i].equals(pos))
                
        for (String mina : minas)
            if (mina.equals(pos))
                return true;
        return false;
    }
    private void minesweeper(String pos){
        if (explodiu(pos)==false){
            String [] x = pos.split(",");
            
        }
    }
}
