import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public int takeChoice(){
        System.out.println("--Safe Places--\n1-Home\n2-Shop");
        System.out.println("--Battle Locations--\n3-Forest\n4-Cave\n5-River");
        System.out.print("Choose where you want to go : ");
        int chooice = scanner.nextInt();
        return chooice;
    }
}
