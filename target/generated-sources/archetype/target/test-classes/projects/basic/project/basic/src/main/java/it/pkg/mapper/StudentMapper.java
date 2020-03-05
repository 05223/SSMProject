package it.pkg.mapper;

import it.pkg.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {

    @Select("select * from student where snumber = #{snumber}")
    public Student selectStudentByPrimaryKey(Integer snumber);
}
