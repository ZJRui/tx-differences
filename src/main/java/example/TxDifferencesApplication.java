package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * If the above is bootstrapped with standard @EnableTransactionManagement the instances handed to the constructor of Invoker are JDK proxies and the lookup of the advice chain results in the interceptor for transactions being returned and thus activated. If proxyTargetClass is set to true, the instances received by the constructor are CGLib proxies and the lookup of the advice chain results in an empty one and thus no transaction is created in the first place.
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class TxDifferencesApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(TxDifferencesApplication.class, args);
		
		System.in.read();
	}
}
