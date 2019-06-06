package com.wise.repo;

import com.wise.entity.CertificateRegProfile;
import com.wise.entity.CertificateRegProfileId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRegProfileRepository extends JpaRepository<CertificateRegProfile, CertificateRegProfileId> {
}
