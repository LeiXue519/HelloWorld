import com.alibaba.fastjson.JSON;

/**
 * @author xuelei@zhichubao.com
 * @create 2023-11-13 22:14
 */
public class MainTest {

    // 主程序
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setId(0L);
        stu1.setStudentName("");
        stu1.setGrade(0);
        stu1.setAge(0);
        stu1.setAddress("");
        System.out.println("student:  " + JSON.toJSONString(stu1));
    }

}
