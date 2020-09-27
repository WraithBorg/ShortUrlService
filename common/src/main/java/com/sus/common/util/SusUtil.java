package com.sus.common.util;

import java.util.Stack;

public class SusUtil {

    private static final  char[] charSet = "qwertyuiopasdfghjklzxcvbnm0123456789QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();

    /**
     * 10进制转62进制
     * @param number
     * @return
     */
    public static String hex10To62(Long number){
        Long rest=number;
        Stack<Character> stack=new Stack<Character>();
        StringBuilder result=new StringBuilder(0);
        while(rest!=0){
            stack.add(charSet[new Long((rest-(rest/62)*62)).intValue()]);
            rest=rest/62;
        }
        for(;!stack.isEmpty();){
            result.append(stack.pop());
        }
        return result.toString();
    }

    /**
     * 62进制转10进制
     * @param sixty_str
     * @return
     */
    public static String hex62To10(String sixty_str){
        Long dst = 0L;
        for(int i=0; i<sixty_str.length(); i++)
        {
            char c = sixty_str.charAt(i);
            for(int j=0; j<charSet.length; j++)
            {
                if(c == charSet[j])
                {
                    dst = (dst * 62) + j;
                    break;
                }
            }
        }
        return dst.toString();
    }

}
