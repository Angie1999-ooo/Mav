package dao;




import com.fasterxml.jackson.annotation.JsonTypeInfo;
import entity.Companies;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.sql.SQLException;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface CompaniesDAO extends JpaRepository<Companies, Integer> {

    List<Companies> getAllCompanies() throws SQLException;

}

