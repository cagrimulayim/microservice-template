package com.micro.training.msagreement.rest;


import com.micro.training.msagreement.rest.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //Default Singleton
@RequestMapping("/play")
public class PlayGroundController {

    //@RequestMapping(method = RequestMethod.GET, path = "/test1")
    @GetMapping("/test1")
    public String test1(){
        return "Test 1 OK";
    }


    //play/test2/osman/static/ali
    @GetMapping("/test2/{abc}/static/{xyz}")
    public String test2(@PathVariable("abc") String testData1, @PathVariable("xyz") String testData2){
        return "Test 2 OK: " + testData1 + " " + testData2;
    }


    //play/test3?abc=osman&xyz=ali
    @GetMapping("/test3")
    public String test3(@RequestParam("abc") String testData1, @RequestParam("xyz") String testData2){
        return "Test 3 OK: " + testData1 + " " + testData2;
    }

    //play/test4/osman?sur=yaycioglu
    @GetMapping("/test4/{name}")
    public String test4(@PathVariable("abc") String name, @RequestParam("xyz") String sur){
        return "Test 4 OK: " + name + " " + sur;
    }

    //play/test4/osman?sur=yaycioglu
    @GetMapping("/test5/{name}")
    public String test5(@PathVariable String name, @MatrixVariable String sur){
        return "Test 5 OK: " + name + " " + sur;
    }

    @PostMapping("/test6")
    public String test6(@RequestBody Person personParam){
        return "Test 5 OK: " + personParam;
    }

    //PArametrede optinal kullanabilirsiniz ama dinamik yapmayın.

}
