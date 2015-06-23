/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Mustafa
 */
@ManagedBean
@RequestScoped
public class FormBean {
    
    private String name;
    private String surname;
    private String email;
    private String city;
    private static Map<String,String> cities;
    private Date date;
    private String phoneNumber;
    
    static {
        cities = new HashMap<>();
        cities.put("İstanbul", "İstanbul");
        cities.put("İzmir", "İzmir");
        cities.put("Ankara","Ankara");
        cities.put("Bursa", "Bursa");
        cities.put("Konya", "Konya");
        cities.put("Adana", "Adana");
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
   
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
   public String getCity(){
       return city;
   }
   public void setCity(String city){
       this.city = city;
   }
   public Map<String, String> getCities(){
       return cities;
   }
  
    
}
