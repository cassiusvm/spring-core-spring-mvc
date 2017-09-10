package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * Created by jt on 11/14/15.
 */
@Entity
public @Data class Customer implements DomainObject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
}
