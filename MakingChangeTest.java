import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

import java.io.IOException;

public class MakingChangeTest {

    @org.junit.Test
    public void greedyTest_one(){

        MakingChange go = new MakingChange();

        int[] arr = {25, 10, 1};
        if (Arrays.equals(go.greedy(36), arr)) {
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
    }


    @org.junit.Test
    public void greedyTest_two() {

        MakingChange go = new MakingChange();

        int amount = 20;

        if (amount < 0) {
            throw new IllegalArgumentException("negative input is not allowed");
        } else if (amount > 0) {
            go.greedy(amount);
        }

    }

    @org.junit.Test
    public void GreedyTest_three() {


        //MakingChange go = new MakingChange();
        int[] arr = {10, 0, 5, 1};

        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    throw new IOException("one of the array elements is empty");
                }
            }
        } catch (IOException e) {
            System.out.println("at least one of the array elements is empty");
        }


    }


    @org.junit.Test
    public void greedyTest_four() {

        MakingChange go = new MakingChange();

        int amount = -9;

        if (amount < 0) {
            throw new IllegalArgumentException("negative input is not allowed");
        } else if (amount > 0) {
            go.greedy(amount);
        }

    }

}