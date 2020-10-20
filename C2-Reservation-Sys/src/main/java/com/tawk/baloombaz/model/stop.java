package com.tawk.baloombaz.model;

import org.springframework.data.annotation.Id;

class Stop {

    public Stop(String id, String code, String name, String detail) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.detail = detail;
    }

    private String id;

    private String code;

    private String name;

    private String detail;
}

