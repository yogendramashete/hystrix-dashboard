package poc.yogendra.hystrixdashboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
class HystrixDashboardApplication

fun main(args: Array<String>) {
	runApplication<HystrixDashboardApplication>(*args)
}
