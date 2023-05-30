package org.mustafa.aslan.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "district")
    private String district;
    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Column(name = "post_code")
    private String postCode;

    public Address() {
    }

    public Address(long userId, String district, String street, String number, String postCode) {
        this.userId = userId;
        this.district = district;
        this.street = street;
        this.number = number;
        this.postCode = postCode;
    }
}
