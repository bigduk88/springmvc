package hello.springmvc.basic;

import lombok.Data;

import java.io.PrintWriter;
import java.security.PrivateKey;

@Data
public class HelloData {
    private String username;
    private int age;
}
