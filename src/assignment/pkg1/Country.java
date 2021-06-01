/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author abdal
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdallah Omar
 */
public class Country {

    String Code;
    String Name;
   
      
    public Country(String code , String name){
    Code=code;  
    Name=name;
        
    }

   
    
    
    public String getCode(){
        return Code;
    }
    public void setCode(String code){
        Code=code;
    }
    public String getName(){
        return Name;
    }
    
    public void setName(String name){
        Name=name;
       }
}
