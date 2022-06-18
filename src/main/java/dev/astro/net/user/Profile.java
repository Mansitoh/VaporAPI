package dev.astro.net.user;

/**
 * Created by Risas
 * Project: VaporAPI
 * Date: 18-06-2022
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public class Profile {

    private int balance;

    public void addBalance(int balance) {
        this.balance += balance;
    }

    public void subtractBalance(int balance) {
        this.balance -= balance;
    }

    public int getBalance() {
        return balance;
    }
}
