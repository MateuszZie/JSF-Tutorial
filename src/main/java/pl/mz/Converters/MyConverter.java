/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.Converters;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.validator.ValidatorException;


/**
 *
 * @author Mateusz
 */
@FacesConverter("myConverter")
public class MyConverter implements Converter<Object>{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
    if(string.length() < 4){
        FacesMessage message = new FacesMessage();
        message.setSummary("Value must be gretter then 3");
        throw new ValidatorException(message);
    }else{
       return string.concat("!!!!");
    }
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        return t.toString();
    }  
}
