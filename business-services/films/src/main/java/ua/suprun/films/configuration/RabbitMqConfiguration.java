package ua.suprun.films.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class RabbitMqConfiguration implementation.
 *
 * @author Bohdan_Suprun
 */
@Configuration
@EnableRabbit
public class RabbitMqConfiguration
{
    @Value("${application.amqp.get-films-by-id-queue-name}")
    private String queueName;
    @Value("${application.amqp.get-films-by-id-exchange-name}")
    private String exchangeName;

    @Bean
    public Queue getFilmsByIdQueue()
    {
        return new Queue(queueName);
    }

    @Bean
    public FanoutExchange getFilmsByIdExchange()
    {
        return new FanoutExchange(exchangeName);
    }

    @Bean
    public Binding getFilmsByIdBinding(Queue getFilmsByIdQueue, FanoutExchange fanoutExchange)
    {
        return BindingBuilder.bind(getFilmsByIdQueue).to(fanoutExchange);
    }

    @Bean
    public Jackson2JsonMessageConverter jacksonConverter()
    {
        return new Jackson2JsonMessageConverter();
    }
}
