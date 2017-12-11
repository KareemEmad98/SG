package GUI;

import Units.Builder;
import Units.Population;
import Units.Resources;
import Units.TownHall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author hp
 */
public class Player {
    Resources R;
    TownHall T;
    Builder B;
    Population P;
    public Player() {
        R=new Resources();
        T=new TownHall();
        B=new Builder();
        P=new Population();
    }
    
    
    
}
