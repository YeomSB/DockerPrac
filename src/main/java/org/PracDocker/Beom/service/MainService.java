package org.PracDocker.Beom.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.PracDocker.Beom.dto.MainRequestDTO;
import org.PracDocker.Beom.entity.MainEntity;
import org.PracDocker.Beom.repository.MainRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    private final MainRepository mainRepository;


    public void save(MainRequestDTO mainRequestDTO) {
        mainRepository.save(MainEntity.builder().name(mainRequestDTO.getName()).sex(mainRequestDTO.getSex()).build());
    }

    public String getName(Long id) {
        return mainRepository.findById(id).orElseThrow().getName();
    }
}
