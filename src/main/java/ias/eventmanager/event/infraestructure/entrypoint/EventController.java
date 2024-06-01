package ias.eventmanager.event.infraestructure.entrypoint;

import ias.eventmanager.event.domain.model.EventModel;
import ias.eventmanager.event.domain.usecase.EventUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EventController {

    private final EventUseCase eventUseCase;

    @GetMapping("events")
    public Flux<EventModel> listEvents()
    {
        return eventUseCase.findAll();
    }

}
