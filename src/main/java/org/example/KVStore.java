package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KVStore {
    // Insert or update a key-value pair
    public void put(String key, String value) {
        String sql = "REPLACE INTO kv_table (`key`, `value`) VALUES (?, ?)";
        try (Connection conn = DbConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, key);
            stmt.setString(2, value);
            stmt.executeUpdate();
            System.out.println("Inserted/Updated key: " + key);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve a value by key
    public String get(String key) {
        String sql = "SELECT `value` FROM kv_table WHERE `key` = ?";
        try (Connection conn = DbConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, key);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("value");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Delete a key-value pair by key
    public void delete(String key) {
        String sql = "DELETE FROM kv_table WHERE `key` = ?";
        try (Connection conn = DbConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, key);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Deleted key: " + key);
            } else {
                System.out.println("Key not found: " + key);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
