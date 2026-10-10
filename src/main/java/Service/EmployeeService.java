package Service;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService implements EmployeeServiceInterface{

    @Autowired
    private EmployeeRepository emplRepo;
    @Override
    public Employee findById(Long id) {
        return emplRepo.findById(id).get();
    }
}
