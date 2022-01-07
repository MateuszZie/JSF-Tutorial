/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.ActionListner;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 *
 * @author Mateusz
 */
public class ValueChangeListner implements ValueChangeListener{

    @Override
    public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException {
        System.out.println("Old value: " + vce.getOldValue() + "   New value: " + vce.getNewValue());
    }
    
}
