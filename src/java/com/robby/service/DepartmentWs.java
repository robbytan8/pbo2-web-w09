package com.robby.service;

import com.robby.dao.DepartmentDaoImpl;
import com.robby.entity.Department;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Robby
 */
@WebService(serviceName = "DepartmentWs")
public class DepartmentWs {

    private final DepartmentDaoImpl departmentDao;

    public DepartmentWs() {
        departmentDao = new DepartmentDaoImpl();
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "getAllDepartment")
    public List<Department> getAllDepartment() {
        return departmentDao.showAllData();
    }

    /**
     * Web service operation
     *
     * @param departmentCode
     * @param departmentName
     * @return
     */
    @WebMethod(operationName = "addDepartment")
    public Integer addDepartment(
            @WebParam(name = "departmentCode") String departmentCode,
            @WebParam(name = "departmentName") String departmentName) {
        Department department = new Department();
        department.setCode(departmentCode);
        department.setName(departmentName);
        return departmentDao.addData(department);
    }

}
