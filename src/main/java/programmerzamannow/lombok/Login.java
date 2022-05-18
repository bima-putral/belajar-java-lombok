package programmerzamannow.lombok;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "createEmpty")
@AllArgsConstructor(staticName = "create")
@ToString(exclude = {
        "password"
})
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;

}
