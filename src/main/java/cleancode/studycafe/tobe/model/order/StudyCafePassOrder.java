package cleancode.studycafe.tobe.model.order;

import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;

import java.util.Optional;

public class StudyCafePassOrder {

    private final StudyCafeSeatPass studyCafeSeatPass;
    private final StudyCafeLockerPass studyCafeLockerPass;


    public StudyCafePassOrder(StudyCafeSeatPass studyCafeSeatPass, StudyCafeLockerPass studyCafeLockerPass) {
        this.studyCafeSeatPass = studyCafeSeatPass;
        this.studyCafeLockerPass = studyCafeLockerPass;
    }

    public static StudyCafePassOrder of(StudyCafeSeatPass studyCafeSeatPass, StudyCafeLockerPass studyCafeLockerPass) {
        return new StudyCafePassOrder(studyCafeSeatPass, studyCafeLockerPass);
    }

    public StudyCafeSeatPass getStudyCafeSeatPass() {
        return studyCafeSeatPass;
    }

    public Optional<StudyCafeLockerPass> getLockerPass() {
        return Optional.of(studyCafeLockerPass);
    }

    public int getDiscountPrice() {
        return studyCafeSeatPass.getDiscountPrice();
    }

    public int getTotalPrice() {
        int lockerPassPrice = studyCafeLockerPass != null ? studyCafeLockerPass.getPrice() : 0;
        int totalPassPrice = studyCafeSeatPass.getPrice() + lockerPassPrice;
        return totalPassPrice - getDiscountPrice();
    }
}
