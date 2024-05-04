import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-04 21:06
 */
public class MyTest {

    @Test
    public void test1() {
        TemplateEngine te = new TemplateEngine();
        Context context = new Context();
        String input = "<input type='text' th:value=${course}/>";
        context.setVariable("course", "Learning Thymeleaf stupid way...");
        String out = te.process(input, context);
        System.out.println("out = " + out);
    }

    @Test
    public void test2() {
        //1. 创建模版引擎
        TemplateEngine te = new TemplateEngine();
        //2. 读取磁盘钟的模版文件
        ClassLoaderTemplateResolver ctr = new ClassLoaderTemplateResolver();
        //3.设定引擎使用的解析器
        te.setTemplateResolver(ctr);
        //4. 制定数据
        Context context = new Context();
        context.setVariable("name", "Joshua Brooks");
        //5.处理模版
        String out = te.process("main.html", context);
        //6. 输出结果
        System.out.println("out = " + out);
    }

}
