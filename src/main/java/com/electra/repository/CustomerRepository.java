package com.electra.repository;

import com.electra.model.Brand;
import com.electra.model.Customer;
import com.electra.service.ConnectionService;
import com.electra.service.CustomerService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }
    public List<Customer> retrieveCustomers() {
        List<Customer> Customer = new ArrayList<>();
        // Use the connection to execute SQL queries and interact with the database
        try {
            this.initConnection();

            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            // Iterate over the result set
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name ");
                String email = resultSet.getString("description");
                String address = resultSet.getString("address");

                // Do something with the data, e.g., print it
                Customer customer =new Customer(id,name,email,address);
                Customer.add(customer);
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
        return Customer;
    }
}
