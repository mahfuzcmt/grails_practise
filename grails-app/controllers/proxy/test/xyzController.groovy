package proxy.test

import grails.gorm.transactions.Transactional

class xyzController {

    def dosum(){
        BigDecimal a = 22.95
        BigDecimal b = 2.295
        render(view: "/xyz/result", model:[result: a+b])
    }
}
