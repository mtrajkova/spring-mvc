package main.java.model;

import javax.validation.constraints.*;

public class MoviesForm {
    @NotBlank(message = "Name can't be empty")
    private String name;
    @NotBlank(message = "Surname can't be empty")
    private String surname;
    @NotNull(message = "Age can't be empty")
    @Min(value = 18, message = "Age must be greater than 18")
    private Integer age;
    @Size(min = 1, max = 100, message = "Length of movie must be more than 1 character and less than 100")
    private String favoriteMovie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }
}
