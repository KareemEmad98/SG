/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class SG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        iMove[] x=new iMove[3];
        RocketSoldier z=new RocketSoldier();
        RifleMan y=new RifleMan();
        Builder f=new Builder();
        x[1]=z;
        x[2]=f;
        x[0]=y;
        for(int i=0;i<3;i++){
            x[i].Move();
        }
        User u=new User();
        u.add("Kareem", "Shehab");
        u.add("A7oosh", "Ba7oosh");
        System.out.println(u.search("A7oosh"));
        u.delete("Kareem");
        u.display();
    }
    
    
}
