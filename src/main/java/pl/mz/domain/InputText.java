/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Mateusz
 */
@Named
@RequestScoped
@Data
public class InputText {
    private String name;
    private ArrayList<String> names;
    
    public String start(){
        return "index";
    }
}
