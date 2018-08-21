package controllers;

import db.Seeds;

public class MainController {
    public static void main(String[] args) {
        ManagersController managersController = new ManagersController();
        EmployeesController employeesController = new EmployeesController();
        Seeds.seedData();
    }
}
