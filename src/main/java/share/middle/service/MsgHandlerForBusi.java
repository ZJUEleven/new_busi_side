package share.middle.service;

import share.util.MsgHandleResult;

public interface MsgHandlerForBusi {

    MsgHandleResult sendMsgCES001ToShcpe(String busiId, String msgType, share.msg.CES001Msg.MainBody ces001Msg);

    MsgHandleResult sendMsgCES011ToShcpe(String busiId, String msgType, share.msg.CES011Msg.MainBody ces011Msg);

}
