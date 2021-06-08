package xialu.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
public class Student {

    /**
     * 主键.
     */
    private String id;
    /**
     * 姓名.
     */
    private String name;
    /**
     * 年级.
     */
    private String grade;
}
