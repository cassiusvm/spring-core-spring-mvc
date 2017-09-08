package guru.springframework.domain;

import java.math.BigDecimal;

import lombok.Data;

/**
 * Created by jt on 11/6/15.
 */
public @Data class Product {
    private Integer id;
    private String description;
    private BigDecimal price;
    private String imageUrl;
}
