    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_pro.Classes;

import java.util.*;
/**
 *
 * @author mosta
 */
public class Gallery {
  static public ArrayList<Art_work> ArtWorks=new ArrayList<Art_work>();
  static public ArrayList<Customer> Users=new ArrayList<Customer>();
  public static String CurrentUser;
  public static Art_work Currentart;
  public static int price=0;
    public Gallery() {
        
    }
     public static void AddArt( Art_work AddedItem)
    {
        ArtWorks.add(AddedItem);
    }
    public static void AddUser( Customer AddedItem)
    {
        Users.add(AddedItem);
    }
    
    public void Remove(int ID)
    {
        for(int i=0;i<ArtWorks.size();i++)
        {
           if(ArtWorks.get(i).ID==ID)
           {
             ArtWorks.remove(i);
           }
        }
    }
}
