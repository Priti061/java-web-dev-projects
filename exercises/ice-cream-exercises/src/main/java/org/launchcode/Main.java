package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        System.out.println("\n\nBefore sort");
        for (Flavor flavor : flavors) {
            //System.out.println(flavor.getName());
            System.out.println(flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
        }
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

        System.out.println("\n\nAfter sort");

        for (Flavor flavor : flavors) {
            //System.out.println(flavor.getName());
            System.out.println(flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
        }

        System.out.println("\n\nBefore Sort: ");
        for(Cone cone : cones) {
            System.out.println("$" + cone.getCost());
        }

        cones.sort(new ConeComparator());

        System.out.println("\n\nAfter Sort: ");
        for(Cone cone : cones) {
            System.out.println("$" + cone.getCost());
        }

        System.out.println("\n\nAfter Sort: ");
        for(Topping topping : toppings) {
            System.out.println(topping.getName() + " Tastiness: " + topping.getTastiness());
        }


    }
}



        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

