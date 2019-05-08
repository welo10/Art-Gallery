/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_pro.Classes;

/**
 *
 * @author HP
 */
public class Artist {
    
    
    
    public String Name;
    public String BirthPlace;
    public int Age;
    public String StyleOfArt;
    
    
  public   Artist ()
  {
     this.Name="";
    this.BirthPlace="";
    this.Age=0;
    this.StyleOfArt="";
  
  }
    
    
    public   Artist ( String Name,String BirthPlace, int Age, String StyleOfArt)
    {
        this.Name=Name;
        this.BirthPlace=BirthPlace;
        this.Age=Age;
        this.StyleOfArt=StyleOfArt;
        
    }
    
     public   Artist ( String Name,String BirthPlace)
    {
     
        
        this.Name=Name;
        this.BirthPlace=BirthPlace;
       
        
    }
    
}