package com.wise.repo;


import com.wise.entity.NationalRegProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalRegProfileRepository extends JpaRepository<NationalRegProfile, Integer> {

}
