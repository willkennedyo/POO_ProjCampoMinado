package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.bo.Minesweeper;
import model.vo.Campo;
import view.ViewMain;
import view.ViewCampo;

/**
 *
 * @author willian
 */
public class ControllerCampo  implements ActionListener, MouseListener, ChangeListener{
    private final ViewCampo viewCampo;
    private Campo campo;

    public ControllerCampo(ViewCampo viewCampo) {
        
        this.viewCampo = viewCampo;
        //Definindo os listeners para os botões de viewCampo
        this.viewCampo.getBtnVoltar().addActionListener(this);
        this.viewCampo.getBtnReiniciar().addActionListener(this);
        this.campo = new Campo(this.viewCampo.getLinha(),this.viewCampo.getColuna());
        this.campo.setMapa(new Minesweeper().minar(campo.getLinha(), campo.getColuna()));
        this.campo.setMinas(new Minesweeper().getMinas(campo.getLinha(), campo.getColuna()));
        this.viewCampo.getLblContador().setText(campo.getFlags()+"/"+campo.getMinas());
        for (int i = 0; i < this.viewCampo.getLinha();i++){  
            for(int j = 0; j < this.viewCampo.getColuna(); j++){
                  this.viewCampo.getBotaoMapa((Integer.toString(i)+","+Integer.toString(j))).addMouseListener(this);
            }
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
         /**
        * Se for pressionar um dos botões
        */
        if (e.getSource() == this.viewCampo.getBtnReiniciar()){
            ViewCampo viewCampo = new ViewCampo(this.viewCampo.getLinha(),this.viewCampo.getColuna());
            new ControllerCampo(viewCampo);
            this.viewCampo.dispose();
            viewCampo.setVisible(true);
        }else if(e.getSource()==this.viewCampo.getBtnVoltar()){
            ViewMain framePrincipal = new ViewMain();
            new ControllerMain(framePrincipal);
            this.viewCampo.dispose();
            framePrincipal.setVisible(true);
        }else {
                     
        }
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String indice = null;
        for (int i = 0; i < this.viewCampo.getLinha();i++)
              for(int j = 0; j < this.viewCampo.getColuna(); j++)
                  if(e.getSource()==this.viewCampo.getBotaoMapa(i+","+j))
                      indice = (Integer.toString(i)+","+Integer.toString(j));
              
        if( this.viewCampo.getBotaoMapa(indice).isEnabled()){
            if (e.getButton() == MouseEvent.BUTTON1) {
                verificaMina(indice);
            } else if (e.getButton() == MouseEvent.BUTTON3) {
                marcaCampo(indice);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
 
    private void verificaMina(String indice){
        Minesweeper minesweeper = new Minesweeper();
        campo.setIndice(indice);
        campo = minesweeper.abrir(campo.getVerificaLinha(),campo.getVerificaColuna(),campo);
        if(this.campo.getValor(indice) == -1){
            JOptionPane.showMessageDialog(viewCampo, "EXPLODIU!");
            exibeMinas();
        }else{
            atualizaCampo();
            int restantes = 0;
            for (int i = 0; i < this.viewCampo.getLinha();i++)
              for(int j = 0; j < this.viewCampo.getColuna(); j++)
                  if(this.viewCampo.getBotaoMapa(i+","+j).isEnabled())
                      restantes++;
            if (restantes == campo.getMinas()){
                JOptionPane.showMessageDialog(viewCampo, "TODAS AS MINAS\nFORAM LOCALIZADAS!!");
                exibeMinas();
            }
        }
    }

    private void atualizaCampo() {
        for(int i = 0; i < campo.getColuna(); i++){
            for(int j = 0; j < campo.getLinha(); j++){
                if(campo.getMapa()[i][j] != 0 && campo.getMapa()[i][j] !=-1){
                        this.viewCampo.getBotaoMapa(i+","+j).setEnabled(false);
                        this.viewCampo.getBotaoMapa(i+","+j).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+(campo.getMapa()[i][j])+".png")));
                }
            }
        }
    }

    private void marcaCampo(String indice) {
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/-2.png"));
        if (this.viewCampo.getBotaoMapa(indice).getIcon().toString().equals(icon.toString())){
            campo.setFlags(+1);
            this.viewCampo.getBotaoMapa(indice).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png")));
        }else{
            this.viewCampo.getBotaoMapa(indice).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/-2.png")));
            campo.setFlags(-1);
        }
        this.viewCampo.getLblContador().setText(campo.getFlags()+"/"+campo.getMinas());
        
    }

    private void exibeMinas() {
         for(int i = 0; i < campo.getColuna(); i++){
            for(int j = 0; j < campo.getLinha(); j++){
                this.viewCampo.getBotaoMapa(i+","+j).setEnabled(false);
                if(campo.getMapa()[i][j] == -1)
                     this.viewCampo.getBotaoMapa(i+","+j).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+(campo.getMapa()[i][j])+".png")));
            }
         }
    }
}
