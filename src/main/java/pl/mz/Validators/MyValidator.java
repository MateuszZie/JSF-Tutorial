/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.Validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Mateusz
 */
@FacesValidator("mv")
public class MyValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
                String text = (String) t;
                
                if(!text.contains("a")){
                    FacesMessage fm = new FacesMessage();
                    fm.setSummary("Text must contain small a");
                    throw new ValidatorException(fm);
                }
    }
    
}
