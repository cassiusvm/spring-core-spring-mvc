package guru.springframework.domain;

import lombok.Data;

/**
 * Created by jt on 11/14/15.
 */
public @Data class Customer implements DomainObject {
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
