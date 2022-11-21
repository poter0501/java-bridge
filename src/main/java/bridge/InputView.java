package bridge;
import camp.nextstep.edu.missionutils.Console;
/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return 0;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    public int tryParseInt(String input){
        int result=0;
        try {
            result=Integer.parseInt(input);
        }catch (NumberFormatException exception){
            IllegalArgumentException e = new IllegalArgumentException("[ERROR] 숫자만 입력해야 합니다.");
            throw e;
        }
        return result;
    }
    public void checkRange(int input, int startInclusiveNumber, int endInclusiveNumber){
        String message = String.format("[ERROR] 다리 길이는 %d부터 %d 사이의 숫자여야 합니다."
                ,startInclusiveNumber, endInclusiveNumber);
        if (input<startInclusiveNumber || input>endInclusiveNumber){
            IllegalArgumentException e = new IllegalArgumentException(message);
            throw e;
        }
    }
}
