package it.pkg.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer snumber;
    private String sname;
    private String ssex;
    private Integer sage;
}
