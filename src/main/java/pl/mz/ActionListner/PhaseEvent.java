/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.ActionListner;

import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author Mateusz
 */
public class PhaseEvent implements PhaseListener{

    @Override
    public void afterPhase(javax.faces.event.PhaseEvent pe) {
        System.out.println("After == " + pe.getPhaseId());
    }

    @Override
    public void beforePhase(javax.faces.event.PhaseEvent pe) {
        System.out.println("Before == " + pe.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
      return PhaseId.ANY_PHASE;
    }
    
}
