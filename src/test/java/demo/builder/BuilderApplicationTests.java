package demo.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
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
}
