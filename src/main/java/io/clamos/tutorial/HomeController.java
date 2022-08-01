package io.clamos.tutorial;

import io.clamos.tutorial.dto.CityDTO;
import io.clamos.tutorial.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HomeController {
    @Resource
    private CityService cityService;

    @GetMapping("/api/home")
    public String goHome() {
        return "HOME";
    }

    @GetMapping("/auth/city/doviewall")
    public List<CityDTO> doViewAllCity() {
        return cityService.getAllCity();
    }
}
