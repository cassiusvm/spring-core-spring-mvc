package guru.springframework.domain;

import javax.persistence.*;

import lombok.Data;

/**
 * Created by jt on 12/14/15.
 */
@Entity
public @Data class User implements DomainObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String username;

    @Transient
    private String password;

    private String encryptedPassword;
    private Boolean enabled = true;
    
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Customer customer;
}
