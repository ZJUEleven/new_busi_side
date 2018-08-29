package share.middle.service;

import share.util.MsgHandleResult;

public interface MsgHandlerForShcpe {
    MsgHandleResult sendMsgToBusiSide(String msgType, String msgContent);
}
