package demo.builder;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class BuilderApplicationTests {

    @Test
    void basic() {
        // 모든 재료가 있는 햄버거
        HamburgerV1 hamburger1 = new HamburgerV1(2, 1, 2, 4, 6, 8);

        // 빵과 패티 치즈만 있는 햄버거
        HamburgerV1 hamburger2 = new HamburgerV1(2, 1, 1);

        // 빵과 패티 베이컨만 있는 햄버거
        HamburgerV1 hamburger3 = new HamburgerV1(2, 0);

        System.out.println("hamburger1 = " + hamburger1);
        System.out.println("hamburger2 = " + hamburger2);
        System.out.println("hamburger3 = " + hamburger3);
    }

    @Test
    void javaBean() {
        // 모든 재료가 있는 햄버거
        HamburgerV2 hamburger1 = new HamburgerV2();
        hamburger1.setBun(2);
        hamburger1.setPatty(1);
        hamburger1.setCheese(2);
        hamburger1.setLettuce(4);
        hamburger1.setTomato(6);
        hamburger1.setBacon(8);

        // 빵과 패티 치즈만 있는 햄버거
        HamburgerV2 hamburger2 = new HamburgerV2();
        hamburger2.setBun(2);
        hamburger2.setPatty(1);
        hamburger2.setCheese(1);


        // 빵과 패티 베이컨만 있는 햄버거
        HamburgerV2 hamburger3 = new HamburgerV2();
        hamburger3.setBun(2);
        hamburger3.setPatty(1);

        System.out.println("hamburger1 = " + hamburger1);
        System.out.println("hamburger2 = " + hamburger2);
        System.out.println("hamburger3 = " + hamburger3);
    }

    @Test
    void builder() {
        HamburgerV3 hamburger1 = HamburgerV3.builder()
                .bun(2)
                .patty(1)
                .cheese(2)
                .lettuce(4)
                .tomato(6)
                .bacon(8)
                .build();

        HamburgerV3 hamburger2 = HamburgerV3.builder()
                .bun(2)
                .patty(1)
                .cheese(2)
                .build();

        HamburgerV3 hamburger3 = HamburgerV3.builder()
                .bun(2)
                .patty(1)
                .build();

        System.out.println("hamburger1 = " + hamburger1);
        System.out.println("hamburger2 = " + hamburger2);
        System.out.println("hamburger3 = " + hamburger3);
    }
}
