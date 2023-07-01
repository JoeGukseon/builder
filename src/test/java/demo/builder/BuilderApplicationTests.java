package demo.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class BuilderApplicationTests {

    @Test
    void basic() {
        // 모든 재료가 있는 햄버거
        HamburgerBasic hamburgerBasic1 = new HamburgerBasic(2, 1, 2, 4, 6, 8);

        // 빵과 패티 치즈만 있는 햄버거
        HamburgerBasic hamburgerBasic2 = new HamburgerBasic(2, 1, 1);

        // 빵과 패티 베이컨만 있는 햄버거
        HamburgerBasic hamburgerBasic3 = new HamburgerBasic(2, 0);

        System.out.println("hamburger1 = " + hamburgerBasic1);
        System.out.println("hamburger2 = " + hamburgerBasic2);
        System.out.println("hamburger3 = " + hamburgerBasic3);
    }

    @Test
    void javaBean() {
        // 모든 재료가 있는 햄버거
        HamburgerJavaBean hamburger1 = new HamburgerJavaBean();
        hamburger1.setBun(2);
        hamburger1.setPatty(1);
        hamburger1.setCheese(2);
        hamburger1.setLettuce(4);
        hamburger1.setTomato(6);
        hamburger1.setBacon(8);

        // 빵과 패티 치즈만 있는 햄버거
        HamburgerJavaBean hamburger2 = new HamburgerJavaBean();
        hamburger2.setBun(2);
        hamburger2.setPatty(1);
        hamburger2.setCheese(1);


        // 빵과 패티 베이컨만 있는 햄버거
        HamburgerJavaBean hamburger3 = new HamburgerJavaBean();
        hamburger3.setBun(2);
        hamburger3.setPatty(1);

        System.out.println("hamburger1 = " + hamburger1);
        System.out.println("hamburger2 = " + hamburger2);
        System.out.println("hamburger3 = " + hamburger3);
    }

}
