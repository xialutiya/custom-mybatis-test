package xialu.mapper;

import xialu.entity.Student;

import java.util.List;

public interface StudyMapper {

    /**
     * 查询所有学员.
     * @return
     */
    List<Student> findAll();

    /**
     * 根据ID和姓名查询一个学员.
     * @param student
     * @return
     */
    Student findById(Student student);
}
