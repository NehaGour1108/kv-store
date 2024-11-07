package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KVStore kvStore = new KVStore();

        // Insert or update some keys
        kvStore.put("username", "admin");
        kvStore.put("email", "admin@example.com");

        // Retrieve and print a value
        String username = kvStore.get("username");
        System.out.println("Retrieved username: " + username);

        // Delete a key
        kvStore.delete("email");

        // Attempt to retrieve deleted key
        String email = kvStore.get("email");
        System.out.println("Retrieved email after deletion: " + email);
    }
}