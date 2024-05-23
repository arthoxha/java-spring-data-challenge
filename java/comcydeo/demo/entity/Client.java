package comcydeo.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Client extends BaseEntity {
    private String clientName;
    private String email;
    private String phone;

    @ManyToOne
    private Client address;
}
