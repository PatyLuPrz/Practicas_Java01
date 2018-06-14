public class Examen{
    private float numero1;
    private float numero2;
    public float getNumero1(){
        return this.numero1;
    }
    public void setNumero1(float numero1){
        this.numero1=numero1;
    }
    public float getNumero2(){
        return this.numero2;
    }
    public void setNumero2(float numero2){
        this.numero2=numero2;
    }

    public float suma(){
        return numero1+numero2;
    }
    public float resta(){
        return numero1-numero2;
    }
    public static void main(String [] argumentos){
        Examen objeto1 = new Examen();
        objeto1.setNumero1(23F);
        objeto1.setNumero2(23F);
        System.out.println(objeto1.suma());
        System.out.println(objeto1.resta());
    }
}
