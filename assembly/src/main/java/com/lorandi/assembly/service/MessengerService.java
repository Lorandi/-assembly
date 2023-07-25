package com.lorandi.assembly.service;

import com.lorandi.assembly.dto.ResultDTO;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Service
@RequiredArgsConstructor
public class MessengerService {

        public void send(String message) throws IOException, TimeoutException {
            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            channel.basicPublish("", "Queue-1", null, message.getBytes());

            channel.close();
            connection.close();
        }

        public void consumer() throws IOException, TimeoutException {
            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println(" Message received '" + message) ;
            };

            channel.basicConsume("Queue-1", true, deliverCallback, consumerTag -> { });
        }

        public void propagateResult(ResultDTO resultDTO)  {
            try {
                ConnectionFactory factory = new ConnectionFactory();
                Connection connection = null;

                connection = factory.newConnection();
                Channel channel = connection.createChannel();

                JSONObject resultJson = new JSONObject();
                resultJson.put("surveyId", resultDTO.survey().id());
                resultJson.put("question", resultDTO.survey().question());
                resultJson.put("result", resultDTO.result());

                channel.basicPublish("", "Queue-1", null, resultJson.toString().getBytes());

                channel.close();
                connection.close();
            } catch (IOException | TimeoutException e) {
                throw new RuntimeException(e);
            }

        }


}
