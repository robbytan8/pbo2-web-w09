package com.robby.service;

import com.robby.dao.DepartmentDaoImpl;
import com.robby.dao.StudentDaoImpl;
import com.robby.entity.Department;
import com.robby.entity.Student;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Robby
 */
@WebService(serviceName = "StudentWs")
public class StudentWs {

    private final StudentDaoImpl studentDao;
    private final DepartmentDaoImpl departmentDao;

    public StudentWs() {
        studentDao = new StudentDaoImpl();
        departmentDao = new DepartmentDaoImpl();
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "showAllStudents")
    public java.util.List<Student> showAllStudents() {
        return studentDao.showAllData();
    }
    private String id;
    private Department department;
    private String firstName;
    private String lastName;
    private Date birthDate;

    /**
     * Web service operation
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param departmentCode
     * @return
     */
    @WebMethod(operationName = "addStudent")
    public Integer addStudent(
            @WebParam(name = "id") String id,
            @WebParam(name = "firstName") String firstName,
            @WebParam(name = "lastName") String lastName,
            @WebParam(name = "birthDate") Date birthDate,
            @WebParam(name = "departmentCode") String departmentCode) {
        List<Department> departments = departmentDao.showAllData();
        List<Department> candidateDepartments = departments.stream().filter(p -> p.getCode().equalsIgnoreCase(
                departmentCode)).collect(Collectors.toList());
        if (candidateDepartments != null && candidateDepartments.size() > 0) {
            Department d = candidateDepartments.get(0);
            Student student = new Student();
            student.setBirthDate(birthDate);
            student.setDepartment(d);
            student.setFirstName(firstName);
            student.setId(id);
            student.setLastName(lastName);
            return studentDao.addData(student);
        }
        return 2;
    }

}
