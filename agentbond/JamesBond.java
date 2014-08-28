/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unalcol.agents.examples.labyrinth.teseo.agentbond;

import static java.lang.Math.random;
import unalcol.agents.examples.labyrinth.teseo.simple.*;

/**
 *
 * @author Jonatan
 */
public class JamesBond extends SimpleTeseoAgentProgram {

    int RandomFrom(Integer... values){

        int myRand = (int)(Math.random() * (values.length - 0) + 0);
        return values[myRand];
    }
    
    public JamesBond() {}
    @Override
    public int accion(boolean PF, boolean PD, boolean PA, boolean PI, boolean MT) {
        
        if (MT) return -1;
        
        // DEVUELVASE POR QUE ESTA CERRADO
        if(PF&&PD&&PI){
            return 2;
        }
        
        //CASOS MULTIPLES
        //CASO 1; SE PUEDE ADELANTE O DERECHA
        if(!PF&&!PD){
            return RandomFrom(0,1);
        }
        //CASO 1; SE PUEDE ADELANTE O IZQUIERDA
        if(!PF&&!PI){
            return RandomFrom(0,3);
        }
        //CASO 1; SE PUEDE IZQUIERDA O DERECHA
        if(!PI&&!PD){
            return RandomFrom(1,3);
        }
        //CASO 1; SE PUEDE ADELANTE O DERECHA O IZQUIERDA
        if(!PF&&!PD&&!PI){
            return RandomFrom(0,1,3);
        }
        
        //GIRAR IZQUIERDA POR QUE NO HAY MAS
        if(PD&&PF){
            return 3;
        }
        
        //GIRAR DERECHA POR QUE NO HAY MAS
        if(PI&&PF){
            return 1;
        }
        //AVANZE SI NO hAY NADA MAS
        return 0;
    }
    
}
