package racingcar.validator;

public class InputValidator {

    public static void validateCarNamesInput(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 빈 값일 수 없습니다.");
        }
        if (!input.contains(",")) {
            throw new IllegalArgumentException("자동차 이름은 쉼표(,)로 구분하여 2개 이상 입력해야 합니다.");
        }
    }

    public static void validateTryCountInput(String input) {
        try {
            int count = Integer.parseInt(input);
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상의 숫자여야 합니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자로 입력해야 합니다.");
        }
    }
}
