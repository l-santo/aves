package ec.edu.itsqmet.aves.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.itsqmet.aves.dto.AvesDTO;
import ec.edu.itsqmet.aves.service.IAvesService;

@RestController
@RequestMapping("/product")
public class AvesController {
	@Autowired
	private IAvesService avesService;
	
	@GetMapping("/getAll")
	
	public ResponseEntity<List<AvesDTO>> getAll(){
		List<AvesDTO> p=avesService.getAll();
		return new ResponseEntity<List<AvesDTO>>(p, HttpStatus.OK);
		
		
	}

}
