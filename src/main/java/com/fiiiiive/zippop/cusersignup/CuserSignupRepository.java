package com.fiiiiive.zippop.cusersignup;

import com.fiiiiive.zippop.cusersignup.model.CuserSignupCreateReq;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CuserSignupRepository {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public CuserSignupRepository(JdbcTemplate jdbcTemplate, DataSource dataSource) {
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    public int save(CuserSignupCreateReq dto) {
        return jdbcTemplate.update("INSERT INTO customer (customer_id, customer_name, customer_passwd, customer_addr, customer_phone, customer_e_mail, customer_point, cancel_waiting_num) VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                dto.getCustomer_id(),
                dto.getCustomer_name(),
                dto.getCustomer_passwd(),
                dto.getCustomer_addr(),
                dto.getCustomer_phone(),
                dto.getCustomer_e_mail(),
                dto.getCustomer_point(),
                dto.getCancel_waiting_num()
        );
    }

}
