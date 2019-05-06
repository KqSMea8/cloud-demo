/*
package com.wsyy.gateway.server.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


*/
/**
 * @author songYu
 * Created on 2018/10/17 9:35
 * DESC : 鉴权过滤器
 *//*

@Component
@Slf4j
public class AuthFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // 获取请求
//        ServerHttpRequest request = exchange.getRequest();
//        // 获取响应
//        ServerHttpResponse response = exchange.getResponse();
//
//
//        // 获取请求头内token
//        String token = request.getHeaders().getFirst(RequestHeaderKey.TOKEN);
//        //设置Token
//        exchange.getResponse().getHeaders().add(RequestHeaderKey.TOKEN,token+"999");


//        //向headers中放文件，记得build
//        ServerHttpRequest host = exchange.getRequest().mutate().header(RequestHeaderKey.TOKEN,token).build();
//        //将现在的request 变成 change对象
//        ServerWebExchange build = exchange.mutate().request(host).build();

        //返回401状态码和提示信息
//        if (StringUtils.isBlank(token)) {
//            ServerHttpResponse response = exchange.getResponse();
//            JSONObject message = new JSONObject();
//            message.put("status", -1);
//            message.put("data", "鉴权失败");
//            byte[] bits = message.toJSONString().getBytes(StandardCharsets.UTF_8);
//            DataBuffer buffer = response.bufferFactory().wrap(bits);
//            response.setStatusCode(HttpStatus.UNAUTHORIZED);
//            //指定编码，否则在浏览器中会中文乱码
//            response.getHeaders().add("Content-Type", "text/plain;charset=UTF-8");
//            return response.writeWith(Mono.just(buffer));
//        }

//        String token = exchange.getRequest().getQueryParams().getFirst("authToken");
//        //重定向(redirect)到登录页面
//        if (StringUtils.isBlank(token)) {
//            String url = "http://想跳转的网址";
//            ServerHttpResponse response = exchange.getResponse();
//            //303状态码表示由于请求对应的资源存在着另一个URI，应使用GET方法定向获取请求的资源
//            response.setStatusCode(HttpStatus.SEE_OTHER);
//            response.getHeaders().set(HttpHeaders.LOCATION, url);
//            return response.setComplete();
//        }
//        return chain.filter(exchange);


        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -200;
    }

}
*/
