package br.com.microsservico.consumidor.consumo;

import br.com.microsservico.consumidor.dto.PedidoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Processamento {

    @RabbitListener(queues ="${broker.queue.processamento.name}")
    public void processamentoQueue(PedidoDTO pedidoDTO){
        System.out.println(pedidoDTO.getDescricao());
    }
}
