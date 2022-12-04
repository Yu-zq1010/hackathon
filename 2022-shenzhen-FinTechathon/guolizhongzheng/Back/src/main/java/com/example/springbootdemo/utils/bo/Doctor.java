package com.example.springbootdemo.utils.bo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private String name;//姓名
    private String sex;//性别
    private String vital;//科室
    private String cipher;//密码
    private String hospitalname;//所处医院

}
