/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author win7
 */
public class Player {
    public String FirstName;
    public String LastName;
    public String Position;
    public int age;
    
    public Player(){
    }
    
    public Player(String FirstName, String LastName, String Position, int age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Position = Position;
        this.age = age;
    }
    
    public String getFirstName(){
        return this.FirstName;
    }
        
    public String getLastName(){
        return this.LastName;
    }
    
    public String getPosition(){
        return this.Position;
    }
    
    public int getAge(){
        return this.age;
    }
    
}
