package org.hzero.train.todoservice;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
// 开启资源认证、关闭 Security 安全认证
@EnableChoerodonResourceServer
public class TodoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoServiceApplication.class, args);
    }


    @GetMapping
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @ApiOperation(value = "/demo")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello hzero,I`m Iron Man!", HttpStatus.OK);
    }
}
