package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {

        log.error("我是error,error,error5555555555");
        log.info("我是info,info,info");
        log.debug("我是debug,debug,debug");
        
    }

}
