package com.fiiiiive.zippop.busersignup;

import com.fiiiiive.zippop.busersignup.model.BuserSignupReq;
import com.fiiiiive.zippop.busersignup.model.BuserSignupRes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class BuserRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public BuserRepository(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    public int save(BuserSignupReq dto) {
        return jdbcTemplate.update("INSERT INTO company (company_id,company_name,company_e_mail,company_passwd) VALUES (?,?,?,?)",
                dto.getCompany_id(),
                dto.getCompany_name(),
                dto.getCompany_e_mail(),
                dto.getCompany_passwd()
        );
    }
}
