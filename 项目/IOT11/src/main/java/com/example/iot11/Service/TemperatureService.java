package com.example.iot11.Service;

import com.example.iot11.DAO.HumidityDao;
import com.example.iot11.DAO.TemperatueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureService {
    @Autowired
    private TemperatueDao temperatueDao;
    public void addTemperature(double value){
        temperatueDao.addTemperature(value);
    }

    public List<Double> getTemperature(){
        return temperatueDao.getTemperature();
    }
}
