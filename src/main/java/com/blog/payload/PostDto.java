package com.blog.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min=2 , message = "title should be atleast 2 character.")
    private String title;

    @NotEmpty
    @Size (min=2, message = "Description should be atleast 4 character!")
    private String description;
    private String content;
}
