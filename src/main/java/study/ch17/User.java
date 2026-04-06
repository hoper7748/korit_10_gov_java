package study.ch17;

import lombok.Builder;
import lombok.Data;

@Data
@Builder            // Builder는 @AllArgsConstructor Attribute 또한 가지고 있지만 @NoArgsConstructor를 사용할 수 없다.
                    // 또한 NoArgs... 를 사용할 경우 Builder에 포함된 AllArgs를 사용할 수 없다.
                    // 때문에 둘 다 사용하고 싶을 때는 둘 다 선언을 해줘야한다
public class User {
    private Long id;
    private String username;
    private String password;
}
