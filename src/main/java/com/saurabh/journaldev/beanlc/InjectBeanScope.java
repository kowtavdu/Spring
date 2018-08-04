package com.saurabh.journaldev.beanlc;

import java.time.LocalDateTime;

//import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

class PrototypeBean{
	private String dateTimeString = LocalDateTime.now().toString();
	public String getDateTime() {
        return dateTimeString;
    }
}


/*@Component
class SingletonLookupBean {
 
    @Lookup
    public PrototypeBean getPrototypeBean() {
        return null;
    }
}*/

 

/*@Component
class MySingletonBean{
	public void showMessage(){
		PrototypeBean pt = getProto();
	}
	
	public PrototypeBean getProto(){
		return null;
	}
	
}*/

/*class SingletonObjectFactoryBean{
	
	private ObjectFactory<PrototypeBean> prototypeBeanObjectFactory; 
	public PrototypeBean getPrototypeInstance(){
	  return prototypeBeanObjectFactory.getObject();	
	}
}*/


class SingletonBean{
	
	//PrototypeBean proto;
	/*@Autowired
	private Provider<PrototypeBean> myPrototypeBeanProvider;

	
	public SingletonBean(){
		System.out.println("Singleton Insatnce created");
	} 
	
	public void getProto(){
		PrototypeBean proto = myPrototypeBeanProvider.get();
		System.out.println("Hi, the time is "+proto.getDateTime());
	}*/
}

@Configuration
class AppConfigBeanInject{
	
	@Bean
	SingletonBean getSingletonInstance(){
		return new SingletonBean();
	}
	
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	PrototypeBean getPrototypeInstance(){
		return new PrototypeBean();
	}
}


public class InjectBeanScope {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigBeanInject.class);
		SingletonBean first = ctx.getBean(SingletonBean.class);
		//first.getProto();
		
		SingletonBean first1 = ctx.getBean(SingletonBean.class);
		//first1.getProto();	
	}
}
