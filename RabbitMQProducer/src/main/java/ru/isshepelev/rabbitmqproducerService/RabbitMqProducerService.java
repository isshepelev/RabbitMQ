package ru.isshepelev.rabbitmqproducerService;

public interface RabbitMqProducerService {
    void sendMessage(String message, String routingKey);

}
