package com.robby.service;

import com.robby.utility.MyMath;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Robby
 */
@WebService(serviceName = "ExampleWs")
public class ExampleWs {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "add")
    public Integer add(
            @WebParam(name = "value1") Integer value1,
            @WebParam(name = "value2") Integer value2) {
        try {
            return MyMath.add(value1, value2);
        } catch (Exception ex) {
            Logger.getLogger(ExampleWs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
