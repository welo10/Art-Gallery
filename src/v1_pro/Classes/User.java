/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1_pro.Classes;

/**
 *
 * @author mosta
 */
abstract public class User
{
  private String Name;
  private String Password;
  
  public User()
  {
  
  }

    public User(String Name, String Password) {
        this.Name = Name;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
abstract void Sign_Up();
abstract void Log_in();
}
