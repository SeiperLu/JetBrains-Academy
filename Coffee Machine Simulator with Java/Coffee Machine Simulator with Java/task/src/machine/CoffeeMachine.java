package machine;
import java.util.Scanner;
class Coffees{
    public static final int waterPerEspressoCup = 250;
    public static final int coffeePerEspressoCup = 16;
    public static final int espressoCost = 4;

    public static final int waterPerLatteCup = 350;
    public static final int milkPerLatteCup = 75;
    public static final int coffeePerLatteCup = 20;
    public static final int latteCost = 7;

    public static final int waterPerCappuccinoCup = 200;
    public static final int milkPerCappuccinoCup = 100;
    public static final int coffeePerCappuccinoCup = 12;
    public static final int cappuccinoCost = 6;
}

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int coffee = 120;
    public static int money = 550;
    public static int cups = 9;
    public static int coffeesToClean = 10;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String action;
        do{
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            action = scanner.nextLine();
            switch (action){
                case "buy":
                    if (coffeesToClean == 0)
                    {
                        System.out.println("I need cleaning!");
                        break;
                    }
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "clean":
                    System.out.println("I have been cleaned!");
                    coffeesToClean = 10;
                    break;
                case "remaining":
                    status();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Wrong action!");
            }
        } while(!action.equals("exit"));
        scanner.close();
    }

    static boolean check(String typeOfCoffee){
        if(cups <= 0) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
        switch (typeOfCoffee){
            case "espresso":
                if (water < Coffees.waterPerEspressoCup){
                    System.out.println("Sorry, not enough water!");
                    return false;
                }
                if (coffee < Coffees.coffeePerEspressoCup){
                    System.out.println("Sorry, not enough coffee!");
                    return false;
                }
                System.out.println("I have enough resources, making you a coffee!");
                return true;
            case "latte":
                if (water < Coffees.waterPerLatteCup){
                    System.out.println("Sorry, not enough water!");
                    return false;
                }
                if (coffee < Coffees.coffeePerLatteCup){
                    System.out.println("Sorry, not enough coffee!");
                    return false;
                }
                if (milk < Coffees.milkPerLatteCup){
                    System.out.println("Sorry, not enough milk!");
                    return false;
                }
                System.out.println("I have enough resources, making you a coffee!");
                return true;
            case "cappuccino":
                if (water < Coffees.waterPerCappuccinoCup){
                    System.out.println("Sorry, not enough water!");
                    return false;
                }
                if (coffee < Coffees.coffeePerCappuccinoCup){
                    System.out.println("Sorry, not enough coffee!");
                    return false;
                }
                if (milk < Coffees.milkPerCappuccinoCup){
                    System.out.println("Sorry, not enough milk!");
                    return false;
                }
                System.out.println("I have enough resources, making you a coffee!");
                return true;
        }
        return false;
    }

    static void status(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        if(!scanner.hasNextInt())
            return;
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                if(!check("espresso"))
                    break;
                water -= Coffees.waterPerEspressoCup;
                coffee -= Coffees.coffeePerEspressoCup;
                money += Coffees.espressoCost;
                cups -= 1;
                coffeesToClean -= 1;
                break;
            case 2:
                if(!check("latte"))
                    break;
                water -= Coffees.waterPerLatteCup;
                milk -= Coffees.milkPerLatteCup;
                coffee -= Coffees.coffeePerLatteCup;
                money += Coffees.latteCost;
                cups -= 1;
                coffeesToClean -= 1;
                break;
            case 3:
                if(!check("cappuccino"))
                    break;
                water -= Coffees.waterPerCappuccinoCup;
                milk -= Coffees.milkPerCappuccinoCup;
                coffee -= Coffees.coffeePerCappuccinoCup;
                money += Coffees.cappuccinoCost;
                cups -= 1;
                coffeesToClean -= 1;
                break;
        }
    }

    static void fill(){
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffee = scanner.nextInt();
        System.out.println("WWrite how many disposable cups you want to add:");
        int addCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        coffee += addCoffee;
        cups += addCups;
    }

    static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }
}