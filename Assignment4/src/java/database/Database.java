/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import models.User;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author mario
 */
public class Database {
    
    
    //Devuelve ruta donse se encuentra el archivo JSON
    private static String getPathDatabase() {
        return "Assignment4/src/java/database/JSON.json";
    }
    
    
    //Devuelve true|false
    //En función si se creó o no el usuario en el archivo JSON
    private static boolean setJsonObject(String name, String lastName, String username, String password) {
         JSONObject obj = new JSONObject();

	//Solo guarda un valor
        obj.put("name", name);
        obj.put("lastName", lastName);
        obj.put("username", username);
        obj.put("password", password);

            String rutaJson = getPathDatabase(); //llamada a método anterior

        try (FileWriter file = new FileWriter(rutaJson)) {
            file.write(obj.toJSONString());

            return true;
        }
        catch(IOException ioext) {
            return false;
        }
    }
    
    private static JSONObject getJsonObject() {

        try {
            String rutaJson = getPathDatabase();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(rutaJson));

            JSONObject jsonObject =  (JSONObject) obj;

            return jsonObject;
        }
        catch(IOException ioext) {
            return null;
        }
        catch(ParseException pext) {
            return null;
        }
    }
    


    //Devuelve true|false en caso de crearse o no, el usuario.
    public static boolean setUser(String name, String lastName, String username, String password) {

	boolean isSetup = setJsonObject(name, lastName, username, password);

	return isSetup;
    }    
    
    
    //Devuelve un objeto de tipo User con la información del archivo JSON
    //Username
    public static User getUserByUsername(String username) {
        User user;

        JSONObject jsonObject = getJsonObject(); //llama a método anterior

        if(jsonObject != null) {
            String usernameDb = (String) jsonObject.get("username");
            String nameDb = (String) jsonObject.get("name");
            String lastNameDb = (String) jsonObject.get("lastName");
            String passwordDb = (String) jsonObject.get("password");
            
         
		//Valida si el usuario que se pide es igual al que se encuentra
		//en el archivo JSON
            if(username.equals(usernameDb)) {
                user = new User(nameDb, lastNameDb, usernameDb, passwordDb); //Completar con todas las propiedades del usuario
            }else {
                user = null;
            }

            return user;
        }else{
            return null;
        }
    }

    
    

    //Devuelve un objeto de tipo User con la informacion del archivo JSON
    //Password
    public static User getUserByUsernamePassword(String username, String password){
    User user;

    JSONObject jsonObject = getJsonObject(); //Llamáda a método

        if(jsonObject != null) {
            String usernameDb = (String) jsonObject.get("username");
            String passwordDb = (String) jsonObject.get("password");

            	//Validar password y usuario
		//passwordDb no existe en este contexto. Usar el ejemplo de propiedadDb
            if(username.equals(usernameDb) && password.equals(passwordDb)) {
                user = new User(name, lastName, usernameDb, password); //Completar con propiedades para construir objeto
            }else {
                user = null;
            }
            
            

            return user;
            }else{
                return null;
        }
    }


    
  //fin de la clase Database
}
