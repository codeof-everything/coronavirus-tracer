package com.codeof.everything.coronavirustracer.controller;


import com.codeof.everything.coronavirustracer.model.CoronaVirusLocationInfo;
import com.codeof.everything.coronavirustracer.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoronaVirusDataController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public List<CoronaVirusLocationInfo> home(Model model) {
        List<CoronaVirusLocationInfo> allStats = coronaVirusDataService.getAllStats();
        return allStats;
    }
}
