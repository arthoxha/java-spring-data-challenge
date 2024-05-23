package comcydeo.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Product extends BaseEntity {
    private String name;
    private BigDecimal price;

    @ManyToOne
    private Category category;
}

