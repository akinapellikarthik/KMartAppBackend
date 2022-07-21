package com.kmart.demo.aspects;

import com.kmart.demo.dto.Product;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class KMartAspects {

    @Around("execution(* com.kmart.demo.controller.KMartController.processItem(..))")
    //@SneakyThrows
    public void validateProductInfo(ProceedingJoinPoint joinPoint) throws Throwable {
        //TODO: check if product already exists in inventory, if yes, then throw a exception else accept it
        //TODO: integrate checkstyle
        var product = (Product) joinPoint.getArgs()[0];
        System.out.println(product);
        joinPoint.proceed();
        System.out.println(joinPoint);

    }

}
