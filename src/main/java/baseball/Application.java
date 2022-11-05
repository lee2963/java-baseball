package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");
        List<Integer> targetNum = makeRandomTargetNum();
        String inputNum = inputUserNum();


    }

    public static List<Integer> makeRandomTargetNum() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }

    public static String inputUserNum() {
        System.out.print("숫자를 입력하세요: ");
        String userNum = Console.readLine();

        return userNum;
    }

    static boolean checkInputLengthCorrect(String inputNum) {
        try {
            if (inputNum.length() != 3){
                throw new IllegalArgumentException();
            }

            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("에러");
            return false;
        }

    }

}
