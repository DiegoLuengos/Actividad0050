
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    public int multiplicacionEntera(int factor1, int factor2)
    {
        int resultado = 0;
        int cont = 0;
        while (cont != factor2) {
            resultado += factor1;
            cont += 1;
        }
        return resultado;
    }
    
    public int divisionEntera(int dividendo, int divisor)
    {
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
            cociente ++;
        }
        return cociente;
    }
    
    public int moduloEntero(int dividendo, int divisor)
    {
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
        }
        return dividendo;
    }
    
    public int potenciaEntera(int raiz, int exponente)
    {
        int potencia = raiz;
        exponente = exponente -1;
        while (exponente >= 1) {
            potencia = multiplicacionEntera (raiz , potencia);
            exponente = exponente -1;
        }
        return potencia;
    }
}
