package com.fqj.yuapiclientsdk;

import com.fqj.yuapiclientsdk.client.FqjApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("fqjapi.client")
@Data
@ComponentScan
public class FqjApiClientConfig {
	private String accessKey;
	private String secretKey;

	@Bean
	public FqjApiClient fqjApiClient(){
		return new FqjApiClient(accessKey,secretKey);

	}



}
