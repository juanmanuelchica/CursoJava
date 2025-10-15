
package salario_del_heroe;

/**
 *
 * @author Juan Manuel Chica
 */
public class Salario_del_heroe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     int salario=2000000;
     double descuentoSalud=salario*0.4;
     double descuentoPension=salario*0.5;
     double SaldoFinal;
     SaldoFinal=descuentoSalud + descuentoPension;
     System.out.print("Tu saldo final es de "+ SaldoFinal +" ¡Preparate para tu proxima aventura!");
        
        
    }
    
}
