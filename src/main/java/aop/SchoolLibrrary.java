package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary");
    }
}
