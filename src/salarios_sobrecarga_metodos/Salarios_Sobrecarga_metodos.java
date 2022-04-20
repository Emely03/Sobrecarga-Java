/* Hacer una aplicacion que calcule el salario neto de una persona si 
   este se puede hallar de tres maneras diferentes:
 - A termino indefinido (se le saca deducciones y puede tener auxilio 
   de transporte
 - Prestacion de servicios (No tiene prestaciones pero el empleado 
   debe pagar su propia seguridad social)
 - Salario integral (debe ganar mas de 10 salarios minimos vigentes)
 Los datos de entrada son las horas trabajadas y el valor de la hora */
package salarios_sobrecarga_metodos;

import java.util.Random;
import java.util.Scanner;

public class Salarios_Sobrecarga_metodos {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objleer=new Scanner(System.in);
        ClsSalarios objsalarios=new ClsSalarios();
        float sal_neto=0,val_hora;
        int nro_horas,opc=10;
        
        //Lectura de datos
        System.out.print("¿Cual es el numero de horas? ");
        nro_horas=objleer.nextInt();
        System.out.print("¿Cual el valor de la hora? ");
        val_hora=objleer.nextFloat();
        
        //Menu de operaciones
        while (opc != 4){
            System.out.println("\n\n\t Menu principal");
            System.out.println("1. Contrato a termino indefinido");
            System.out.println("2. Contrato por prestacion de servicios");
            System.out.println("3. Contrato salario integral");
            System.out.println("4. Salir");
            System.out.print("Seleccione entre uno y cuatro ");
            opc=objleer.nextInt();
            switch (opc) {
                case 1:sal_neto=objsalarios.Hallar_salario_neto(val_hora,(float)val_hora); 
                    break;
                case 2:sal_neto=objsalarios.Hallar_salario_neto(nro_horas, val_hora);
                    break;
                case 3:sal_neto=objsalarios.Hallar_salario_neto(val_hora, nro_horas);
                       if (sal_neto == 0)
                           System.out.println("\n No puede ser un salario integral");
                       break;
            }//fin caso
            System.out.println("\n El salario neto es " + sal_neto);
        } //fin mientras
        
    }    
}
