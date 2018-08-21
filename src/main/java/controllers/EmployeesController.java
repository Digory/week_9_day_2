package controllers;

import db.DBHelper;
import db.Seeds;
import models.Department;
import models.Employee;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class EmployeesController {

    public EmployeesController() {
        setupEndPoints();
    }

    private void setupEndPoints(){
        get("/employees", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Employee> employees = DBHelper.getAll(Employee.class);
            model.put("employees", employees);
            model.put("template", "templates/employees/index.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

    }
}
