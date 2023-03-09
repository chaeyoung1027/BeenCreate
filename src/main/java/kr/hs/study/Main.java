package kr.hs.study;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        //설정파일(config.xml)을 로딩하고 실행하는 것
        TestBean obj1 = ctx.getBean("t1",TestBean.class);   //TestBean의 객체를 만들 때 그 안에 있던 TestBean의 기본생성자가 출력
        System.out.println("obj2:"+obj1);
        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2:"+obj2);
        TestBean obj3 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj3:"+obj3);
        TestBean obj4 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj4:"+obj3);

        ctx.close();
    }
}