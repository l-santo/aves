package ec.edu.itsqmet.aves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.aves.dto.AvesDTO;

public interface IAvesRepository extends JpaRepository<AvesDTO, Integer>  {

}

