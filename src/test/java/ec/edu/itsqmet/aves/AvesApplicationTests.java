package ec.edu.itsqmet.aves;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.aves.repository.IAvesRepository;

@SpringBootTest
class AvesApplicationTests {
	@Autowired
	private IAvesRepository avesRepository;

	@Test
	void contextLoads() {
		System.out.println(avesRepository.count());
	}

}



