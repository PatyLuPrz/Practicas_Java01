package p05;
public class P05 
{
    public static void main(String[] args) 
    {
        byte bmin=-128, bmax=127;
        short smin=-32768, smax=32767;
        int imin=-2147483648, imax=2147483647;
        long lmin=-9223372036854775808L, lmax=-9223372036854775807L;
        boolean bomin=false, bomax=true;
        double dmin=1.79769313486231570E+308, dmax=4.94065645841246544E-324;
        System.out.println("byte\nValor maximo: "+bmax+"\nValor minimo: "+bmin);
        System.out.println("short\nValor maximo: "+smax+"\nValor minimo: "+smin);
        System.out.println("int\nValor maximo: "+imax+"\nValor minimo: "+imin);
        System.out.println("long\nValor maximo: "+lmax+"\nValor minimo: "+lmin);
        System.out.println("boolean\nValor maximo: "+bomax+"\nValor minimo: "+bomin);
        System.out.println("double\nValor maximo: "+dmax+"\nValor minimo: "+dmin);
        
        
    }
    
}
