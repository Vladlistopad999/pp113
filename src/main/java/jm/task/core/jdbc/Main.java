package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util.connection();


        UserDao userDao = new UserDaoJDBCImpl();
            userDao.createUsersTable();
            userDao.saveUser("Витя", "Калянов", (byte)28);
            userDao.saveUser("Ваня", "Сиднев", (byte)28);
            userDao.saveUser("Влад", "Листопад", (byte)22);
            userDao.saveUser("Женя", "Ходов", (byte)28);
            userDao.removeUserById(1L);
            userDao.getAllUsers();
            userDao.cleanUsersTable();
            userDao.dropUsersTable();
        }
    }

