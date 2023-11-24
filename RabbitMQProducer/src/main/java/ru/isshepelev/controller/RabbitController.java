package ru.isshepelev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.isshepelev.model.MessageModel;
import ru.isshepelev.rabbitmqproducerService.RabbitMqProducerService;

@RestController
public class RabbitController {
    private final RabbitMqProducerService rabbitMqProducerService;

    public RabbitController(RabbitMqProducerService rabbitMqProducerService) {
        this.rabbitMqProducerService = rabbitMqProducerService;
    }
    @GetMapping("/send")
    public void sendMessageToRabbit(@RequestBody MessageModel messageModel) {
        rabbitMqProducerService.sendMessage(messageModel.getMessage(), messageModel.getRoutingKey());
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
