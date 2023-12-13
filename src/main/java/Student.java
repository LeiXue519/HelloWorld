
import lombok.Data;

import java.io.Serializable;

/**
 * @author xuelei@zhichubao.com
 * @create 2023-11-13 22:14
 */
@Data
public class Student implements Serializable {
    private Long id;
    private String studentName;
    private Integer grade;
    private Integer age;
    private String address;
}