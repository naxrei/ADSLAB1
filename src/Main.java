import java.util.Scanner;

public class Main {
    public static void connectModuleFromPrompt() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        int task = sc.nextInt();
        // load modules depending on user input
        switch (task) {
            case -1:
                System.exit(0);
            case 1:
                task1.main();
                break;
            case 2:
                task2.main();
                break;
            case 3:
                task3.main();
                break;
            case 4:
                task4.main();
                break;
            case 5:
                task5.main();
                break;
            case 6:
                task6.main();
                break;
            case 7:
                task7.main();
                break;
            case 8:
                task8.main();
                break;
            case 9:
                task9.main();
                break;
            case 10:
                task10.main();
                break;
            default:
//                is something wrong with input - ask again
                System.out.println("Out choose task outside of the range!");
                connectModuleFromPrompt();
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello, Teacher! Please, choose task number to check:");
        for(int i = 1; i<=10; i++) System.out.println(i + ") Task " + i);
        System.out.println("Type -1 to exit"); // printing tasks for selecting
        connectModuleFromPrompt();
    }
}