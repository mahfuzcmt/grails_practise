package proxy.test

import grails.gorm.transactions.Transactional

class xyzController {

    def dosum(){
        BigDecimal a = 22.95
        BigDecimal b = 2.295

        BigDecimal result = a+b
        String cal = a.toString()concat(" + ".concat(b.toString()))
        render(view: "/xyz/result", model:[result: cal.concat(" = ".concat(result.toString()))])
    }
}
