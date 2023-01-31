package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
       Object targetMethodResult=null;
        try{
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundBookLoggingAdvice: было поймано иключение "+e);
          throw e;
        }

        System.out.println("aroundBookLoggingAdvice: в библиотеку успешно вернули книгу");
        return targetMethodResult;
    }
}
