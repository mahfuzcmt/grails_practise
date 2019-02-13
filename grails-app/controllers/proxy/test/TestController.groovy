package proxy.test

import grails.gorm.transactions.Transactional

class TestController {


    @Transactional
    def test() {
        Test t = Test.proxy(1)
        if(!t){
            println("Data not found!")
            Test t2 = new Test()
            t2.name="Test Name"
            t2.address = "Test Address"
            t2.save()
        } else{
            println("------"+t.name+" is exist!"+"------")
            t.name = new Date()
            println(t.name+" will be updated!")
            render(view: "index")
        }
    }

}
