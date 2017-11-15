/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.*;

/**
 *
 * @author willian
 */
public class ControllerMain implements ActionListener, ChangeListener{
    
    private final ViewMain viewMain;
    private  ViewMinefield viewMinefield;

    public ControllerMain (ViewMain viewMain){
        this.viewMain = viewMain;
        //Definido os listeners para os botões da viewMain
        this.viewMain.getBtn8x8().addActionListener(this);
        this.viewMain.getBtn16x16().addActionListener(this);
        this.viewMain.getBtn16x30().addActionListener(this);
        this.viewMain.getBtnPref().addActionListener(this);
    }
    
    //Eventos de acao
    @Override
    public void actionPerformed(ActionEvent e) {
       /**
        * Se for bressionar um dos botões
        */
        if (e.getSource() == this.viewMain.getBtn8x8()){
            defineMapa(8,8);
        }else if(e.getSource()==this.viewMain.getBtn16x16()){
            defineMapa(16,16);
        }else if(e.getSource()==this.viewMain.getBtn16x30()){
            defineMapa(16,30);
        }else if(e.getSource()==this.viewMain.getBtnPref()){
            //Definir botão SOBRE
        }
       }

    @Override
    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
        private void defineMapa(int i, int j) {
            this.viewMinefield = new ViewMinefield(i,j);
            this.viewMinefield.setVisible(true);
            this.viewMain.dispose();
        
        
    }
    
    
    
    
}
