class Prueba0
{
    private int n1;
    private int n2=5;

    public int getN1()
    {
        return this.n1;
    }    
    public int getN2()
    {
        return this.n2;
    }
    public void setN1(int n1)
    {
        this.n1=n1;
    }
    public void setN2(int n2)
    {
        this.n2=n2;
    }
    public static void main (String [] args)
    {
        Prueba0 objeto0 = new Prueba0();
        objeto0.setN1(6);
        objeto0.setN2(7);

        System.out.println(""+(objeto0.getN1()+objeto0.getN2()));
    }
}