/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.ActionListner;

import javax.faces.application.Application;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructApplicationEvent;
import javax.faces.event.PreDestroyApplicationEvent;
import javax.faces.event.SystemEventListener;

/**
 *
 * @author Mateusz
 */
public class SystemEvent implements SystemEventListener{

    @Override
    public void processEvent(javax.faces.event.SystemEvent se) throws AbortProcessingException {
        if(se instanceof PostConstructApplicationEvent){
            System.out.println("Post Construct Aplication");
        }else if(se instanceof PreDestroyApplicationEvent){
            System.out.println("Pre Destroye Application");
        }
    }

    @Override
    public boolean isListenerForSource(Object o) {
        return (o instanceof Application);
    }
    
    
}
