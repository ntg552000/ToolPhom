import lombok.Data;

@Data
public class Board {
    private Player[] players = new Player[3];
    private Player cardInBoard;
    private int amountOfHiddenCards;

    public Board(){
        for(int i=0;i<3;i++){
            players[i] = new Player();
        }
        cardInBoard = new Player();
    }

    public void distributeCards(int[] myCards){
        Integer[][] rateTable = players[0].getRateTable();
        for(int card: myCards){
            rateTable[card/10][card%10] = 0;
        }
        for(Player player:players){
            player.setRateTable(rateTable.clone());
        }
        cardInBoard.setRateTable(rateTable);
    }

    public void updateRateEqualCard(Player player, int card){
        for(int i=1;i<5;i++){
            int equalCard = i*10 + card%10;
            if(equalCard != card){

            }
        }
    }

    public void showCard(Player player, int card){
        player.setNumOfCards(player.getNumOfCards()-1);
        Integer[][] rateTable = player.getRateTable();

    }


}
