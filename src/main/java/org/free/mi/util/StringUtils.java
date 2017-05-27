package org.free.mi.util;

/**
 * Created by mizhe on 2017/5/27.
 */
public class StringUtils {
    //把网络字节序的IP转成字符串的IP(正序)
    public static String htonsip(Long ip) {
        if(ip == null)
            return "";
        return  ((ip >> 24)&0x0ff) + "." +
                ((ip >> 16)&0x0ff) + "." +
                ((ip >> 8)&0x0ff) + "." +
                ((ip >> 0)&0x0ff) ;
    }
    public static void main(String[] args){
        System.out.print(htonsip(177308525L));
    }
}
