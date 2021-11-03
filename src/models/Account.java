package models;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Account {
    private TreeMap<String, String> accountMap;

    public Account(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public Account() {
        accountMap = new TreeMap<>();
        accountMap.put("Lananh", "123456");
        accountMap.put("Khanh", "123456");
        accountMap.put("Rei", "123456");

    }

    public TreeMap<String, String> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public void register(String name, String password) {
        boolean check = accountMap.containsKey(name);
        if (!check) {
            accountMap.put(name, password);
            System.out.println("Successful registration. ");
        } else {
            System.out.println("Name already exits. ");
        }
    }

    public boolean login(String username, String password) {
        if (Objects.equals(accountMap.get(username), password)) {
            System.out.println("Successful login.");
            return true;
        }
        return false;
    }

    public void deleteAccount(String username, String password) {
        if (Objects.equals(accountMap.get(username), password)) {
            accountMap.remove(username);
            System.out.println("Successful deleted. ");
        }
    }
}
