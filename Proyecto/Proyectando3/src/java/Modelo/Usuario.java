/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mario
 */
public class Usuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String pass;
    private String privilegio;
    
    public Usuario(){
    }
    
    public Usuario(String nickname, String nombre,
            String apellido, String pass, String privilegio){
    
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pass = pass;
        this.privilegio = privilegio;
        
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() < 2){
        this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if(apellido.length() < 2){
        this.apellido = apellido;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
      
}
