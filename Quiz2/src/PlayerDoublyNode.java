public class PlayerDoublyNode {
    private Player player;
    private PlayerDoublyNode nextPlayer;
    private PlayerDoublyNode prevPlayer;

    public PlayerDoublyNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerDoublyNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerDoublyNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public PlayerDoublyNode getPrevPlayer() {
        return prevPlayer;
    }

    public void setPrevPlayer(PlayerDoublyNode prevPlayer) {
        this.prevPlayer = prevPlayer;
    }
}