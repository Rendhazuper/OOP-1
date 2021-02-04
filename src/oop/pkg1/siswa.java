/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.pkg1;

/**
 *
 * @author GAMES
 */
public class siswa {
     String nama; 
    int nilai; 
    
    
    
    void cetaknilai(){
        System.out.println("Nilai Produktif RPL 5 " +nama+ "adalah =" +nilai);
    }
    public boolean lulus (){
        return nilai >=75; 
        
    }
    public boolean tidaklulus(){ 
        return nilai <74; 
        
}
}


