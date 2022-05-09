package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();
        userDao.saveUser("Ivan", "Ivanov", (byte) 55);
        userDao.saveUser("Marta", "Nikulina", (byte) 35);
        userDao.saveUser("Oleg", "Olegovich", (byte) 45);
        userDao.saveUser("Stanislav", "Kruglov", (byte) 43);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}