package comcydeo.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class InvoiceProduct extends BaseEntity {
    private BigDecimal profit;
    private BigInteger quantity;

    @ManyToOne
    private Invoice invoice;

    @ManyToOne
    private Product product;
}
