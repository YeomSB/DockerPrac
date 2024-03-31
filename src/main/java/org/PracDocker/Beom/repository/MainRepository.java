package org.PracDocker.Beom.repository;

import org.PracDocker.Beom.entity.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MainRepository extends JpaRepository<MainEntity,Long> {
    //Optional<MainEntity> findByName(String name);
}
