package jm.task.core.jdbc.dao;

import jdk.jshell.execution.Util;
import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private final Connection connection = Util.getConnection();

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        Statement createUsersTable = Util.getConnection.createStatement();
        try (Statement createUsersTable = connection.createStatement()) {
            connection.setAutoCommit(false); // Это тебе сейчас не надо(транзакция)
            createUsersTable.executeUpdate("CREATE TABLE Users(" +
                    "id INTEGER NOT NULL AUTO_INCREMENT," +
                    "name VARCHAR(64) NOT NULL," +
                    "lastName VARCHAR(64) NOT NULL," +
                    "age SMALLINT NOT NULL," +
                    "PRIMARY KEY(ID))");
            connection.commit(); // Это тебе сейчас не надо(транзакция)
        } catch (SQLException e) {
            try {
                connection.rollback(); // Это тебе сейчас не надо(транзакция)
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
