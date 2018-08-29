package share.busside.service;

import share.util.MsgHandleResult;

public interface InfoRecFromMiddleware {
    MsgHandleResult sendMsgCES010ToBusSide(String busiId, String msgType, share.msg.CES010Msg.MainBody ces010Msg);
    MsgHandleResult sendMsgCES002ToBusSide(String busiId, String msgType, share.msg.CES002Msg.MainBody ces002Msg);
    MsgHandleResult sendMsgCES003ToBusSide(String busiId, String msgType, share.msg.CES003Msg.MainBody ces003Msg);
    MsgHandleResult sendMsgCES012ToBusSide(String busiId, String msgType, share.msg.CES012Msg.MainBody ces012Msg);


}
