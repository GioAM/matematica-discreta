/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author giovani.meneguel
 */
public class Fatorial {
    String n1;
    
    public Fatorial(String n1){
        this.n1 = n1;
    }

    String  fat(){
        int aux1 = Integer.parseInt(n1);
        int  fat=1;
	for( int i = 2; i <= aux1 ; i++ )
        { 
            fat *= i;
        }
        String somaAux = Integer.toString(fat);
        return somaAux;
    }
}
