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
        //2. 读取磁盘中的模版文件
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

    @Test
    public void test3() {
        //1.创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        //2. 创建模板解析器
        ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
        //3.模板解析器前后缀配置
        classLoaderTemplateResolver.setPrefix("templates/");
        classLoaderTemplateResolver.setSuffix(".html");
        //4. 设置模板引擎的模板解析器， 可以注释掉这行看看程序运行结果的差异
        templateEngine.setTemplateResolver(classLoaderTemplateResolver);
        //5. 创建上下文
        Context context = new Context();
        //6. 对上下文变量进行填充
        context.setVariable("name", "Eloise");
        String out = templateEngine.process("hello", context);
        System.out.println(out);
    }

}
