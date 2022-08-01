package io.clamos.tutorial.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("CityDTO")
@Getter
@Setter
public class CityDTO {
    Integer codeId;
    String nameKor;
    String nameEng;
    Integer population;
//    @JsonFormat("yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
}
