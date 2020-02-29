package spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.bean.Car;

@Service
public class TestDao {

//    public TestDao(Car car){
//        this.car = car;
//        System.out.println("car autowired");
//    }

    //    @Qualifier("car")
    private Car car;

    @Autowired
    public Car setCar(Car car) {
        System.out.println("car autowired");
        return this.car = car;
    }

    public void print() {
        System.out.println("car size....." + this.car.getSize());
    }

    public Car carCreate(int size) {
        System.out.println("Size=============== " + size);
        car.setSize(size);
        return car;
    }
}
