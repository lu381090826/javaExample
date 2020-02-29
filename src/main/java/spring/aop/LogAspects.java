package spring.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspects {


    @Pointcut("execution(public * spring.dao.TestDao.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("Start method"+JSON.toJSONString(joinPoint.getArgs()));
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("End method");
    }

    @AfterReturning("pointCut()")
    public void logReturn() {
        System.out.println("Return method");
    }

    @AfterThrowing("pointCut()")
    public void logThrow() {
        System.out.println("Throw method");
    }

    @Around("pointCut()")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //获取参数
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("Around method params={}" + JSON.toJSONString(args));
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("Around method return={}" + JSON.toJSONString(proceed));
        return proceed;
    }


}
