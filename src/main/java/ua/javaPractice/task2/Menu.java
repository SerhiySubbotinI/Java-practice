package ua.javaPractice.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu() {
        UserList userlist = new UserList();
        ProductList productList = new ProductList();
        List<Integer> userBasket = new ArrayList<>();
        List<Integer> productBasket = new ArrayList<>();
        int index = 0;
        printMenu();
        int user;
        int product;
        do {
            int mode = checkInputNumber();
            if (mode > 5) System.exit(0);
            switch (mode) {
                case 1: {
                    userlist.printUser();
                    break;
                }
                case 2: {
                    productList.printProduct();
                    break;
                }
                case 3: {
                    System.out.print("Enter userId: ");
                    user = checkInputNumber();
                    if (user > UserList.users.size()) {
                        System.out.println("There is no user with this ID");
                        break;
                    } else
                        System.out.print("Enter productId:");
                    product = checkInputNumber();
                    if (product > productList.products.size()) {
                        System.out.println("There is no product with this ID");
                        break;
                    }
                    if (UserList.users.get(user - 1).getUserAmountOfMoney() < productList.products.get(product - 1).getProductPrice()) {
                        System.out.println("The user doesn't have enough money to buy product");

                    } else {
                        UserList.users.get(user - 1).setUserAmountOfMoney(UserList.users.get(user - 1).getUserAmountOfMoney() -
                                productList.products.get(product - 1).getProductPrice());
                        userBasket.add(index, UserList.users.get(user - 1).getUserId());
                        productBasket.add(index, productList.products.get(product - 1).getProductId());
                        index++;
                        System.out.println("Successful purchase");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter userId: ");
                    user = checkInputNumber();
                    System.out.println(UserList.users.get(user - 1));
                    for (int i = 0; i < userBasket.size(); i++) {
                        if (userBasket.get(i) == user) {
                            System.out.println(productList.products.get(productBasket.get(i) - 1));
                        }
                    }
                }
                break;
                case 5: {
                    System.out.print("Enter productId: ");
                    product = checkInputNumber();
                    System.out.println(productList.products.get(product - 1));
                    for (int i = 0; i < productBasket.size(); i++) {
                        if (productBasket.get(i) == product) {
                            System.out.println(UserList.users.get(userBasket.get(i) - 1));
                        }
                    }
                }
                break;
            }
        } while (true);
    }
    private static void printMenu() {
        System.out.println("1.Display list of all users \n2.Display list of all products");
        System.out.println("3.To buy product, please enter userId and productId which user want to buy");
        System.out.println("4.Display list of user products by user id\n" +
                "5.Display list of users that bought product by product id\n");
    }
    public int checkInputNumber() {
        Scanner keyboard = new Scanner(System.in);
        int checkNumber;
        do {
            while (!keyboard.hasNextLong()) {
                System.out.print("Please, enter the number: ");
                keyboard.next();
            }
            checkNumber = (int) keyboard.nextLong();
            if (checkNumber < 0) System.out.print("The entered number can't be negative: ");
        } while (checkNumber < 0);
        return checkNumber;
    }

}
