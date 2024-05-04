import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-04 21:06
 */
public class MyTest {

    @Test
    public void test1(){
        TemplateEngine te = new TemplateEngine();
        Context context = new Context();
        String input = "<input type='text' th:value=${course}/>";
        context.setVariable("course","Learning Thymeleaf stupid way...");
        String out = te.process(input, context);
        System.out.println("out = " + out);
    }

}
