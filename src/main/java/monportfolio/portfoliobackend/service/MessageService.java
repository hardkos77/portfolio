package monportfolio.portfoliobackend.service;

import monportfolio.portfoliobackend.entity.Message;
import monportfolio.portfoliobackend.repository.MessageRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message saveMessage(Message message) {
        return repository.save(message);
    }

    @Async
    public void notifyAdmin(Message message) {
        // Simule un traitement long ou une notification
        System.out.println("📩 Nouveau message reçu de : " + message.getSenderName());
        // TODO : notification WebSocket
    }
}
