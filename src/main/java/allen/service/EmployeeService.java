package allen.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import allen.model.Employee;
import allen.repository.EmployeeRepository;

@Repository
@Transactional(readOnly = true)
public class EmployeeService implements IEmployeeService {
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private EmployeeRepository repo;

	@Override
	@Transactional
	public Employee save(Employee emp) {
		return repo.save(emp);
	}

}
