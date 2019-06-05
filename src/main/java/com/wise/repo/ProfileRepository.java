package com.wise.repo;

import com.wise.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    Profile findByFirstName(String name);
    Profile save(Profile profile);

}

