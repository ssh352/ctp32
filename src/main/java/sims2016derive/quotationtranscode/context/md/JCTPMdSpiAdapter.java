package sims2016derive.quotationtranscode.context.md;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Virtual;

import sims2016derive.quotationtranscode.context.mdapi.CThostFtdcMdSpi;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcDepthMarketDataField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspInfoField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcRspUserLoginField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcSpecificInstrumentField;
import sims2016derive.quotationtranscode.context.struct.CThostFtdcUserLogoutField;

/**
 * <pre>
 * ���ߣ�wengqf
 * ��Ŀ��sims2016derive-quotationtranscode-ctp32
 * ��˵����������
 * ���ڣ�2016��1��21��
 * ��ע��
 * </pre>
 */
public final class JCTPMdSpiAdapter extends CThostFtdcMdSpi {

    JCTPMdSpi mdSpi;

    public JCTPMdSpiAdapter(JCTPMdSpi mdSpi) {
        BridJ.protectFromGC(this);
        this.mdSpi = mdSpi;
    }

    @Override
    @Virtual(0)
    public void OnFrontConnected() {
        mdSpi.onFrontConnected();
    }

    @Override
    @Virtual(1)
    public void OnFrontDisconnected(int nReason) {
        mdSpi.onFrontDisconnected(nReason);
    }

    @Override
    @Virtual(2)
    public void OnHeartBeatWarning(int nTimeLapse) {
        mdSpi.onHeartBeatWarning(nTimeLapse);
    }

    @Override
    @Virtual(3)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        mdSpi.onRspUserLogin(getStructObject(pRspUserLogin), getStructObject(pRspInfo), nRequestID, bIsLast);
    }

    @Override
    @Virtual(4)
    public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        mdSpi.onRspUserLogout(getStructObject(pUserLogout), getStructObject(pRspInfo), nRequestID, bIsLast);
    }

    @Override
    @Virtual(5)
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        mdSpi.onRspError(getStructObject(pRspInfo), nRequestID, bIsLast);
    }

    @Override
    @Virtual(6)
    public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID,
            boolean bIsLast) {
        mdSpi.onRspSubMarketData(getStructObject(pSpecificInstrument), getStructObject(pRspInfo), nRequestID, bIsLast);
    }

    @Override
    @Virtual(7)
    public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID,
            boolean bIsLast) {
        mdSpi.onRspUnSubMarketData(getStructObject(pSpecificInstrument), getStructObject(pRspInfo), nRequestID, bIsLast);
    }

    @Override
    @Virtual(8)
    public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData) {
        mdSpi.onRtnDepthMarketData(getStructObject(pDepthMarketData));
    }

    private <T extends StructObject> T getStructObject(Pointer<T> field) {
        return field == null ? null : field.get();
    }

}
