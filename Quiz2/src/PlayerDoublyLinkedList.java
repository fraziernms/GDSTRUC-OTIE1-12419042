public class PlayerDoublyLinkedList {
    private PlayerDoublyNode head;

    public void add(Player player) {
        PlayerDoublyNode node = new PlayerDoublyNode(player);
        node.setNextPlayer(head);

        if (head != null) {
            head.setPrevPlayer(node);
        }

        head = node;
    }

    public void printList() {
        PlayerDoublyNode currentNode = head;
        System.out.print("HEAD");

        while (currentNode != null) {
            System.out.print(" <-> " + currentNode.getPlayer());
            currentNode = currentNode.getNextPlayer();
        }
        System.out.println(" -> NULL");
    }
}