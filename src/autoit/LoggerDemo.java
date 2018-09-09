package autoit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerDemo {

	public Logger log = Logger.getLogger(LoggerDemo.class);
	
	public void loggerDebug()
	{
		log.debug("This is a debug method");
	}
	
	public void loggerInfo()
	{
		log.info("This is a information about AUT");
	}
	public void loggerError()
	{
		log.error("this is error message");
	}
	public void loggerFatal()
	{
		log.fatal("this is a fatal error occured while executing");
	}
	public void loggerWarn()
	{
		log.warn("this is a warning message");
	}
	
	@Test
	
	public void loggerDemo()
	
	{
		loggerDebug();
		loggerInfo();
		loggerError();
		loggerFatal();
		loggerWarn();
	}
	
	
}
