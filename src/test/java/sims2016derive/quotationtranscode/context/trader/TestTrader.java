package sims2016derive.quotationtranscode.context.trader;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sims2016derive.quotationtranscode.context.util.JConfigRole;

public class TestTrader {
//	String frontAddr = "tcp://asp-sim2-front1.financial-trading-platform.com:26205";
	/** ––«ÈAPI **/
	@SuppressWarnings("resource")
    @Test
	public void spiTest() throws InterruptedException {
	    ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("spring-fourcolor-rootcontext-test.xml");
        xml.start();
        JConfigRole role = (JConfigRole) xml.getBean("jctpRole");
        
        JCTPTraderSpi traderSpi = new JCTPTraderSpi();
        traderSpi.getInstrumentID(role, false);
        
	}
}
