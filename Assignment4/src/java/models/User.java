/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mario
 */
public class User {
    private String name;
    private String lastName;
    private String username;
    private String password;
    
    
    public User(){
    }
    
    public User(String name, String lastName, String username, String password){
      this.name = name;
      this.lastName = lastName;
      this.username = username;
      this.password = password; 
      
    }

    /*
    
    public User(String usernameDb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getUserName(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
}
