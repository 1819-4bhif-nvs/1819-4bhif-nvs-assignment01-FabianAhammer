package at.htl.firstproject;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class InitBean {

    @PostConstruct
    public void init(){
        System.out.println("** It works! ***");
    }
}
