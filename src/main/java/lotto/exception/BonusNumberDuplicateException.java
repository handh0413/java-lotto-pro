package lotto.exception;

public class BonusNumberDuplicateException extends RuntimeException {

    public BonusNumberDuplicateException() {
        super("보너스 번호가 당첨 번호에 존재합니다.");
    }
}