package servlete;




import java.sql.*;
import java.util.List;

import dao.CompaniesDAO;
import entity.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CompaniesService {
@Autowired
    private  CompaniesDAO companiesDAO ;

    public CompaniesService(CompaniesDAO companiesDAO) {
        this.companiesDAO = companiesDAO;
    }

    public List<Companies> getAllCompanies() throws SQLException {



        List<Companies> companiesList = companiesDAO.findAll();
        return companiesList;
    }
}


