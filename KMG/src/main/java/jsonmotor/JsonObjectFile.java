/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmotor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class JsonObjectFile {
    
    public ArrayList<JsonValue> object;

    public JsonObjectFile( String file ) throws Throwable{
        try {
            update(file);
        } catch (Exception e) {
            this.finalize();
        }
    }
    
    public void update(String file) throws IOException {
        java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.FileReader(file));
        String ln, key, value;
        
        while((ln=bf.readLine()) != null)
            if(ln.contains(":")){
                key = ln.substring(ln.indexOf("\"")+1 ,ln.indexOf(":")+2);
                value = ln.substring(ln.indexOf(":")+2 ,ln.lastIndexOf("\""));
                object.add(new JsonValue(key, value));
            }
        bf.close();
    }
    
    public String getProp(String key){
        for (JsonValue jsonValue : object) 
            if( jsonValue.key.endsWith(key) )
                return jsonValue.value;
        
        return null;
    }
    
    
}
