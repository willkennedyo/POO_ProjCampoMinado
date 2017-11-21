package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.ViewMain;
import view.ViewMinefield;

/**
 *
 * @author willian
 */
public class ControllerMinefield  implements ActionListener, MouseListener, ChangeListener{
    private final ViewMinefield viewMinefield;

    public ControllerMinefield(ViewMinefield viewMinefield) {
        
        this.viewMinefield = viewMinefield;
        //Definindo os listeners para os botões de viewMinefield
        this.viewMinefield.getBtnVoltar().addActionListener(this);
        this.viewMinefield.getBtnReiniciar().addActionListener(this);
       
        for (int i = 0; i < this.viewMinefield.getLinha();i++){  
            for(int j = 0; j < this.viewMinefield.getColuna(); j++){
                  this.viewMinefield.getBotaoMapa((Integer.toString(i)+","+Integer.toString(j))).addMouseListener(this);
                 
            }
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
         /**
        * Se for bressionar um dos botões
        */
        if (e.getSource() == this.viewMinefield.getBtnReiniciar()){
            ViewMinefield viewMinefield = new ViewMinefield(this.viewMinefield.getLinha(),this.viewMinefield.getColuna());
            new ControllerMinefield(viewMinefield);
            this.viewMinefield.dispose();
            viewMinefield.setVisible(true);
        }else if(e.getSource()==this.viewMinefield.getBtnVoltar()){
            ViewMain framePrincipal = new ViewMain();
            new ControllerMain(framePrincipal);
            this.viewMinefield.dispose();
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
        for (int i = 0; i < this.viewMinefield.getLinha();i++){ 
              for(int j = 0; j < this.viewMinefield.getColuna(); j++){
                  if(e.getSource()==this.viewMinefield.getBotaoMapa(i+","+j)){
                  indice = (Integer.toString(i)+","+Integer.toString(j));
                  }
                  
              }
          }  
        
       if (e.getButton() == MouseEvent.BUTTON1) {
           System.out.println("Left Button Pressed");
           verificaMina(indice);
       } else if (e.getButton() == MouseEvent.BUTTON3) {
           System.out.println("Right Button Pressed");
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
        this.viewMinefield.getBotaoMapa(indice).setEnabled(false);
    }
    
}
