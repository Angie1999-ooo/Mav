package controller;

import entity.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dao.CompaniesDAO;
import java.sql.SQLException;
import java.util.List;
import servlete.CompaniesService;
@RestController
public class CompaniesControlle {
    @Autowired
    CompaniesDAO companiesDAO;

    @RequestMapping("/allCompanies")
    public List<Companies> getAllCompanies() throws SQLException {
        return companiesDAO.getAllCompanies();

    }

}
