package org.PracDocker.Beom.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.PracDocker.Beom.entity.MainEntity;
import org.PracDocker.Beom.repository.MainRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MainRepository mainRepository;


    public void save(MainEntity mainEntity) {
        mainRepository.save(mainEntity);
    }
    public String getName() {
        return mainRepository.findByName("man").orElseThrow().getName();
    }
}
