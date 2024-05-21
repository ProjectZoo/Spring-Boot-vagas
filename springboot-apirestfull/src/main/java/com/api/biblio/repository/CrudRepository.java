package com.api.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.biblio.model.CadCds;
public interface CrudRepository extends JpaRepository<CadCds, Long> {
    CadCds findById(Long id);
}
