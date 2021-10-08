package com.intel.chd.api.tests.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.intel.chd.api.tests.model.Wifi;

public interface WifiRepository extends JpaRepository<Wifi, Long> {

}
