package com;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Yingjie.Lu on 2019/9/15.
 */

@WebService(targetNamespace = "/demo")
public class WebServiceDemo {

    //该方法就是要暴露给其他应用程序调用的方法
    public String transWords(String words){
        String res="";
        for(char ch : words.toCharArray()){
            res+="\t"+ch+"\t";
        }
        return res;
    }

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9001/Service/Function",new WebServiceDemo());
        System.out.println("Publish Success~");
    }

}
