/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Mateusz
 */
@Named
@Data
@RequestScoped
public class Login {
    String name, password;
    
    public String login(){
        if(name.equals("mateusz") && password.equals("mateusz")){
            return "indexx";
        }else{
            return "error";
        }
    }
}
