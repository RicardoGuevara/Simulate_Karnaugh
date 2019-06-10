/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonmotor;

/**
 *
 * @author Administrador
 */
public class JsonValue {
    public String   key,    //Json value key
                    value;  //Json value content

    public JsonValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    
}
