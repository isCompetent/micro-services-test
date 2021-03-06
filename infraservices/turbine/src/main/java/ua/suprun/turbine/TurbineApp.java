package ua.suprun.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Class TurbineApp implementation.
 *
 * @author Bohdan_Suprun
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbineStream
@EnableEurekaClient
public class TurbineApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(TurbineApp.class, args);
    }
}
