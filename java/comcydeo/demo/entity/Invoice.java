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
public class Invoice extends BaseEntity {
    private String invoiceDate;
    private String invoiceNumber;
    private String invoiceType;

    @ManyToOne
    private Client client;
}
