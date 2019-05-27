package matematica.discreta.calculo;

/**
 *
 * @author giovani.meneguel && leticia.may
 */
public final class Arranjo {
    private String value1;
    private String value2;
    
    public Arranjo(String value1, String value2){
        setValue1(value1);
        setValue2(value2);
    }
    public String  arranjo(){
         try{
            Fatorial fab = new Fatorial(); 
            int total;
            int aux1 = Integer.parseInt(getValue1());
            int aux2 = Integer.parseInt(getValue2());
            int diff = aux1 - aux2;  
            total = Integer.parseInt(fab.fat(getValue1())) / Integer.parseInt(fab.fat(Integer.toString(diff)));
            return Integer.toString(total);
         }catch(NumberFormatException e){
             return "Entrada inválida";
         }
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
}