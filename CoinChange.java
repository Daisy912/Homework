package leetcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Name:CoinChange
 * Description:
 * <p>
 * Date: 2024/9/28下午12:52
 * Author:Daisy
 */
public class CoinChange {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//    }

    /**
     * @param coins  零钱数组
     * @param amount 目标
     * @return 最少零钱
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; //容器
        Arrays.fill(dp, amount + 1); //零钱个数不能超过amount，所以如果有该amount可组合的，则dp[amount]<=amount
        dp[0] = 0; //amount=0，则有0种组合
        for (int coin : coins) {
            for (int i = coin; i < amount + 1; i++) {
                if (dp[i - coin] != amount + 1) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

//    public int way(int[] coins, int amount, int[] dp) {
//        for (int coin : coins) {
//            if (amount == coin) { //amount与coins中零钱的面额一致则零钱最少组合方法得到的零钱数为1
//                return 1;
//            }
//        }
//        int[] temp=new int[coins.length];
//        for (int i = 0; i < coins.length; i++) {
//            if (amount-coins[i]>=coins[0]) {
//                temp[i]=dp[amount-coins[i]];
//            }else temp[i]=amount+1;
//        }
//        Arrays.sort(temp);
//        return temp[0]+1;
//    }
}
