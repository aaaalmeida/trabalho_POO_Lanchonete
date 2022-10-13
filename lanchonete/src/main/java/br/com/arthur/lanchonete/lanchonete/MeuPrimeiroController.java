package br.com.arthur.lanchonete.lanchonete;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MeuPrimeiroController {
    @GetMapping("/oi")
    @ResponseBody
    public String hello(){
        return "Oi, tudo bem?";
    }
}