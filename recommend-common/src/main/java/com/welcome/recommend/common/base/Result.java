package com.welcome.recommend.common.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Result implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 是否成功
     */
    private boolean isSuccess;

    /**
     * service返回的对象
     */
    private Map<String,Object> result = new HashMap<String,Object>();

    /**
     * 默认的key
     */
    public static final String DEFAULT_MODEL_KEY = "defaultKey";

    /**
     * 当前的key
     */
    private String modelKey = DEFAULT_MODEL_KEY;

    /**
     * 返回码
     */
    private String resultCode;
    private String[] resultCodeParams;
    private String errorMessage;
    private String successMessage;

    /**
     * 是否成功的构造方法
     */
    public Result(boolean isSuccess){
        this.isSuccess = isSuccess;
    }

    /**
     * 默认的构造方法
     */
    public Result(){

    }

    /**
     * 新增一个返回结果
     */
    public Object addDefaultModel(Object obj){
        return result.put(DEFAULT_MODEL_KEY,obj);
    }

    /**
     * 新增一个带key的返回结果
     */
    public Object addDefaultModel(String key,Object obj){
        modelKey = key;
        return result.put(key,obj);
    }

    /**
     * 取出所有key
     */
    public Set<String> keySet(){
        return result.keySet();
    }

    /**
     * 取出整个map对象
     */
    public Map<String,Object> getMap(){
        return result;
    }

    /**
     * 取出默认的值
     */
    public Object get(){
        return result.get(modelKey);
    }

    /**
     * 取出值
     */
    public Object get(String key){
        return result.get(key);
    }

    /**
     * 取出值集合
     */
    public Collection values(){
        return result.values();
    }

    /**
     * 返回是否成功
     */
    public boolean isSuccess(){
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public void setResultCode(String resultCode,String... args){
        this.resultCode = resultCode;
        this.resultCodeParams = args;
    }

    public String[] getResultCodeParams() {
        return resultCodeParams;
    }

    public void setResultCodeParams(String[] resultCodeParams) {
        this.resultCodeParams = resultCodeParams;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }
}
