package library.model;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String login;
    private String password;
    private String name;
}

