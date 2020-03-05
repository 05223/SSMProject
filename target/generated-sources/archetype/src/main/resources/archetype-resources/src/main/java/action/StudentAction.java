#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.action;

import ${package}.domain.Student;
import ${package}.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentAction {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudent/{snumber}")
    @ResponseBody
    public Student getStudentBySnumber(@PathVariable Integer snumber) throws Exception{
        return studentService.getStudentBySnumber(snumber);
    }
}
