package share.shcpe.service;

import share.util.MsgHandleResult;

public interface InterfaceForOther {
    public MsgHandleResult tradeInfoReceive(String msgType, String msg);
}
