package org.PracDocker.Beom.controller;

import lombok.RequiredArgsConstructor;
import org.PracDocker.Beom.dto.MainRequestDTO;
import org.PracDocker.Beom.entity.MainEntity;
import org.PracDocker.Beom.service.MainService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MainController {

    private final MainService mainService;

    @GetMapping("/")
    public String home() {
        return "helkdsah";
    }

    @PostMapping("/save")
    public String saveTest(@RequestBody MainRequestDTO mainRequestDTO) {
        mainService.save(mainRequestDTO);
        return "Save "+mainRequestDTO.getName();
    }

    @GetMapping("/get/{id}")
    public String getTest(@PathVariable Long id){
        return mainService.getName(id);
    }



}
