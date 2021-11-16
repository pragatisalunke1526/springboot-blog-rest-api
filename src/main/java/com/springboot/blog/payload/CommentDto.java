package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {

    private long id;

    @NotEmpty(message = "Name should not be Null or Empty")
    private String name;

    @NotEmpty
    @Email(message = "Email should not be Null or Empty")
    private String email;

    @NotEmpty
    @Size(min = 10,message = "Comment Body must be minimum 1o character")
    private String body;



}
