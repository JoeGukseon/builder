package demo.builder;

import lombok.*;

/*
Builder 버전
 */
@Builder
@ToString
@AllArgsConstructor
public class HamburgerV3 {
    // 필수 파라미터
    private final int bun;
    private final int patty;

    //필수값인 경우 빌더를 재정의 하여 빌더의 생성자로 필수값을 받아준다.
    public static HamburgerV3Builder builder(int bun,int patty) {
        return new HamburgerV3Builder().bun(bun).patty(patty);
    }

    // 선택 매개변수
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;
}
