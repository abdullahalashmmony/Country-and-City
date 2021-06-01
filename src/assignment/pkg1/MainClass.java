package assignment.pkg1;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdallah Omar
 */
 class comparison implements Comparator<City>{

        @Override
        public int compare(City o1, City o2) {
            return o1.getPopulation().compareTo(o2.getPopulation());

        }
        
        
    }

public class MainClass {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static List<City> sort(List<City>citylist){
        
        citylist.sort(new comparison());
        return citylist;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
       
       
        
        File CountryFile =new File("country.csv");
        File CityFile = new File("city.csv");
        
        List<String> countryLines = new ArrayList <>();
        List<String> cityLines = new ArrayList<>();
        List<Country> countryList =new ArrayList<>();
        List<City> cityList =new ArrayList<>();
        Map<String,List<City>> map=new HashMap<>();
        
        //Map<String,List<Country>> map=new HashMap<>();
        try {
            
            countryLines = Files.readAllLines(CountryFile.toPath());
            cityLines = Files.readAllLines(CityFile.toPath());

        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            
        }
   
            
        
        
        for(int i=0; i<countryLines.size(); i++){
            
            String Lines= countryLines.get(i);
            String[] splited =Lines.split(",");
            countryList.add(new Country(splited[0],splited[1]));
            
        
        }
        
        for(int i=0; i<cityLines.size(); i++){
            
            String Lines= cityLines.get(i);
            String[] splited =Lines.split(",");
            City myCities = new City(splited[0],splited[1],splited[2],Integer.parseInt(splited[3]),Integer.parseInt(splited[4]));
            cityList.add(myCities);
        
        }
        
        for(int i=0 ; i<countryList.size(); i++){
            map.put(countryList.get(i).getCode(),new ArrayList<>());
            
            
        }
        
        for(int i=0; i<cityList.size();i++){
           // System.err.println(cityList.get(i).Code);
            map.get(cityList.get(i).Code);
            map.get(cityList.get(i).Code).add(cityList.get(i));
            map.put(cityList.get(i).Code,map.get(cityList.get(i).Code));
            
        }
        
        List<City> sorted_List;
        sorted_List = sort(map.get("1000"));
           System.out.println(sorted_List);
    }
     
    
    
}
