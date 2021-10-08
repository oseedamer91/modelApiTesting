package com.intel.chd.api.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.intel.chd.api.tests.model.Moca;

public interface MocaRepository extends JpaRepository<Moca, Long> {

}
