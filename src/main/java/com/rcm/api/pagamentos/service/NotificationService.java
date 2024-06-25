package com.rcm.api.pagamentos.service;

import com.rcm.api.pagamentos.client.NotificationClient;
import com.rcm.api.pagamentos.entity.Transfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final NotificationClient notificationClient;

    public NotificationService(NotificationClient notificationClient) {
        this.notificationClient = notificationClient;
    }

    public void sendNotification(Transfer transfer) {

        try {
            logger.info("Enviando notificação..");

            var resp = notificationClient.sendNotification(transfer);

            if (resp.getStatusCode().isError()) {
                logger.error("Erro ao enviar a notificação, status code não está OK");
            }

        } catch (Exception e) {
            logger.error("Error ao enviar a notificação", e);
        }
    }
}
