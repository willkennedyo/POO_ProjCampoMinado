package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.ViewCampo;
import view.ViewMain;

/**
 *
 * @author willian
 */
public class ControllerMain implements ActionListener, ChangeListener{
    
    private final ViewMain viewMain;

    public ControllerMain (ViewMain viewMain){
        this.viewMain = viewMain;
        //Definido os listeners para os bot�es da viewMain
        this.viewMain.getBtn8x8().addActionListener(this);
        this.viewMain.getBtn16x16().addActionListener(this);
        this.viewMain.getBtn12x12().addActionListener(this);
        this.viewMain.getBtnPref().addActionListener(this);
    }
    
    //Eventos de acao
    @Override
    public void actionPerformed(ActionEvent e) {
       /**
        * Se for bressionar um dos bot�es
        */
        if (e.getSource() == this.viewMain.getBtn8x8()){
            defineMapa(8,8);
        }else if(e.getSource()==this.viewMain.getBtn16x16()){
            defineMapa(16,16);
        }else if(e.getSource()==this.viewMain.getBtn12x12()){
            defineMapa(12,12);
        }else if(e.getSource()==this.viewMain.getBtnPref()){
        JOptionPane.showMessageDialog(this.viewMain, "Projeto apresentado ao Curso de An�lise e Desenvolvimento de Sistemas, \n"
                                                                                                + "da FATEC-SP, do Centro Estadual de Educa��o Tecnol�gica Paula Souza, \n"
                                                                                                + "como aproveitamento no componente curricular de Programa��o Orientada\n"
                                                                                                + "a Objetos, ministrado pelo professor J. P. Ciscato.\n\n"
                                                                                                + "Desenvolvido por:\n"
                                                                                                + "Any Ambria                              Marcelo Gomes\n"
                                                                                                + "Michel Leopold                      Willian Fonseca", "Sobre",1 );
        }
       }

    @Override
    public void stateChanged(ChangeEvent e) {
       
    }
  
        private void defineMapa(int i, int j) {
            this.viewMain.dispose();
            ViewCampo viewCampo = new ViewCampo(i,j);
            new ControllerCampo(viewCampo);
            viewCampo.setVisible(true);
        
        
    }
    
    
    
    
}
