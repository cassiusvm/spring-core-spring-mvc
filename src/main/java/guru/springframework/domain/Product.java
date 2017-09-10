package guru.springframework.domain;

import javax.persistence.*;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by jt on 11/6/15.
 */
@Entity
public @Data class Product implements DomainObject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Version
	private Integer version;

	private String description;
	private BigDecimal price;
	private String imageUrl;
}
