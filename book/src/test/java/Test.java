import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.simple.book.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(JUnit4.class)
public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookServiceImpl bookService=(BookServiceImpl) applicationContext.getBean("bookService");
        System.out.println(bookService);
    }
}
