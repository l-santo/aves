package ec.edu.itsqmet.aves;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import ec.edu.itsqmet.aves.service.IAvesService;

@SpringBootTest
class AvesApplicationTests {
	//@Autowired
	//private IAvesRepository avesRepository;
	@Autowired
	private IAvesService avesService;

	@Test
	void contextLoads() {
		//System.out.println(avesRepository.count());
		System.out.println(avesService.getAll());
	}

}



