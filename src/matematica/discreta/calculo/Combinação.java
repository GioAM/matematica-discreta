package matematica.discreta.calculo;

/**
 * @author giovani.meneguel && leticia.may
 */

public class Combinação {
    public String  comb(String value1, String value2){
        try{
            Fatorial fab = new Fatorial();
            int aux1 = Integer.parseInt(value1);
            int aux2 = Integer.parseInt(value2);
            int diff = aux1 - aux2;
            int total;
            total = Integer.parseInt(fab.fat(value1)) /(Integer.parseInt(fab.fat(value2)) * Integer.parseInt(fab.fat(Integer.toString(diff))));
            return Integer.toString(total);
        }catch(NumberFormatException e){
            return "Entrada inválida";
        }
    }
}
