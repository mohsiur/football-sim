/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win7
 */
public class Goalkeeper extends Player {
    public int reflexes;
    public int onevsone;
    public int aerial;
    
    public Goalkeeper(){
        
    }
    
    public Goalkeeper(String FirstName, String LastName, String Position, int age, int reflexes, int onevsone, int aerial){
        super(FirstName, LastName, Position, age);
        this.reflexes=reflexes;
        this.onevsone=onevsone;
        this.aerial=aerial;
    }
    
    public int getAerial(){
        return this.aerial;
    }
    public int getOnevsOne(){
        return this.onevsone;
    }
    public int getReflexes(){
        return this.reflexes;
    }

}
