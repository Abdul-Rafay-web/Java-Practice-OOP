package JavaPractice.RPGSimulator;

public class Team <T extends Character>implements Comparable<T>{
    Character[] players;
    private int characterCount = 0;

    public Team() {
        this.players = new Character[3];
    }
    public void addPlayer(Character c) {
        if (characterCount < players.length) {
            players[characterCount] = c;
            characterCount++;
        } else {
            System.out.println("You cannot add more Players");
        }
    }
    public void removeDeadPlayer(Character player){
        Character[] newPlayers=new Character[players.length-1];
        int newIndex=0;
        for (int i=0;i< players.length;i++){
            if (!players[i].equals(player)){
                newPlayers[newIndex]=players[i];
                newIndex++;
            }
        }
        players=newPlayers;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
