package comcydeo.demo.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class State extends BaseEntity {
    private String stateCode;
    private String stateName;
}
