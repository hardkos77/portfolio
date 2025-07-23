package monportfolio.portfoliobackend.service;

import monportfolio.portfoliobackend.model.UnavailableSlot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleCalendarService {

    public List<UnavailableSlot> fetchBusySlots() {
        // TODO : Intégrer l’appel réel à Google Calendar via OAuth2
        return List.of(); // temporairement vide
    }
}
