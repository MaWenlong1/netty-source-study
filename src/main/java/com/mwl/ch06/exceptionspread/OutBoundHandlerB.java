package com.mwl.ch06.exceptionspread;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;

/**
 * @author mawenlong
 * @date 2019/01/13
 */
public class OutBoundHandlerB extends ChannelOutboundHandlerAdapter {
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("OutBoundHandlerB.exceptionCaught()");
        ctx.fireExceptionCaught(cause);
    }
}
