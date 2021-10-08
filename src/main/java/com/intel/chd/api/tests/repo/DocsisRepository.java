package com.intel.chd.api.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intel.chd.api.tests.model.Docsis;

public interface DocsisRepository extends JpaRepository<Docsis, Long> {

}
