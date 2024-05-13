package technoHacks;

import java.util.*;

public class task4 {
    /*
     * Simple To-Do List
     * Build a program that allows users to add,
     * remove, and view items on a to-do list.
     */

    public static void main(String [] args){
        try(Scanner scanner = new Scanner(System.in)){
            ArrayList <Integer> toDoList = new ArrayList<>();

            boolean flag = true;
        while(flag){
            //choices
            System.out.println("---------------------------");
            System.out.println("Simple to do list:");
            System.out.println("1. Add to list");
            System.out.println("2. Remove from list");
            System.out.println("3. View list");
            System.out.println("4. Exit ");
            System.out.println("---------------------------");
            System.out.println("enter the number of your choice:");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                        System.out.println("add to list:");
                        System.out.println("please enter the number of items you need to add to list:");
                        int itemsNum = scanner.nextInt();
                        
                        for(int i = 0 ; i < itemsNum ; i++){
                            System.out.print("enter item # "+ (i+1) +" : ");
                            int item = scanner.nextInt();
                            toDoList.add(item);
                        }
                        System.out.println("item added to the list");
                        break;
                case 2:
                        System.out.println("Remove from the list:");
                        if(toDoList.isEmpty()){
                            System.out.println("sorry,the list is empty");
                        }else{
                            System.out.println("enter te index of the item you want to remove: ");
                            int index = scanner.nextInt();
                            if(index > 0 && index < toDoList.size()){
                                int removedItem = toDoList.remove(index);
                                System.out.println("the item [ "+removedItem +" ] has been removed");
                            }else{
                                System.out.println("ivalid index number");
                            }
                        }
                        break;
                case 3:
                        System.out.println("view list:");
                        /*for (int i : toDoList) {
                            System.out.println(i);
                        }*/
                        for(int i = 0 ; i < toDoList.size();i++){
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        break;
                case 4:
                        System.out.println("Exiting program.");
                        scanner.close();
                        System.exit(0);
                        break;

                default:
                        System.out.println("invalid choise,please enter a number from 1 to 4");

            }
            System.out.println("---------------------------");
            System.out.println("do you want to continue [yes / no]");
            String choose = scanner.next();
            flag = choose.equalsIgnoreCase("yes");
            if (choose.equalsIgnoreCase("no")) {
                System.out.println("GOOD BYE!");
            }
        }
        }
    }
}
