package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(myConfig.class);
        UniLibrary uniLibrary=context.getBean("uniLibrary", UniLibrary.class);
        Book book=context.getBean("book", Book.class);
        uniLibrary.addBook("Evgeniy",book);
        uniLibrary.addMagazine();

    }
}
