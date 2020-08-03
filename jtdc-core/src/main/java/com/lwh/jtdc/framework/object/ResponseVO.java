package com.lwh.jtdc.framework.object;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lwh.jtdc.business.enums.ResponseStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;
import java.util.List;

/**
 * controller返回json
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResponseVO<T> {
    private Integer status;
    private String message;
    private T data;

    public ResponseVO(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseVO(ResponseStatus status, T data) {
        this(status.getCode(), status.getMessage(), data);
    }

    public String toJson() {
        T t = this.getData();
        if (t instanceof List || t instanceof Collection) {
            return JSONObject.toJSONString(this, SerializerFeature.WriteNullListAsEmpty);
        } else {
            return JSONObject.toJSONString(this, SerializerFeature.WriteMapNullValue);
        }
    }
}
