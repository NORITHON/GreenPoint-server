package com.greenpoint.server.level.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LevelRequest {
    private int grade;
    public String name;
    public String image;
}
