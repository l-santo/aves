package ec.edu.itsqmet.aves.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ec.edu.itsqmet.aves.dto.AvesDTO;
import ec.edu.itsqmet.aves.repository.IAvesRepository;
import ec.edu.itsqmet.aves.service.IAvesService;

@Service
public class AvesService implements IAvesService {
	@Autowired
	private IAvesRepository avesRepository;

	@Override
	public List<AvesDTO> getAll() {
		List<AvesDTO> p=avesRepository.findAll();
		System.out.println();
		// TODO Auto-generated method stub
		return p;
	}

}
