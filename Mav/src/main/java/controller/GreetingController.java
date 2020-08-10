package controller;
import dao.CompaniesDAO;
import entity.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {
    @Autowired
    CompaniesDAO companiesDAO;

    @RequestMapping("/allCompanies")
    public List<Companies> getAllCompanies() throws SQLException {
        return companiesDAO.getAllCompanies();

    }
    @GetMapping("/main")
    public String main (Map<String , Object> model) {
        model.put("name", "hello user");
        return "main";
    }

}

