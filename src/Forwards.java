/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win7
 */
public class Forwards extends Player{
    public int finishing;
    public int composure;
    public int dribbling;
    
    public Forwards(){
        
    }
    public Forwards(String FirstName, String LastName, String Position, int age, int finishing, int composure, int dribbling){
        super(FirstName, LastName, Position, age);
        this.finishing=finishing;
        this.composure=composure;
        this.dribbling=dribbling;
    }
    
    public int getFinishing(){
        return this.finishing;
    }
    
    public int getComposure(){
        return this.composure;
    }
    
    public int getDribbling(){
        return this.dribbling;
    }
    
    
}
