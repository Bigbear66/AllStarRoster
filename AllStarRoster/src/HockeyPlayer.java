
// HockeyPlayer.java
// by Eldin Pita
// CSCI 1302
// Lab 1
// 02/05/2020



public class HockeyPlayer extends ProPlayer {
    private String teamName;

    private int bonus;

    public HockeyPlayer(String pname, String tname, int bonus1 )
    {
        super(pname);
        teamName = tname;
        bonus = bonus1;
    }
    @Override
    public int computePay() {
        return getBaseSalary() + bonus;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.print(" plays for the " + teamName + " and makes " + computePay() + " a year.\n");
    }
}