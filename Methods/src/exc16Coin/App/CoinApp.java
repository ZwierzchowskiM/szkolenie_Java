package exc16Coin.App;

import exc16Coin.Service.CoinSystem;

import java.util.Scanner;

public class CoinApp {
    public static void main(String[] args) {


        CoinSystem coinsystem = new CoinSystem();

        coinsystem.bet();
        coinsystem.throwCoin();
        coinsystem.checkResult();


    }
}
