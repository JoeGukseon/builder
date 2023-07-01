package demo.builder;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
자바 빈 버전 (SETTER)
 */
@NoArgsConstructor
@Setter
@ToString
public class HamburgerV2 {
    // 필수 매개변수
    private int bun;
    private int patty;

    // 선택 매개변수
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

}
