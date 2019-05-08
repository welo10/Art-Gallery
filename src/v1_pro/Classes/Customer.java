/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_pro.Classes;

/**
 *
 * @author Nada
 */
import java.util.*;
 public class Customer extends User {
    
    String Address;
    int ID;
    int amountOfmoney;
    public int price=0;
  public  ArrayList<String> Cart ;
    public Customer(){
        super();
        Cart = new ArrayList<>();
                              
    }
    public Customer(String Address,  int amountOfmoney, String Name, String Password) {
        super(Name, Password);
        this.Address = Address;
        this.amountOfmoney = amountOfmoney;
        Cart = new ArrayList<>();
    }
    
    public void buyItem(String Name)
    {
        //String id=String.valueOf(Artid);
        Cart.add(Name);    
    }
    public boolean removeItem(int artID)
    {
        boolean isFound=true;
        String id=String.valueOf(artID);
        for (int i=0;i<Cart.size();i++)
        {
            if(Cart.get(i).equals(id))
            {
                Cart.remove(i);
                isFound=true;
            }
            else isFound=false;
        }
        return isFound;
    }
    
    public void ShowCart(int custID)
    {
        for(int i=0;i<Cart.size();i++)
        {
            System.out.println(Cart.get(i));
        }
    }
    @Override
    void Sign_Up() {
    }

    @Override
    void Log_in() {
        
    }
    
}
