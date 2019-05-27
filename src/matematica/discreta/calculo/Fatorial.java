package matematica.discreta.calculo;

/**
 * @author giovani.meneguel && leticia.may
 */
public class Fatorial {
    public String  fat(String value1){
        try{
            int aux1 = Integer.parseInt(value1);
            int  fat = 1;
            for( int i = 2; i <= aux1 ; i++ ){ 
                fat *= i;
            }
            return Integer.toString(fat);
        }catch(NumberFormatException e){
            return "Entrada inválida";
        }
    }
}
