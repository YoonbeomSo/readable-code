package cleancode.studycafe.tobe.model.pass;

import cleancode.studycafe.tobe.model.pass.type.StudyCafePassType;

public interface StudyCafePass {

    StudyCafePassType getPassType();

    int getDuration();

    int getPrice();
}
