/*Sobrecargar un metodo para hallar el salario neto */
package salarios_sobrecarga_metodos;

public class ClsSalarios {
    
    private float sal_neto,sal_basico;
    
    public float Hallar_salario_neto(float nrohoras, float valorhora){
        float deducciones,transporte=0;
        sal_basico=nrohoras * valorhora;
        if (sal_basico <= 4 * 1000000){
            deducciones= (sal_basico * 8)/100;
            if (sal_basico <= 2 * 1000000)
                transporte=117600;
        }
        else
            deducciones=(sal_basico * 9)/100;
        sal_neto=sal_basico - deducciones + transporte;
        return sal_neto;
    }
    
    public float Hallar_salario_neto(int nrohoras, float valorhora){
        sal_neto=nrohoras * valorhora;
        return sal_neto;
    }
    
    public float Hallar_salario_neto( float valorhora,int nrohoras){
        sal_basico=nrohoras * valorhora;
        if (sal_basico >= 10000000)
            sal_neto=sal_basico;
        else
            sal_neto=0; 
        return sal_neto;
    }
}
