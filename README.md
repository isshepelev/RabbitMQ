# Описание проекта RabbitMQ

## Что делает

Данный проект представляет собой пример применения RabbitMQ для организации асинхронной коммуникации между компонентами системы. Он реализует отправку и получение сообщений через брокер сообщений RabbitMQ с использованием Spring AMQP.

## Решаемые проблемы

1. **Асинхронная коммуникация:** Проект позволяет компонентам системы обмениваться сообщениями асинхронно, улучшая отзывчивость системы и её масштабируемость.
2. **Обработка сообщений:** С помощью обработчиков и слушателей (`RabbitListener`) система может эффективно обрабатывать поступающие сообщения из очередей.
3. **Использование Docker:** Предоставляется файл `docker-compose.yaml`, который позволяет легко развернуть и запустить RabbitMQ с предварительно настроенными параметрами.

## Зачем это нужно

- **Улучшение архитектуры приложения:** Использование очередей сообщений помогает улучшить распределение нагрузки и сделать систему более отказоустойчивой.
- **Разработка в условиях микросервисной архитектуры:** RabbitMQ обеспечивает эффективный обмен сообщениями между микросервисами.

---

Пример кода и конфигурации представлен в репозитории, включая классы конфигурации для RabbitMQ, контроллеры, сервисы и модели сообщений, а также файл `docker-compose.yaml` для развертывания RabbitMQ с предустановленными параметрами.