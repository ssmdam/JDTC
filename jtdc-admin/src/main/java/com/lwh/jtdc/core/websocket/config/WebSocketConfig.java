package com.lwh.jtdc.core.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * websocket配置类
 *
 * @author Chris luo 201635020423
 * @since 1.0
 */
@Configuration
public class WebSocketConfig {

    /**
     * ServerEndpointExporter会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
