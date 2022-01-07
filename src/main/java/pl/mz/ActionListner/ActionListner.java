/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.ActionListner;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author Mateusz
 */
public class ActionListner implements ActionListener{

    @Override
    public void processAction(ActionEvent ae) throws AbortProcessingException {
        System.out.println("Mesage from buton id: " +ae.getComponent().getId());
    }
    
}
