package programmerzamannow.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {

    private Integer totalEmployee;

}
