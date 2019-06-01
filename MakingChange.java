/**
 * Author: Norhan Abbas
 * Date: 31st of May, 2019
 *
 * Objective:   getting the minimum number of coins
 *              of a GIVEN denomination
 *              that adds up to a GIVEN amount of money
 *
 *              Using greedy algorithm and JUnit tests
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import static org.junit.Assert.assertEquals;


public class MakingChange {

    // amount for which to make change
    public static int[] greedy(int amount) {

        int amount_Initial = amount;

        // the commonly used coins in US currency -DESCENDINGLY
        // You can change them with coins used in another country's currency -DESCENDINGLY
        int[] possibleCoins = new int[]{25, 10, 5, 1};

        // create an array list
        // as we do not know how many coins would be there yet
        //RECALL: array lists can be expanded, but arrays CANNOT

        ArrayList<Integer> coinsList = new ArrayList<>();


        // make sure that the amount entered is a positive one, and not zero
        for (int i = 0; i < possibleCoins.length; i++) {

            while (amount >= possibleCoins[i]) {
                coinsList.add(possibleCoins[i]);
                amount -= possibleCoins[i];
            }
        }

        // convert the array list into array
        int[] coins = new int[coinsList.size()];
        for (int k = 0; k < coinsList.size(); k++) {
            coins[k] = coinsList.get(k);
        }

        // you can uncomment the next 3 lines if you wanna check
        // whether my function gets the right combination of coins

/*        System.out.println("amount: " + amount_Initial + "¢");
        System.out.println("Number of coins: " + coins.length);
        System.out.println(Arrays.toString(coins) + "\n");*/

        return coins;
    }

}



