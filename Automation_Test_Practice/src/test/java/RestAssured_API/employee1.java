package RestAssured_API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.SQLOutput;
import java.util.Arrays;

public class employee1 {

    public static void main(String[] args) throws JsonProcessingException {

        Employee emp = new Employee();
        emp.setFirstName("vinoth");
        emp.setLastName("kumar");
        emp.setMail("vinothkumar1824@gmail.com");
        emp.setList(Arrays.asList("java","selenium"));


        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        System.out.println(emp.getMail());
        System.out.println(emp.getList());

        ObjectMapper mapper = new ObjectMapper();
       String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
        System.out.println(Json);



    }
}
