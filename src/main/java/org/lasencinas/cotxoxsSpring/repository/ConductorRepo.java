package org.lasencinas.cotxoxsSpring.repository;

import org.lasencinas.cotxoxsSpring.domain.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepo extends JpaRepository<Conductor, String> {
}
