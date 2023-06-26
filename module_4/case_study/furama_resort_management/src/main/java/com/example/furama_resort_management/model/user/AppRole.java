package com.example.furama_resort_management.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", columnDefinition = "INTEGER")
    private Integer roleId;
    @Column(name = "role_name", columnDefinition = "VARCHAR(255)", nullable = false )
    private String roleName;

}
