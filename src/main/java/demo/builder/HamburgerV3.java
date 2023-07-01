package demo.builder;

import lombok.*;

/*
Builder 버전
 */
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class HamburgerV3 {
    // 필수 파라미터
    private int bun;
    private int patty;

    // 선택 매개변수
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;
}
