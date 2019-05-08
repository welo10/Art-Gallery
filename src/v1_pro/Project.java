/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_pro;

import v1_pro.Classes.Gallery;
import v1_pro.Classes.Artist;
import v1_pro.Classes.Art_work;

/**
 *
 * @author mosta
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gallery g = new Gallery();
      //  g.Add(new Art_work());
       // g.Add(new Art_work(55,2,"asd","sda",34.5,new Artist()));
        for(int i = 0 ; i < g.ArtWorks.size();i++){
            
            System.out.println(g.ArtWorks.get(i).ID);
        }
        g.Remove(55);
        for(int i = 0 ; i < g.ArtWorks.size();i++){
            
            System.out.println(g.ArtWorks.get(i).toString());
        }
    }
    
}
