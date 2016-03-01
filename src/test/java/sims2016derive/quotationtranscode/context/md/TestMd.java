package sims2016derive.quotationtranscode.context.md;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sims2016derive.quotationtranscode.context.trader.JCTPTraderApi;
import sims2016derive.quotationtranscode.context.trader.JCTPTraderSpi;
import sims2016derive.quotationtranscode.context.util.JConfigRole;
import sims2016derive.quotationtranscode.description.QuotationSourceRingBufferDescription;
import sims2016derive.quotationtranscode.description.QuotationTranscodeDescription;
import sims2016derive.quotationtranscode.description.impl.QuotationTranscodeDescriptionImpl;
public class TestMd {
    //    String frontAddr = "tcp://asp-sim2-md1.financial-trading-platform.com:26213";
    JCTPMdApi mdApi;
    JCTPMdSpi mdSpi;
    JCTPTraderApi traderApi;
    JCTPTraderSpi traderSpi;
    private QuotationSourceRingBufferDescription quotationSourRingBufDesc = new QuotationSourceRingBufferDescription();//»·ÃèÊö
    private QuotationTranscodeDescription quotationTranscodeDesc = new QuotationTranscodeDescriptionImpl();//×ªÂëÃèÊö

    @SuppressWarnings("resource")
    @Test
    public void spiTest() throws InterruptedException, IOException {
        ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("spring-fourcolor-rootcontext-test.xml");
        xml.start();
        JConfigRole role = (JConfigRole) xml.getBean("jctpRole");
        JCTPMdSpi mdSpi = new JCTPMdSpi();
        mdSpi.startMDSpi(role, quotationSourRingBufDesc, quotationTranscodeDesc);
        
        //(4)×î³¤µÈ´ý60Ãë»½ÐÑ                 
        BlockingQueue<Boolean> blockingQueue = new ArrayBlockingQueue<Boolean>(10);
        try {
            blockingQueue.poll(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            blockingQueue = null;
        }        
        
        System.out.println("========end=======");
    }
}
