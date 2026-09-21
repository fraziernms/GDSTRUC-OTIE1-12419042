public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLY LINKED LIST\n");
        PlayerLinkedList playerList = new PlayerLinkedList();

        Player goku = new Player(1, "Goku", 500);
        Player saitama = new Player(2, "Saitama", 999);
        Player sakamoto = new Player(3, "Sakamoto", 10);
        Player luffy = new Player(4, "Luffy", 300);

        playerList.add(goku);
        playerList.add(saitama);
        playerList.add(sakamoto);

        playerList.printList();

        System.out.println("\nList Size: " + playerList.size() + "\n");
        System.out.println("Check if Contains Specific Player");
        System.out.println("Contains Saitama? " + playerList.contains(saitama));
        System.out.println("Contains Luffy? " + playerList.contains(luffy));
        System.out.println("\nCheck Index of Specific Player");
        System.out.println("Index of Goku: " + playerList.indexOf(goku));

        Player removed = playerList.removeFirst();
        System.out.println("\nRemoved First Element: " + removed.getName());

        System.out.print("\nList after removal: ");
        playerList.printList();
        System.out.println("New Size: " + playerList.size());


        System.out.println("\nDOUBLY LINKED LIST BONUS");
        PlayerDoublyLinkedList doublyList = new PlayerDoublyLinkedList();

        Player heathcliff = new Player(1, "Heathcliff", 999);
        Player asuna = new Player(2, "Asuna", 800);
        Player lethalBacon = new Player(3, "LethalBacon", 150);
        Player hpDeskjet = new Player(4, "HPDeskjet", 50);

        doublyList.add(hpDeskjet);
        doublyList.add(lethalBacon);
        doublyList.add(asuna);
        doublyList.add(heathcliff);

        doublyList.printList();
    }
}