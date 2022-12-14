import java.util.Scanner;

public class Board {
    private Player player1, player2, player3, hiddenCards;

    public Board(){
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        hiddenCards = new Player();
    }

    public void distributeCards(int[] myCards){
        Integer[][] rateTable = player1.getRateTable();
        for(int card: myCards){
            rateTable[card/10][card%10] = 0;
        }
        player1.setRateTable(rateTable);
        player2.setRateTable(rateTable.clone());
        player3.setRateTable(rateTable.clone());
        hiddenCards.setRateTable(rateTable.clone());
    }

    public void updateRateEqualCard(int card){
        for(int i=1;i<5;i++){
            int equalCard = i*10 + card%10;
            if(equalCard != card){

            }
        }
    }

    public void showCard(Player player, int card){
        player.setNumOfCards(player.getNumOfCards()-1);
        Integer[][] rateTable = player.getRateTable();


        rateTable[card/10][card%10]
    }


}
