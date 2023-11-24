package ru.isshepelev.rabbitmqproducerService.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import ru.isshepelev.rabbitmqproducerService.RabbitMqProducerService;

@Service
public class RabbitMQProducerServiceImpl implements RabbitMqProducerService {
    private final RabbitTemplate rabbitTemplate;

    public RabbitMQProducerServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMessage(String message, String routingKey) {
        rabbitTemplate.convertAndSend("testExchange", routingKey, message);
    }
}
