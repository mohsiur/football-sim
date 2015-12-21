/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author win7
 */
public class Midfielder extends Player{
    public int passing;
    public int creativity;
    public int LongShots;
    
    public Midfielder(){
        
    }
    public Midfielder(String FirstName, String LastName, String Position, int age, int passing, int creativity, int LongShots){
        super(FirstName, LastName, Position, age);
        this.passing=passing;
        this.creativity=creativity;
        this.LongShots=LongShots;
    }
    
    public int getCreativity(){
        return this.creativity;
    }
    public int getPassing(){
        return this.passing;
    }
    public int getLongShots(){
        return this.LongShots;
    }

}
