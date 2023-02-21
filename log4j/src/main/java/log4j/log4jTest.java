package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import servlet.servletTest;

public class log4jTest {
    public static Logger logger = Logger.getLogger(log4jTest.class);

    public static void main(String[] args) {
        //OFF、FATAL、ERROR、WARN、INFO、DEBUG、TRACE、 ALL
        DOMConfigurator.configure ("D:\\IDEA\\project\\log4j\\src\\main\\webapp\\WEB-INF\\log4j.xml");
        // 记录debug级别的信息
        logger.debug("我是debug");
        // 记录info的信息
        logger.info("我是info");
        // 记录error级别的信息
        logger.error("我是error");


    }
}
