package com.example.index_market.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data <T> {
    protected T data;

    protected AppError error;

    protected boolean success;

    private Long totalCount;

    public Data(boolean success) {
        this.success = success;
    }

    public Data(T data) {
        this.data = data;
        this.success = true;
    }

    public Data(AppError error) {
        this.error = error;
        this.success = false;
    }

    public Data(T data, Long totalCount) {
        this.data = data;
        this.success = true;
        this.totalCount = totalCount;
    }
}
