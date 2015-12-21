/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author win7
 */
public class Defender extends Player {
    public int heading;
    public int tackling;
    public int marking;
    
    public Defender(){
        
    }
    public Defender(String FirstName, String LastName, String Position, int age, int heading, int tackling, int marking){
        super(FirstName, LastName, Position, age);
        this.heading = heading;
        this.tackling = tackling;
        this.marking = marking;
    }
    
    public void setHeading(int heading){
        this.heading=heading;
    }
    
    public int getHeading(){
        return this.heading;
    }
    
    public void setTackling(int tackling){
        this.tackling=tackling;
    }    
    public int getTackling(){
        return this.tackling;
    }
    
    public void setMarking(int marking){
        this.marking=marking;
    }
    public int getMarking(){
        return this.marking;
    }
}
