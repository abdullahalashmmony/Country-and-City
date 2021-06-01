package assignment.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdallah Omar
 */
public class City {
    String Code;   
    String Name;
    String Continent;
    int Population;
    int Area;

    public City(String code, String name, String continent, Integer population, Integer area)
{
    Code= code;
    Name= name;
    Continent=continent;
    Population = population;
    Area = area;        
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
    
    
    public String getContinent(){
        return Continent;
        
    }
    public void setContinent(String continent){
        Continent=continent;
    }
    
    
    
    public Integer getPopulation(){
        return Population;
        
    }
    public void setPopulation(int population){
        Population= population;
    }
    
    
    
    public Integer getArea(){
        return Area;
        
    }
    public void setArea(int area){
        Area=area;
    }
}
