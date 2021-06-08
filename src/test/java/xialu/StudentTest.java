package xialu;

import org.junit.Before;
import org.junit.Test;
import xialu.entity.Student;
import xialu.io.Resources;
import xialu.mapper.StudyMapper;
import xialu.sqlSession.SqlSession;
import xialu.sqlSession.SqlSessionFactory;
import xialu.sqlSession.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class StudentTest {

    private SqlSession sqlSession;

    @Before
    public void beforeTest() throws Exception {
        /**
         * 获取配置文件字节流.
         */
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(is);
        sqlSession = sqlSessionFactory.openSession();
    }

   @Test
   public void testOne() {
       StudyMapper mapper = sqlSession.getMapper(StudyMapper.class);
       List<Student> all = mapper.findAll();
       for (Student student : all) {
           System.out.println(student.toString());
       }
       System.out.println("========================>");
       Student studentVO = mapper.findById(Student.builder().id("11").build());
       System.out.println(studentVO);
   }
}
