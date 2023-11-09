
// ProPlayer.java
// by Eldin Pita
// CSCI 1302
// Lab 1
// 02/05/2020



public abstract class ProPlayer {

    protected String name;

    private int baseSalary = 1000000;

    public ProPlayer(String name1)
    {
        this.name = name1;
    }
    public int getBaseSalary()
    {
        return baseSalary;
    }
    public void print()
    {
        System.out.print(name);
    }
    public abstract int computePay();
}