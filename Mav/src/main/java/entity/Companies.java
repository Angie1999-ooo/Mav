package entity;

import dao.CompaniesDAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Objects;
@Entity
@Table (name = "Companies")
public class Companies {
    @Id
    @Column (name = "id_company")
    private int id_company;
    @Column (name = "name_of_the_company")
    private String name_of_the_company ;
    @Column (name = "adress")
    private String adress;
    @Column (name = "phone")
    private String phone;{

    }
    public Companies(){}

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public String getName_of_the_company() {
        return name_of_the_company;
    }

    public void setName_of_the_company(String name_of_the_company) {
        this.name_of_the_company = name_of_the_company;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Companies companies = (Companies) o;
        return id_company == companies.id_company &&
                Objects.equals(name_of_the_company, companies.name_of_the_company) &&
                Objects.equals(adress, companies.adress) &&
                Objects.equals(phone, companies.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_company, name_of_the_company, adress, phone);
    }

    @Override
    public String
    toString() {
        return "Companies{" +
                "id_company=" + id_company +
                ", name_of_the_company='" + name_of_the_company + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
