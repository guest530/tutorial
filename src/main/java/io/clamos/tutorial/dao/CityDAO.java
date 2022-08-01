package io.clamos.tutorial.dao;

import io.clamos.tutorial.dto.CityDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityDAO {
    List<CityDTO> selectAllCity();
}
