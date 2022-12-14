
package eeeee;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://ssss/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://ssss/", className = "eeeee.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://ssss/", className = "eeeee.UpdateResponse")
    @Action(input = "http://ssss/NewWebService/updateRequest", output = "http://ssss/NewWebService/updateResponse")
    public boolean update(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://ssss/", className = "eeeee.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://ssss/", className = "eeeee.DeleteResponse")
    @Action(input = "http://ssss/NewWebService/deleteRequest", output = "http://ssss/NewWebService/deleteResponse")
    public boolean delete(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<eeeee.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ssss/", className = "eeeee.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ssss/", className = "eeeee.FindAllResponse")
    @Action(input = "http://ssss/NewWebService/findAllRequest", output = "http://ssss/NewWebService/findAllResponse")
    public List<Student> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addNew", targetNamespace = "http://ssss/", className = "eeeee.AddNew")
    @ResponseWrapper(localName = "addNewResponse", targetNamespace = "http://ssss/", className = "eeeee.AddNewResponse")
    @Action(input = "http://ssss/NewWebService/addNewRequest", output = "http://ssss/NewWebService/addNewResponse")
    public boolean addNew(
        @WebParam(name = "arg0", targetNamespace = "")
        Student arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns eeeee.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByRollNo", targetNamespace = "http://ssss/", className = "eeeee.FindByRollNo")
    @ResponseWrapper(localName = "findByRollNoResponse", targetNamespace = "http://ssss/", className = "eeeee.FindByRollNoResponse")
    @Action(input = "http://ssss/NewWebService/findByRollNoRequest", output = "http://ssss/NewWebService/findByRollNoResponse")
    public Student findByRollNo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
