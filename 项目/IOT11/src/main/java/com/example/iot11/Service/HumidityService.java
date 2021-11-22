package com.example.iot11.Service;

import com.example.iot11.DAO.HumidityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumidityService {
    @Autowired
    private HumidityDao humidityDao;
    public void addHumidity(double value){
        humidityDao.addHumidity(value);
    }

    public List<Double> getHumidity(){
        return humidityDao.getHumidity();
    }
}
