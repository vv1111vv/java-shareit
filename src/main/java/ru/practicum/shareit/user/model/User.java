package ru.practicum.shareit.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * TODO Sprint add-controllers.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

//    public User(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
}
