package com.example.iot11.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public class TemperatueDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void addTemperature(double value){
        String sql = "insert into Temperature_Data (tem_value) values(?)";
        jdbcTemplate.update(sql,value);
    }
    public List<Double> getTemperature(){
        String sql = "select tem_value from Temperature_Data order by tem_id desc LIMIT 7";
        //System.out.println(jdbcTemplate.queryForList(sql,Double.class));
        return jdbcTemplate.queryForList(sql,Double.class);
    }
}
