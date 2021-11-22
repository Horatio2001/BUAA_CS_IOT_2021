package com.example.iot11.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HumidityDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void addHumidity(double value){
        String sql = "insert into Humidity_Data (hum_value) values(?)";
        jdbcTemplate.update(sql,value);
    }

    public List<Double> getHumidity(){
        String sql = "select hum_value from Humidity_Data order by hum_id desc LIMIT 7";
        //System.out.println(jdbcTemplate.queryForList(sql,Double.class));
        return jdbcTemplate.queryForList(sql,Double.class);
    }

}
