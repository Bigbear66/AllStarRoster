
// AllStarRoster.java
// by Eldin Pita
// CSCI 1302
// Lab 1
// 02/05/2020


public class AllStarRoster {
    public static void main(String[] args) {

        HockeyPlayer[] players = new HockeyPlayer[6];

        players[0] = new HockeyPlayer("Sidney Crosby", "Penguins", 250000);

        players[1] = new HockeyPlayer("Jaromir Jagr", "Penguins", 250000);

        players[2] = new HockeyPlayer("Wayne Gretzky", "Kings", 1270300);

        players[3] = new HockeyPlayer("Bobby Orr", "Bruins", 2776120);

        players[4] = new HockeyPlayer("Doug Glatt", "Flyers", 4158960);

        players[5] = new HockeyPlayer("Mario Lemieux", "Penguins", 2500000);


        for(int i = 0; i < 6; i++)
            players[i].print();
    }
}