package de.lecuutex.testbackend.persistence.repository;

import de.lecuutex.testbackend.persistence.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * A class created by yi.dnl - 23.09.2022 / 17:03
 */

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    List<UserEntity> findAll();

    Optional<UserEntity> findAllById(Long id);

    Optional<UserEntity> findAllByName(String name);
}
