package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TestController {

    @RequestMapping("/apple-app-site-association/")
    public String appleApp(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://211.143.166.3:8088/apple-app-site-association/apple-app-site-association");
        return null;
    }

    public static void main(String[] args) {
        String str = "2020-03-04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(str);
        }catch (Exception e){

        }
        System.out.println(date);
    }
}
