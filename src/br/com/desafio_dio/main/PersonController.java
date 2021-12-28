package br.com.desafio_dio.main;


import br.com.desafio_dio.main.controller.RequestMapping;
import br.com.desafio_dio.main.getmapping.GetMapping;
import br.com.desafio_dio.main.restcontroller.RestController;

@RestController
@RequestMapping
public class PersonController  {
    @GetMapping
    public String getBook(){
        return "API TEST!";
    }
}
