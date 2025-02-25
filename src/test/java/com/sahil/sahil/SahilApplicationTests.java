package com.sahil.sahil;

import com.sahil.sahil.entity.Employee;
import com.sahil.sahil.repository.EmployeeRepository;
import com.sahil.sahil.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class SahilApplicationTests {

	@Test
	void contextLoads() {
	}

	private final EmployeeRepository repository = mock(EmployeeRepository.class);
	private final EmployeeService service = new EmployeeService(repository);

	@Test
	void testGetEmployeeById_Success() {
		Employee employee = new Employee();
		employee.setId(1L);
		when(repository.findById(1L)).thenReturn(Optional.of(employee));

		Optional<Employee> result = service.getById(1L);
		assertTrue(result.isPresent());
		assertEquals(1L, result.get().getId());
	}
}