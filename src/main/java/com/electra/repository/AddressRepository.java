package com.electra.repository;


import com.electra.model.Address;
import com.electra.service.ConnectionService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressRepository {

    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public List<Address> retrieveAddresses() {

        List<Address> addresses = new ArrayList<>();

        // Use the connection to execute SQL queries and interact with the database
        try {
            this.initConnection();
            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM address");
            // Iterate over the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("address_id"); // Replace "id" with your actual column name
                String city = resultSet.getString("city"); // Replace "city" with your actual column name
                // Do something with the data, e.g., print it
                Address address = new Address();
                addresses.add(address);
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } finally {
            // Close the connection when done
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
        return addresses;
    }

    public Address retrieveAddress(int addressId) {
        Address address = null;
        // Use the connection to execute SQL queries and interact with the database
        try {
            this.initConnection();
            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM address where address_id = " + addressId);
            // Iterate over the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("address_id"); // Replace "id" with your actual column name
                String city = resultSet.getString("city"); // Replace "city" with your actual column name
                // Do something with the data, e.g., print it
                address = new Address();
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } finally {
            // Close the connection when done
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
        return address;
    }

}
