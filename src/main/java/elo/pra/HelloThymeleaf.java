package elo.pra;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-04 16:25
 */
public class HelloThymeleaf {
    public static void main(String[] args) {
        TemplateEngine templateEngine = new TemplateEngine();
        //org.thymeleaf.exceptions.TemplateProcessingException: Could not parse as expression: "hello thymeleaf" 不能有空格，否则抛该异常
        String input = "<input type='text' th:value='hellothymeleaf'/>";
        Context context = new Context();
        String out = templateEngine.process(input, context);
        System.out.println("out = " + out);

    }
}
