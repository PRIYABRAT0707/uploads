package com.ribbon.controller;

import com.ribbon.custom_exception.CustomExceptionHandler1;
import com.ribbon.custom_exception.MyExceptionPage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@RequestMapping("/error")
public class ErrorController {

@ExceptionHandler(value = CustomExceptionHandler1.class)
    public ResponseEntity<String> errfoundout(){

    return new ResponseEntity<String>("not found",HttpStatus.BAD_REQUEST);
}
@ResponseStatus(HttpStatus.NOT_FOUND)
@ExceptionHandler(value = MyExceptionPage.class)
    public Map<String ,String> mynewError(MyExceptionPage me){
    Map<String,String> nn=new HashMap<>();
    nn.put("errormes",me.getMessage());
    return nn;
}

}
