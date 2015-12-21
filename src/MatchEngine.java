/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author win7
 */
public class MatchEngine {
    
    public Defender d1, d2, d3, d4, d5, d6, d7, d8;
    public Midfielder m1, m2, m3, m4, m5, m6, m7, m8;
    public Goalkeeper g1, g2;
    public Forwards f1, f2, f3, f4;

    //public double avgReflexes1, avgReflexes2, avgAerial1, avgAerial2, avgOnevsOne1, avgOnevsOne2, avgHeading1, avgHeading2, avgTackling1, avgTackling2, avgMarking1, avgMarking2, avgPassing1, avgPassing2, avgCreativity1, avgCreativity2, avgLongshots1, avgLongshots2, avgFinishing1, avgFinishing2, avgComposure1, avgComposure2, avgDribbling1, avgDribbling2;
    public int team1goal = 0;
    public int team2goal = 0;
    public int time;
    
    public MatchEngine(Goalkeeper g1, Defender d1, Defender d2, Defender d3, Defender d4, Midfielder m1, Midfielder m2, Midfielder m3, Midfielder m4, Forwards f1, Forwards f2,Goalkeeper g2, Defender d5, Defender d6, Defender d7, Defender d8, Midfielder m5, Midfielder m6, Midfielder m7, Midfielder m8, Forwards f3, Forwards f4){
        //Team 1
        this.g1=g1;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.f1=f1;
        this.f2=f2;
        //Team 2
        this.g2=g2;
        this.d5=d5;
        this.d6=d6;
        this.d7=d7;
        this.d8=d8;
        this.m5=m5;
        this.m6=m6;
        this.m7=m7;
        this.m8=m8;
        this.f3=f3;
        this.f4=f4;
    }
    
    public void score(){
        
        for(int i=0; i<25; i++){
            int g = 0 + (int)(Math.random()*((1-0)+1));//g sees which team gets the ball
            int pass = 0;
            int finalthird = 0;
            int goal = 0;
            int corner = 0;
            int longshots = 0;
            if(g==1){
                pass = 0 +(int)(Math.random()*((1-0)+1));
                switch(pass){
                    case 0: break;
                    case 1: 
                            if(m6.getPassing()>d2.getMarking() || m7.getPassing()>d3.getMarking()){
                                if(m5.getCreativity()>d1.getMarking() || m8.getCreativity()>d4.getMarking()){
                                    finalthird = 0 + (int)(Math.random()*((1-0)+1));
                                    switch(finalthird){
                                        case 0: 
                                            break;
                                        case 1: 
                                                goal = 0 +(int)(Math.random()*((1-0)+1));
                                                if(goal==1){
                                                    if(f3.getDribbling()>d2.getTackling() || f4.getDribbling()>d3.getTackling()){
                                                        if(f3.getFinishing()>g1.getReflexes() || f4.getFinishing()>g1.getReflexes() || f3.getComposure()>g1.getOnevsOne() || f4.getComposure()>g1.getOnevsOne()){
                                                            team2goal = team2goal+1;
                                                        }
                                                        else{
                                                            corner= 0 + (int)(Math.random()*((1-0)+1));
                                                            longshots = 0 +(int)(Math.random()*((1-0)+1));
                                                            if(corner == 1){
                                                                if(d6.getHeading()>g1.getAerial() || d7.getHeading()>g1.getAerial()){
                                                                    team2goal = team2goal+1;
                                                                }
                                                            }
                                                            else if(longshots == 1){
                                                                if(m6.getLongShots()>g1.getReflexes() || m7.getLongShots()>g1.getReflexes()){
                                                                    team2goal = team2goal +1;
                                                                }
                                                            }
                                                            else{
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else{
                                                        corner= 0 + (int)(Math.random()*((1-0)+1));
                                                        longshots = 0 +(int)(Math.random()*((1-0)+1));
                                                        if(corner == 1){
                                                            if(d6.getHeading()>g1.getAerial() || d7.getHeading()>g1.getAerial()){
                                                                team2goal = team2goal+1;
                                                            }
                                                        }
                                                        else if(longshots == 1){
                                                            if(m6.getLongShots()>g1.getReflexes() || m7.getLongShots()>g1.getReflexes()){
                                                                team2goal = team2goal +1;
                                                            }
                                                        }
                                                        else{
                                                            break;
                                                        }
                                                    }
                                                }
                                                else{
                                                    break;
                                                }
                                    }
                                }
                                else{
                                    break;
                                }
                            }
                            else{
                                break;
                            } 
                }
            }
            else if(g==0){
                pass = 0 +(int)(Math.random()*((1-0)+1));
                switch(pass){
                    case 0: break;
                    case 1: 
                            if(m2.getPassing()>d6.getMarking() || m3.getPassing()>d7.getMarking()){
                                if(m1.getCreativity()>d5.getMarking() || m4.getCreativity()>d8.getMarking()){
                                    finalthird = 0 + (int)(Math.random()*((1-0)+1));
                                    switch(finalthird){
                                        case 0: 
                                            break;
                                        case 1: 
                                                goal = 0 +(int)(Math.random()*((1-0)+1));
                                                if(goal==1){
                                                    if(f1.getDribbling()>d6.getTackling() || f2.getDribbling()>d7.getTackling()){
                                                        if(f1.getFinishing()>g2.getReflexes() || f2.getFinishing()>g2.getReflexes() || f1.getComposure()>g2.getOnevsOne() || f2.getComposure()>g2.getOnevsOne()){
                                                            team1goal = team1goal+1;
                                                        }
                                                        else{
                                                            corner= 0 + (int)(Math.random()*((1-0)+1));
                                                            longshots = 0 +(int)(Math.random()*((1-0)+1));
                                                            if(corner == 1){
                                                                if(d2.getHeading()>g2.getAerial() || d3.getHeading()>g2.getAerial()){
                                                                    team1goal = team1goal+1;
                                                                }
                                                            }
                                                            else if(longshots == 1){
                                                                if(m2.getLongShots()>g2.getReflexes() || m3.getLongShots()>g2.getReflexes()){
                                                                    team1goal = team1goal +1;
                                                                }
                                                            }
                                                            else{
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else{
                                                        corner= 0 + (int)(Math.random()*((1-0)+1));
                                                        longshots = 0 +(int)(Math.random()*((1-0)+1));
                                                        if(corner == 1){
                                                            if(d2.getHeading()>g2.getAerial() || d3.getHeading()>g2.getAerial()){
                                                                team1goal = team1goal+1;
                                                            }
                                                        }
                                                        else if(longshots == 1){
                                                            if(m2.getLongShots()>g2.getReflexes() || m3.getLongShots()>g2.getReflexes()){
                                                                team1goal = team1goal +1;
                                                            }
                                                        }
                                                        else{
                                                            break;
                                                        }
                                                    }
                                                }
                                                
                                    }
                                }
                                else{
                                    break;
                                }
                            }
                            else{
                                break;
                            } 
                }
            }
        }
    }
    
    
    public int getTeam1Score(){
        return this.team1goal;
    }
    
    public int getTeam2Score(){
        return this.team2goal;
    }
}
