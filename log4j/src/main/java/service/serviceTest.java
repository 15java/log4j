package service;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class serviceTest {
    public static Logger logger = Logger.getLogger(serviceTest.class);

    public static void main(String[] args) {
        //OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL 最小级到最高级
        DOMConfigurator.configure ("D:\\IDEA\\project\\log4j\\src\\main\\webapp\\WEB-INF\\service.xml");
        // 记录debug级别的信息
        logger.debug("我是debug");
        // 记录info的信息
        logger.info("我是info");
        // 记录error级别的信息
        logger.error("我是error");


    }
}
