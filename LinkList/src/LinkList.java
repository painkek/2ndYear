import java.util.*;


public class LinkList {

    static Scanner sc = new Scanner(System.in);
    static LinkedList <Integer> list = new LinkedList<Integer>(); //creating list

    public static void main(String[] args) {

        
        System.out.print("Enter how many elements -> ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            System.out.print("Enter element at index " + i + ": ");
            list.add(sc.nextInt());
        }
        System.out.println("Elememts: " + list);
        userchoices(num);
    }  
    public static void userchoices (int num){
        System.out.println("------------------ Choose Method ------------------");
        System.out.println(" 1. Insert " +
                        "\n 2. Delete " +
                        "\n 3. Exit");
                        int ui = sc.nextInt();
        if(ui == 1){
            insert(num);
        }else if (ui == 2){
            delete(num);
        }else if (ui == 3){
            exit();
        }                 
    }
    public static void insert(int num){
        System.out.println("----------------------------------------");
		System.out.print("Enter the position you want to inser: ");
		int x = sc.nextInt();
		System.out.print("Enter the new number: ");
		int y = sc.nextInt();
		list.add(x, y);
		System.out.println(list);
    }
    public static void delete(int num){
        System.out.println("Enter position to delete: ");
        int ui = sc.nextInt();
        list.remove(ui);
        System.out.print(list);
    }
    public static void exit(){
        System.out.println("Thank you for using the program!");
        sc.close();
    }
}