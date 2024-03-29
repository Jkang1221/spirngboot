package com.example.controller.utils;

import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag) {
        this.flag = flag;
        data = null;
    }

    public R() {
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
