package com.xiaotu;

import com.xiaotu.boot.bean.Pet;
import com.xiaotu.boot.bean.User;
import com.xiaotu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.cache.interceptor.CacheAspectSupport;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);

        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);


//        Pet tom01 = run.getBean("tom",Pet.class);
//        Pet tom02 = run.getBean("tom",Pet.class);
//        System.out.println("组件："+(tom01 == tom02));
//
//
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println("user："+ (user == user1));
//
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//
//        System.out.println("用户的宠物："+(user01.getPet() == tom));



//        boolean tom = run.containsBean("tom");
//        System.out.println("容器中Tom组件："+tom);
//
//        boolean user01 = run.containsBean("user01");
//        System.out.println("容器中user01组件："+user01);
//
//        boolean tom22 = run.containsBean("tom22");
//        System.out.println("容器中tom22组件："+tom22);


        String[] beanNamesForType = run.getBeanNamesForType(CacheAspectSupport.class);
        System.out.println(beanNamesForType.length);



        //3.从容器中获取组件
        String[] beanNamesForType1 = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println("======"+beanNamesForType1.length);

    }
}
