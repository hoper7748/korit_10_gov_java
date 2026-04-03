package study.ch15;

import lombok.*;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull
    private String name;
    @NonNull
    private int age;
    private String address;

    public Student(){
        name = "기본값";
        age = 0;
    }
}
