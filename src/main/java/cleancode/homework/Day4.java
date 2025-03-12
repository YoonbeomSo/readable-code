package cleancode.homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Day4 {

    public boolean validateOrder(Order order) {
        if (order.getItems().size() == 0) {
            log.info("주문 항목이 없습니다.");
            return false;
        } else {
            if (order.getTotalPrice() > 0) {
                if (!order.isCustomerInfo()) {
                    log.info("사용자 정보가 없습니다.");
                    return false;
                } else {
                    return true;
                }
            } else if (!(order.getTotalPrice() > 0)) {
                log.info("올바르지 않은 총 가격입니다.");
                return false;
            }
        }
        return true;
    }

    public boolean validateOrder2(Order order) {
        if (order.isItemEmpty()) {
            log.info("주문 항목이 없습니다.");
            return false;
        }

        if (order.isInvalidPrice()) {
            log.info("올바르지 않은 총 가격입니다.");
            return false;
        }

        if (order.isCustomerInfoEmpty()) {
            log.info("사용자 정보가 없습니다.");
            return false;
        }

        return true;
    }

}
