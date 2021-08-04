package com.javastudy.dofirst.cpt06.staticEx;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
public class Student {
    public static int serialNum = 100;
    public String name;
    private int grade;
}
