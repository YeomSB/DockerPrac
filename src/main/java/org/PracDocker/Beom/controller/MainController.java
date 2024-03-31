package org.PracDocker.Beom.controller;

import lombok.RequiredArgsConstructor;
import org.PracDocker.Beom.entity.MainEntity;
import org.PracDocker.Beom.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String home() {
        return "helkdsah";
    }

    @PostMapping("/save")
    public String saveTest() {
        MainEntity mainEntity = MainEntity.builder()
                .name("SexMachines")
                .build();
        mainService.save(mainEntity);
        return "Save SexMachine";
    }

    @GetMapping("/get")
    public String getTest(){
        return mainService.getName();
    }



}
