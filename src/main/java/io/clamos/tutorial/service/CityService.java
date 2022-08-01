package io.clamos.tutorial.service;

import io.clamos.tutorial.dao.CityDAO;
import io.clamos.tutorial.dto.CityDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService {
    @Resource
    private CityDAO cityDAO;

    public List<CityDTO> getAllCity() {
        return cityDAO.selectAllCity();
    }
}
