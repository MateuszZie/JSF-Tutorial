/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
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
    private Map<String, String> mapedNames;
    
    public String start(){
        return "index";
    }
    
    @PostConstruct
    public void init(){
        mapedNames = new HashMap<>();
        
        mapedNames.put("C++", "Programing in C++");
        mapedNames.put("Java", "Programing in Java");
    }
}
