/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_pro.Classes;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Art_work extends Artist{
    public int ID;
    public String year;
    public String title;
    public String TypeOfArt;
    public int Prices;
    public Artist A;
    public ArrayList<String> Photos=new ArrayList<>();
    
    public Art_work ()
     {
         
         
     ID=0;
     year="";
     title="";
     TypeOfArt="";
     Prices=0;
     Photos=new ArrayList<String>();
     A=new Artist();
     }
    
    public Art_work (   int ID, String year, String title,String TypeOfArt,int Prices, Artist A    )
    {
        this.ID=ID;
    this.year=year;
    this.title=title;
    this.TypeOfArt=TypeOfArt;
    this.Prices=Prices;
    this.A=A;
    
    }
   public Art_work (   int ID, String year, String title,String TypeOfArt,int Prices )
    {
    this.ID=ID;
    this.year=year;
    this.title=title;
    this.TypeOfArt=TypeOfArt;
    this.Prices=Prices;    
    }
    public Art_work ( int ID, String year, String title,String TypeOfArt,int Prices,String photo )
    {
    this.ID=ID;
    this.year=year;
    this.title=title;
    this.TypeOfArt=TypeOfArt;
    this.Prices=Prices;    
    this.Photos.add(photo);
    }
      public Art_work ( int ID, String year, String title,String TypeOfArt,int Prices,String photo,String phot2,String photo3 )
    {
    this.ID=ID;
    this.year=year;
    this.title=title;
    this.TypeOfArt=TypeOfArt;
    this.Prices=Prices;    
    this.Photos.add(photo);
    this.Photos.add(phot2);
    this.Photos.add(photo3);
    }
      User us=new User() {

        @Override
        void Sign_Up() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void Log_in() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
      
}