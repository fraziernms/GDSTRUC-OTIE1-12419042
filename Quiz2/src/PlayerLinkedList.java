public class PlayerLinkedList {
    private PlayerNode head;
    private int count = 0;

    public void add(Player player) {
        PlayerNode node = new PlayerNode(player);
        node.setNextPlayer(head);
        head = node;
        count++;
    }

    public Player removeFirst() {
        if (head == null) {
            return null;
        }
        Player removedPlayer = head.getPlayer();
        head = head.getNextPlayer();
        count--;
        return removedPlayer;
    }

    public int size() {
        return count;
    }

    public boolean contains(Player player) {
        PlayerNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getPlayer().equals(player)) {
                return true;
            }
            currentNode = currentNode.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getPlayer().equals(player)) {
                return index;
            }
            currentNode = currentNode.getNextPlayer();
            index++;
        }
        return -1;
    }

    public void printList() {
        PlayerNode currentNode = head;
        System.out.print("HEAD");

        while (currentNode != null) {
            System.out.print(" -> " + currentNode.getPlayer());
            currentNode = currentNode.getNextPlayer();
        }
        System.out.println(" -> NULL");
    }
}