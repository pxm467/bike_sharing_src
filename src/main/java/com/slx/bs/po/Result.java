package com.slx.bs.po;


 class  ResultCode {
     final static int SUCCESS =0;//执行成功
     final static  int FAIL = -1;//执行失败
}

public class Result {
    private Object data;
    private int code ;
    private String msg;

     public static Result newInstance() {
        return new Result();
    }

    public Result success(){
        this.code = ResultCode.SUCCESS;
        this.msg = "操作成功";
        return  this;
    }
    public Result failure(){
        this.code = ResultCode.FAIL;
        this.msg = "操作失败";
        return  this;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
