package com.wise.repo;

import com.wise.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
    Profile findByFirstName(String name);
}

